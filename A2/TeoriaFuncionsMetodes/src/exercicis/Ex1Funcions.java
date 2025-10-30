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
public class Ex1Funcions {

    /**
     * 1.	Programa que demana a l’usuari dos números reals i mostra el seu producte. Cal implementar 
     * el mètode double producte(double x, double y), el qual retorna el producte dels arguments passats com a paràmetres.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        
        /*System.out.print("Pon el numero 1: ");
        
        num1= sc.nextDouble();*/
        num1 = pedirNumero(1);
        num2= pedirNumero(2);
        
        resultado = producte(num1, num2);
        
        System.out.println("La multiplicación es " + resultado);

    }
    
    public static double producte(double x, double y)
    {
        double multi = x*y;
        return multi;
    }
    
    public static double pedirNumero(int x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el numero " + x + " :");
        double valor = sc.nextDouble();
        return valor;
    }
    
}
