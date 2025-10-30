/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1examenparellssenars;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3VidaMonstre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int dany;
        int vida_monstre = rd.nextInt(20, 101);
        System.out.print("Quin caracter serà la vida? ");
        char caracter = sc.next().charAt(0);
        
        do
        {
            System.out.print("vida "+ vida_monstre + ":");
            for (int i = 1; i <= vida_monstre; i++) {
                System.out.print(caracter);
            }
            System.out.println(""); //salto de linea
            System.out.print("Quanta vida li vols restar? ");
            dany = sc.nextInt();
            vida_monstre = vida_monstre - dany;
        } while(vida_monstre>0);
        
        System.out.println("El monstre ha mort!");
    }
    
}
