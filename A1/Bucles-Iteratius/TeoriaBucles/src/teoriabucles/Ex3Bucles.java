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
public class Ex3Bucles {

    /**
     * 3.	Programa que entra un número natural N i 
     * mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.
     */
    public static void main(String[] args) {
        int contador = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica el numero top");
        int top = sc.nextInt();
        
        while (contador<=top)
        {
            System.out.println(contador);
            contador += 2;
        }
        
    }
    
}
