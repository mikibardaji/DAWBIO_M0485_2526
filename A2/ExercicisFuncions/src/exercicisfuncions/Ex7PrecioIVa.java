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
public class Ex7PrecioIVa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio, precio_iva;
        
        do
        {
            precio = pedirNumero("Pon el precio sin IVA (0 para terminar): ");
            precio_iva = preuAmbIva(precio);    
            System.out.println("EL precio con IVA es " + precio_iva);   
        }while(precio!=0);
        
        System.out.println("Terminando programa");
    }
    
//    public static float preuAmbIva(float preu)
//    {
//        float iva = preu * 0.21f;
//    }
    
    public static double preuAmbIva(double preu)
    {
        double iva = preu * 0.21;
        return (preu + iva);
    }
    
    public static double pedirNumero(String frase){
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        return  sc.nextDouble();
    }
}
