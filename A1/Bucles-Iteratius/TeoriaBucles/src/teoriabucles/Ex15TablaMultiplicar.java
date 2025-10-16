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
public class Ex15TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la tabla que quieres");
        int tabla = sc.nextInt();
        int multi;
        for (int cont = 1; cont <= 10; cont++) {
            multi = tabla * cont;
            System.out.println(tabla + "X" + cont + "=" + multi);
            //System.out.println(tabla + "X" + cont + "=" + (tabla * cont);
        }

        for(tabla=1;tabla <=10; tabla++)
        {
            for (int cont = 1; cont <= 10; cont++) {
            multi = tabla * cont;
            System.out.println(tabla + "X" + cont + "=" + multi);
            //System.out.println(tabla + "X" + cont + "=" + (tabla * cont);
            }
            System.out.println("======================");
        }
                
        
        
        
    }
    
}
