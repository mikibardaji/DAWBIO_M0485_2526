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
public class Ex3Major {

    /**
     * 3.	Programa que demana a l’usuari dos números enters i mostra quin és el menor.
     * Cal implementar i usar el mètode int menor(int x, int y), 
     *  el qual retorna el menor dels dos passats com a paràmetres.
     */
    public static void main(String[] args) {
        int v1, v2;
        
        v1 = pedirValor(1);
        v2 = pedirValor(2);
       
        int min = menor(v1, v2);
        mostrarMasPequenyo(min);

    }
    
    public static int menor(int x,int y)
    {
        int minimo;
        if (x<y)
        {
            minimo = x;
        }
        else
        {
            minimo = y;
        }
        return minimo;
    }
    
    public static int pedirValor(int x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el valor " + x +  ": ");
        int num = sc.nextInt();
        return num;
    }
    
    public static void mostrarMasPequenyo(int valor)
    {
        System.out.println("el pequeño es " + valor);
    }
    
}
