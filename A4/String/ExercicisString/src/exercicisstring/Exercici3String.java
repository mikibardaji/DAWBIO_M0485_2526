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
public class Exercici3String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);

        // Llegim les dades
        System.out.print("Introdueix nom: ");
        String nom = sc.nextLine();

        System.out.print("Introdueix primer cognom: ");
        String cognom1 = sc.nextLine();

        System.out.print("Introdueix segon cognom: ");
        String cognom2 = sc.nextLine();

        // Concatenacio
        String codi = nom.substring(0, 3).concat(cognom1.substring(0, 3).concat(cognom2.substring(0, 3)));

        // Passem a majúscules
        codi = codi.toUpperCase();

        // Mostrem el codi
        System.out.println("Codi d'usuari: " + codi);

        sc.close();
    }
    
}
