/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1examenparellssenars;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2NotaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, acum_nota=0, contador_valides=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nota "+ i + ":");
            nota = sc.nextInt();
            if (nota!=-1)
            {
                 acum_nota += nota; //acum_nota = acum_nota + nota;
                contador_valides++;
            } 
        }
        
        System.out.println("Notes valides :" + contador_valides);
        System.out.println("Notes total   :" + acum_nota);
        double mitja = (double)  acum_nota/contador_valides;
        System.out.println("Mitja: " + mitja);
    }
    
}
