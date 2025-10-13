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
public class Ex7Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tensio;
        int contador=1;
        Scanner sc = new Scanner(System.in);
        int negatiu=0;

        do
        {
            System.out.print("Posa la tensio arterial: ");
            tensio = sc.nextInt();
            contador++;
            if (tensio<0)
            {
                negatiu++;
            }
        }while(contador<=5); //salir cuando encuentre negatiu o ponga 5 while(contador<=5 && negatiu==false);
        
        if (negatiu>0)
        {
            System.out.println("Has introducido valor erroneo");
        }
        


    }
    
}
