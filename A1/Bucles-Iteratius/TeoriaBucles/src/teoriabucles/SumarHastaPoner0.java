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
public class SumarHastaPoner0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valor=0;
        int acum_suma = 0;
        
        
//        do
//        {
//            System.out.print("Pon un valor y los ire sumando (0 para parar).... ");
//            valor = sc.nextInt();
//            acum_suma = acum_suma + valor;
//            System.out.println("Acumulado" + acum_suma);
//        }while(valor!=0); //acum_suma<30) valor = 0
        boolean continuo = true; //contnuo
        int voltes=0;
        do
        {
            
            System.out.print("Pon un valor y los ire sumando (0 para parar).... ");
            valor = sc.nextInt();
            acum_suma = acum_suma + valor;
            System.out.println("Acumulado" + acum_suma);
            if (valor==0)
            {
                continuo = false;
            }
            else
            {
                voltes++; //per adonar-se que estic dins del bucle
            }
        }while(continuo==true); //acum_suma<30) valor = 0

        //voltes = voltes -1; //asi no cuento el 0
        System.out.println("Has ficat " + voltes + " numeros");
    }
    
}
