/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayaleatori;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ArrayAleatori {

    /**
     * Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio
entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le preguntará al usuario qué
posición del vector quiere mostrar por pantalla, repitiéndose una y otra vez hasta que se
introduzca un valor negativo. Maneja todas las posibles excepciones.
     */
    public static void main(String[] args) {
        Random rd = new Random();
        int[] valores = new int[rd.nextInt(1, 101)];
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Plenant posicio " + i);
            valores[i] = rd.nextInt(1, 11);
        }
        int posicion=0;
        Scanner sc = new Scanner(System.in);
        do
        {
            try
            {
                System.out.println("Dime que posicion quieres visualizar");
                posicion = sc.nextInt();
                if (posicion>=0)
                {
                    System.out.println("en la posicion " + posicion 
                + " tienes el valor " + valores[posicion]);
                }
            }catch(InputMismatchException e)
            {
                System.out.println("No has posat un valor enter");
                System.out.println(e.getMessage());
                sc.nextLine();
                System.out.println("Dime que posicion quieres visualizar");
                posicion = sc.nextInt();
            }catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Has ficat una posicio que no existeix "
                + posicion);
                System.out.println(ex.getMessage());
                
            }catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            
        }while (posicion>=0);
    }
    
}
