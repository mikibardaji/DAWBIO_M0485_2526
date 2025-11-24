/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examena2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenEx2 {
    
    
    
    public static int demanarCredit()
    {
        Scanner sc = new Scanner(System.in);
        int diners;
        do
        {   
            System.out.print("Quants diners tens disponibles per comprar jocs?: ");
            diners=sc.nextInt();
            if (diners<=0)
            {
                System.out.println("Torna a provar i intrdueix un valor vàlid i supeiori a zero!!");
            }
        }while(diners<=0);
        //System.out.println("Tens "+ diners + "euros disponibles");
        return diners;
    }
    
    
    public static double aplicarDesconte(double preu,int categoria){
       double descompte = 0;
       if (categoria ==1) {   
        descompte = preu *0.5;
       }else if (categoria ==2 ) {
        descompte = preu*0.25;
       }else{
        System.out.println("se mantiene");
       }
       preu = preu - descompte;
       return preu;
        }
    
    public static boolean podeuComprar(double preufinal, double saldo){
        //return saldo >= preufinal;
        boolean disponible = false;
        if (saldo >= preufinal) {
            disponible = true;
        }
        return disponible;
    }
   
    
    public static void afegirCompra(double precioJuego, double totalGastado) {
        totalGastado += precioJuego;
        System.out.println("El precio del juego es de: " + precioJuego);
        System.out.println("El total gastado en de: " + totalGastado);
    }
}


