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
public class PedirEnterosHasta30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedirte valores y los vas sumando hasta que superen 30
        Scanner sc = new Scanner(System.in);
        int valor=0;
        int acum_suma = 0;
        while(acum_suma<30)
        { //opcion con while
            System.out.print("Pon un valor y los ire sumando.... ");
            valor = sc.nextInt();
            System.out.println("Acumulado-> " + acum_suma + " valor introducido-> " + valor);
            acum_suma = acum_suma + valor; //operacion con variable acumulable
            System.out.println("Acumulado-> " + acum_suma + " valor introducido-> " + valor);
        } 
        
        //solucion 2 con do while
        acum_suma = 0;
        do{
            System.out.print("Pon un valor y los ire sumando.... ");
            valor = sc.nextInt();
            System.out.println("Acumulado-> " + acum_suma + " valor introducido-> " + valor);
            acum_suma = acum_suma + valor; //operacion con variable acumulable
            System.out.println("Acumulado-> " + acum_suma + " valor introducido-> " + valor);            
        }while(acum_suma<30);
        
        
    }
    
}
