/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] valores = new int[5];
       Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < 6; i++) {
            try
            {
                System.out.println("Pon el valor para " + i);
                valores[i] = sc.nextInt();
            }
            catch(IndexOutOfBoundsException ex)
            {
                System.out.println("La posicion " + i + " no es valida");
            }
            
        }
    }
    
}
