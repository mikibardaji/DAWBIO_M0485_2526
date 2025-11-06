/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisfuncions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex11TaulesMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = pedirNumero("Pon un numero y te dare la tabla: ");
        
        taulesMultiplicar(numero);
        
        
    }
    
    
    public static void taulesMultiplicar(int num)
    {
        System.out.println("***** Taula del :" + num + "*****");
//        int result;
        for (int i = 1; i <= 10; i++) {
//            result = i*num;
//            System.out.println(num+"x"+i+"="+result);
            System.out.println(num+"x"+i+"="+(i*num));
        }
    }
    
    public static int pedirNumero(String frase){
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do{
        System.out.print(frase);
        numero = sc.nextInt();
        }while(numero<0 || numero>10);
        
        return  numero;
    }
    
    
}
