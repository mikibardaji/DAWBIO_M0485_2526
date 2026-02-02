/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4positivosnegativos;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex4PositivosNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numerosPositivosNegativos = new int[15];
        
        llenarNumerosAleatorios(numerosPositivosNegativos);
        mostrarAleatorios(numerosPositivosNegativos);
        contarPositivosNegativos(numerosPositivosNegativos);
    }
    
     public static void llenarNumerosAleatorios(int[] valores)
    {
        Random rd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt(-50, 51);
        }
    }

    /* mostrar tdoas las posiciones por consola */
    private static void mostrarAleatorios(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "*");
        }
        System.out.println("");
    }

    /** tiene que buscar en todo el array y contabilizar los positivos
     */
    private static void contarPositivosNegativos(int[] numPN) {
        int cont_pos=0, cont_neg=0;
        int acum_pos=0, acum_neg=0;
        for (int i = 0; i < numPN.length; i++) {
            if (numPN[i]>0)
            {
                acum_pos += numPN[i];
                cont_pos++;
            }
            else if (numPN[i]<0)
            {
                acum_neg += numPN[i];
                cont_neg--;
            }    
        }
        System.out.println("Positivos : " + cont_pos + " y suman " + acum_pos);
        System.out.println("Negativos : " +  cont_neg + " y suman " + acum_neg);
    }
    
}
