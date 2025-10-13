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
public class DosisWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dosi;
        System.out.println("Quantes dosis necessites? ");
        dosi = sc.nextInt();
        int dosis = dosi;
        do
        {
            dosi--;
            if (dosi!=0)
            {
                System.out.println("Dosis administrada t'en falten: " + (dosi) + "...");
            }
            else
            {
               System.out.println("Ja estas curat! :)"); 
            }
            
        }while (dosi!=0);
        
        int hora=1;
         for (; dosis > 0; dosis = dosis - 1) {
            System.out.println(hora + "hs te quedan por tomar " + dosis + " dosis");
            hora = hora + 1; 
        }

        System.out.println("Ya estas curado!!");
        
        }
    
}
