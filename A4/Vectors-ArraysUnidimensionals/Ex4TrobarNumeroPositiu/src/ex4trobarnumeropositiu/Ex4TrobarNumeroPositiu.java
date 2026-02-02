/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4trobarnumeropositiu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4TrobarNumeroPositiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] aleatorios = new int[15];
        
        llenarNumerosAleatorios(aleatorios);
        mostrarAleatorios(aleatorios);
        buscarNumeroSuperior(aleatorios);
    }
    
    public static void llenarNumerosAleatorios(int[] valores)
    {
        Random rd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt(0, 21);
        }
    }

    /* mostrar tdoas las posiciones por consola */
    private static void mostrarAleatorios(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "-");
        }
        System.out.println("");
    }  

    private static void buscarNumeroSuperior(int[] aleatorios) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Pon un numero y encontrare si hay uno igual o superior");
           int num = sc.nextInt();
           boolean trobat = false;
           int indice = 0;
           int posi=-1;
           do
           {
              if(aleatorios[indice]>num) //supera al 17 o al num 
              {
                  posi = indice; //para guardar en que posicion esta el valor
                  trobat = true;
              }
              else
              {
                  indice++; //siguiente posicion array
              }
           //}while(indice< aleatorios.length && trobat==false)
               
           }while(indice< aleatorios.length && !trobat);
           
           if (trobat)
           {
               System.out.println("El valor que supera a " + num + " esta en la posicion " + (indice+1) ) ;
               System.out.println("El valor es " + aleatorios[indice]);
           }
           else
           {
               System.out.println("No hay ninguna posicion que supere a " + num);
           }
    }
}
