/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExMayorEdat {

    /**
     * 2.	Programa que demana a l’usuari una edat i indica si és major
     * d’edat (edat major o igual a 18 anys). 
     * Ha d’implementar un mètode amb el prototip boolean esMajorEdat(int edat).
     * 
     */
    public static void main(String[] args) {
       int edad;
       
       edad = pedirNumeroEnteroPositivo();
      
       boolean mayor = esMajorEdat(edad);
      
       mostrarSentenciaEdad(mayor);
    }
    
    public static boolean esMajorEdat(int edat)
    {
        boolean mayor;
        if (edat>=18)
        {
            //return true;
            mayor = true;
        }
        else
        {
            //return false;
            mayor=false;
        }
        return mayor;
    }
    
    public static int pedirNumeroEnteroPositivo()
    {
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.print("Pon tu edad:");
            valor = sc.nextInt();
        }while(valor<0);
        return valor;
    }
    
    public static void mostrarSentenciaEdad(boolean mayor)
            {
                   if (mayor==true)
                   {
                       System.out.println("Eres mayor de edad");
                   }
                   else
                   {
                       System.out.println("Eres menor de edad");
                   }
            }
    
}
