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
public class Ex10Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double temp;
            int intentos = 0;
            double minimo=40; //Le pongo un valor mas grande para que el primero que compare seguro sea minimo
            double maximo=33;
            
            do{
                System.out.print("Introduce la temperatura: ");
                temp = Math.random()*6+34; //generi aleatoriament entre 34 i 39
                System.out.println(temp);
                intentos++;
                //Actualiza esa variable dentro del bucle: 
                //Cada vez que generes un nuevo número,
                //compáralo con el valor almacenado y actualiza el mínimo si es necesario.
                if (minimo>temp)
                {
                    minimo = temp;
                }
                if (maximo<temp && temp<38.5)
                {
                    maximo = temp;
                }
            }while(temp<38.5);
            
            
            System.out.println("Has tardado " + intentos + " veces");
            System.out.println("El minimo es " + minimo);
            System.out.println("El maximo es " + minimo);
    }
    
}
