/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3maximminim;

import java.util.Random;

/**
 * Crea un programa que pida veinte números reales por teclado 
 * ( o los ponga un aleatorio) , 
 * los almacene en un array, 
 * y luego lo recorra para averiguar el máximo. 
 * Una vez el máximo está bien también acabe encontrando el mínimo. Y mostrarlos por pantalla.
 * @author mabardaji
 */
public class Ex3MaximMinim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[20];
        //int minimo=0, maximo=100;
        llenarNumerosAleatorios(numeros);
        mostrarAleatorios(numeros);
        buscarValorMaximo(numeros);
        //System.out.println("El valor maximo es " + maximo);
        //System.out.println("El valor minimo es " + minimo);
    }
    
    
    public static void llenarNumerosAleatorios(int[] valores)
    {
        Random rd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt(0, 101);
        }
    }

    /* mostrar tdoas las posiciones por consola */
    private static void mostrarAleatorios(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "-");
        }
        System.out.println("");
    }
    
    private static void buscarValorMaximo(int[] digitos)
    {
        int maximo = digitos[0]; //este segura existe este numero y
        //del primero es el maximo (y minimo)
        int minimo = digitos[0];
        for (int i = 0; i < digitos.length; i++) { //recorro todo por que hasta el
            //no puedo saber quien es el maximo
            if(digitos[i]>maximo)
            {
                maximo = digitos[i];
            }
            if (digitos[i]<minimo)
            {
                minimo = digitos[i];
            }
        }

    }
}
