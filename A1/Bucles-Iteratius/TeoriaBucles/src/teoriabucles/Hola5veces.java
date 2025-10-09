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
public class Hola5veces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;
//        System.out.println("Cuantas veces quieres que te salude");
//        int veces = sc.nextInt();
//        for (contador = 0; contador < veces; contador = contador + 1) {
//            System.out.println("Hola");
//        }
//        
//        System.out.println("Imprime contador " + contador);
//        
//        contador = 0;
//        while (contador<veces)
//        {
//            System.out.println("Hola");
//            contador++;
//        }
        
        System.out.println("=======Contador==========");
        for (contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }
        
        for(contador=10;contador>=0;contador = contador - 1)
        {
            System.out.println(contador);
        }
        
        
        
    }
    
}
