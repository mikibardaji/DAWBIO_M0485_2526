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
public class Exercici2String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Llegim la primera cadena
        System.out.print("Introdueix la primera cadena: ");
        String cadena1 = sc.nextLine();

        // Llegim la segona cadena
        System.out.print("Introdueix la segona cadena: ");
        String cadena2 = sc.nextLine();

        // Comparació exacta
        if (cadena1.equals(cadena2)) {
            System.out.println("Són iguals (");
        } else {
            System.out.println("No són iguals");
        }

        // Comparació sense tenir en compte majúscules
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Són iguals sense contar majuscules i minuscules");
        } else {
            System.out.println("No són iguals");
        }

        sc.close();
    }
    
}
