/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionsteoria2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class ExceptionsTeoria2 {

    /**
     *Implementa un programa con tres funciones:
    ? void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
    ? void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0
    ? La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con
    distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las
    funciones, etc. Maneja las posibles excepciones.

     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor");
        int num = sc.nextInt();
        
        try {
            imprimePositivo(num);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " " + num);
        }
        
        try
        {
            imprimeNegativo(num);
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage() + " " + num);
        }
    }
    
    public static void imprimePositivo(int p) throws Exception
    {
        if (p>=0)
        {
            System.out.println(p);
        }
        else //numero negativo
        {
            throw new Exception("El numero no pot ser negatiu");
        }
    }
    
    public static void imprimeNegativo(int p) throws Exception
    {
        if (p<0)
        {
            System.out.println("-> " + p);
        }
        else
        {
            throw new Exception("No puede ser 0 o positivo");
        }
    }
}
