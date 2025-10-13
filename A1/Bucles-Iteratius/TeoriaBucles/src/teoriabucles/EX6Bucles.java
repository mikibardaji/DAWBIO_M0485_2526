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
public class EX6Bucles {

    /**
     * 6.	El programa llegeix 10 valors de tensió arterial 
     * (no nuls) i, en acabar, mostra un missatge 
     * indicant si s’ha detectat algun valor crític —és a dir, 
     * si algun valor ha estat negatiu, 
     * cosa que indicaria un error de mesura o un pacient fictici. 
     */
    public static void main(String[] args) {
        int tensio;
        int contador=1;
        Scanner sc = new Scanner(System.in);
        //int negatiu=0;
        boolean negatiu = false;
        do
        {
            System.out.print("Posa la tensio arterial: ");
            tensio = sc.nextInt();
            contador++;
            if (tensio<0 && negatiu==false)
            {
                negatiu = true;
            }
        }while(contador<=5); //salir cuando encuentre negatiu o ponga 5 while(contador<=5 && negatiu==false);
        
        if (negatiu==true)
        {
            System.out.println("Has introducido valor erroneo");
        }
        
        if (negatiu)
        {
            System.out.println("Has introducido valor erroneo");
        }
        
        
        
        
    }
    
}
