/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriavectores;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int[] notas; //declaració
        //int notas1[];
        Scanner sc = new Scanner(System.in);
        notas = new int[10];
        //posicions 0,1,2,....9
        notas[0] = 6;
        notas[1] = 7;
        notas[5] = 3;
        notas[4] = 10;
        int i;
        for (i = 0; i < notas.length; i++) {
            System.out.print("Pon el valor de la posición " + i + ": ");
            notas[i] = sc.nextInt();
        }
     
        i = 0;
        while (i < notas.length)
        {
            System.out.print("Pon el valor de la posición " + i + ": ");
            notas[i] = sc.nextInt();
            i++;
        }
     
        System.out.println("array " + notas);
        System.out.println("nota 1 " + notas[0]);
        for (i = 0; i < notas.length; i++) {
            System.out.println("nota -> " + i + "- " + notas[i]); 
            Thread.sleep(500);
        }
        /*
        char[] letras = new char[5];
        letras[2] = 'a';
        letras[4] = 'd';
        for (int i = 0; i < letras.length; i++) {
            System.out.println("letra -> " + i + "- " + letras[i]); 
            Thread.sleep(500);
        } */       
        
        
        
    }
    
}
