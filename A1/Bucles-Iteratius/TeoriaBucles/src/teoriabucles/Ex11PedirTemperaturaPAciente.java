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
public class Ex11PedirTemperaturaPAciente {

    /**
     * @param args the command line arguments
     * Ha de comprovar que la temperatura sigui numèrica i raonable, 
     * és a dir, entre 30 °C i 45 °C (ambdós inclosos).
     */
    public static void main(String[] args) {
        String name;
        double temperature;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        System.out.print("Que nombre tiene el paciente? ");
        name = sc.nextLine();
        do{
        System.out.print("Que temperatura tiene: ");
        temperature = sc.nextDouble(); //correcte este entre 30 y 45 => temperature >= 30 && temperature <=45
        if (temperature >= 30 && temperature <=45)
        {
           correcto = true; 
        }
        //}while(correcto==false);
        //}while(!correcto);
        }while(temperature < 30 || temperature >45);
    //}while(!(temperature >= 30 && temperature <=45));
        
        System.out.println("Paciente " + name + " temp: " + temperature + "ºC ");
        
    }
    
}
