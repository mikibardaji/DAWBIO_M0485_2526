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
        
        double num1, num2, resultado;
     
        num1 = pedirNumeroPositivo(1);
        num2= pedirNumeroPositivo(2);
        
        resultado = producte(num1, num2);
        
        mostrarResultado(resultado);

    }
    
    public static double producte(double x, double y)
    {
        double multi = x*y;
        return multi;
    }
    
    public static double pedirNumeroPositivo(int x)
    {
        Scanner sc = new Scanner(System.in);
        double valor;
        do{
            System.out.print("Pon el numero " + x + " positivo:");
            valor = sc.nextDouble();
        }while(valor<0);
        return valor;
    }
    
    public static void mostrarResultado(double x)
    {
        System.out.println("La multiplicación es " + x);
    }    
}
