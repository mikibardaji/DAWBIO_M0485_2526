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
public class Ex6Positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2, comparador;
     //   String frase;
        
//        frase = "Pedir Numero1; ";
//        n1= pedirNumero(frase);
        n1= pedirNumero("Pedir numero1: ");
        n2=pedirNumero("Pedir numero2: ");
        
        comparador = compara(n1, n2);
        
        mostrarResultado(comparador,n1,n2);
        
        
    }
    
    
    public static void mostrarResultado(int compara, int x, int y)
    {
        if (compara==-1)
            {
                System.out.println("El mas pequeño es" + x);
            }
        else if (compara==1)
                {
                  System.out.println("El mas pequeño es" + y);  
                }
        
       else
        {
            System.out.println("Los numeros son iguales");
        }
    }
    {
        
    }
    
    public static int pedirNumero(String frase){
          Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        return  sc.nextInt();
    }
    
    
    public static int compara(int x, int y){
       int compara ;
        if(x < y){
         compara =-1; 
        }else if(x > y){
        compara = 1;
        }
        else
        {
            compara = 0;
        }
        
        return compara;
    }    
    
    
}
