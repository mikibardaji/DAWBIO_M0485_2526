/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class HolaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char continuo;
       
//       do{
//           System.out.println("Hola...");
//           System.out.print("Vols que et torni a saludar? ");
//           continuo = sc.next().charAt(0);
//           //s i si fico n para
//       }while(continuo=='s' || continuo == 'S');
//        System.out.println("Hola... ");
//        System.out.print("Vols que et torni a saludar? ");
//        continuo = sc.next().charAt(0);
        continuo='s';
        //TO DO
        while(continuo=='s')
        {
            System.out.println("Hola... ");
            System.out.print("Vols que et torni a saludar? ");
            continuo = sc.next().charAt(0);
        }
    }
    
}
