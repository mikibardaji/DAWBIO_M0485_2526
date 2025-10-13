/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaraleatoris;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class GenerarAleatoris {

    /**
     * @G
     */
    public static void main(String[] args) {
        // Generar numeros aleatorios entre 1 y 10
        Random rd = new Random();
        int num;
        
        for (int i = 0; i < 5; i++) {
            num = rd.nextInt(1, 11);
            System.out.println(num);
        }
        System.out.println("del 100 al 200");
        for (int i = 0; i < 5; i++) {
            num = rd.nextInt(100, 201);
            System.out.println(num);
        }

        System.out.println("del -10 al -1");
        for (int i = 0; i < 5; i++) {
            num = rd.nextInt(-10, 0);
            System.out.println(num);
        }        
        
        System.out.println("Numeros aleatorios con decimales 1 al 10");
        for (int i = 0; i < 5; i++) {
            double decimal = Math.random()*10 + 1; //le sumo el valor minimo
            System.out.println(decimal);
        }        
        System.out.println("Numeros aleatorios con decimales 1 al 10");
        for (int i = 0; i < 5; i++) {
            double decimal = (int) Math.random()*10 + 1; //le sumo el valor minimo
            System.out.println(decimal);
        }        

    }
    
}
