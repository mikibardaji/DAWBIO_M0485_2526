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
public class Ex4Bucles {

    /**
     * 3.	Programa que entra un número natural N i 
     * mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 1 en 1.
     */
    public static void main(String[] args) {
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica el numero top");
        int top = sc.nextInt();
        
        for (contador=1; contador <= top; contador++) 
        {
            if (contador%2 == 0)
            {
                System.out.println(contador);
            }
        }
        
        
    }
    
}
