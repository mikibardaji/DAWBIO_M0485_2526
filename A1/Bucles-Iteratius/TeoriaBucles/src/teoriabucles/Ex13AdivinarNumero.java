/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex13AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        int usuario;
        Scanner sc = new Scanner(System.in);
        //•	Pensar el numero maquina (que lo muestre hasta  random)
        int maquina = rd.nextInt(1, 100);
        //System.out.println(maquina);
        int cont=0;
        //•	Pedir numero al usuario
        do{
            System.out.print("Pon el numero:");
            usuario = sc.nextInt();
            //o	Mas gradne cuando el numero del usuario < maquina
                if (usuario < maquina)
                {
                    System.out.println("El numero es mas grande");
                }
                else if (maquina<usuario)
                        { //o	Mas gradne cuando el numero del usuario < maquina
                            System.out.println("El numero es mas pequeño");
                        }
                //else if (maquina == usuario)
                cont++;
        }while(maquina!=usuario);
        
        System.out.println("Acertaste en " + cont + " veces");
        
    }
    
}
