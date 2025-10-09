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
public class TeoriaBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Escriura 10 vegades la frase hola
       int contador=1;
       while(contador<=5)
       {//ha d'haver alguna linea del codi 
        //que modifiqui alguna variable de la condicio bucle
           System.out.println("Hola " + contador);
           contador = contador + 1;
           //++contador; //
           //contador += 1;
       }
       Scanner sc = new Scanner(System.in);
       char continuo;
       
       do{
           System.out.println("Hola...");
           System.out.print("Vols que et torni a saludar? ");
           continuo = sc.next().charAt(0);
           //s i si fico n para
       }while(continuo=='s' || continuo == 'S');
       
       
       
       
    }
    
}
