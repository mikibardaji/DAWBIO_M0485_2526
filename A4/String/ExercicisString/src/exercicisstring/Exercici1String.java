/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisstring;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici1String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce una cadena de texto: ");
            String texto = sc.nextLine();

            // Separamos la cadena por espacios
            String[] palabras = texto.split(" "); //EL CARACTER ES ESPAI

            System.out.println("paraules " + palabras.length);
            // Mostramos cada palabra en una línea distinta
            for (String palabra : palabras) {
                System.out.println(palabra);
            }

            sc.close();
        }
    
    
    
}
