/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int[] notas; //declaració
        //int notas1[];
        notas = new int[10];
        
        //introducirNotas(notas);
        introducirNotasAleatorias(notas);
        //introducirDatos(notas, sc);
        //mostra els valors del array
        mostrarArray(notas);

        //funcio que conti quants suspesos hi ha i el mostri
        contarSuspendidos(notas);
        
    }
    
    public static void mostrarArray(int[] valores)
    {
        int i;
        for (i = 0; i < valores.length; i++) {
            System.out.println("nota -> " + i + "- " + valores[i]); 
        }
    }
    
    //public static void introducirNotas(int[] notas, Scanner sc)
    public static void introducirNotas(int[] notas)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < notas.length; i++) {
            System.out.print("Pon el valor de la posición " + i + ": ");
            notas[i] = sc.nextInt();
        }
    }

    public static void introducirNotasAleatorias(int[] notas)
    {
        Random rd = new Random();
        System.out.println("Introduciendo " + notas.length + " valores aleatorios... ");
        int i;
        for (i = 0; i < notas.length; i++) {
            notas[i] = rd.nextInt(0, 11);
        }
    }

    /**
     * Recorre todas las notas y al final dice cuantos suspendidos ha encontrado
     *  alguna variable para contar suspendidos
     * @param notas  todas las de entrada.
     */
    private static void contarSuspendidos(int[] notas) {
        int cont_suspendidos=0, cont_exc=0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]<5)
            {
               // System.out.println("suspes" + notas[i]);
                cont_suspendidos++;
            } 
            else if(notas[i]==10)
            {
                cont_exc++;
            }
        }
        
        System.out.println("alumnos suspendidos " + cont_suspendidos);
        /*cont_suspendidos=0;
        int j=0;
        while (j < notas.length)
        {
            j++;
           if(notas[j]<5 && j <notas.length)
               {
                System.out.println("suspes" + notas[i]);
                cont_suspendidos++;
            }
        }
        */
        
    }
    
    
    
}
