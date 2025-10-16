/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ex9TemperaturaMitja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int batec, suma_mostres=0, acc;

    //la variable de la mitjana la definirem com a variable per evitar pèrdues de decimals
    double mitjana=0;

    //inicialitzem la variable per a que ens mostri numeros aleatoris
    Random rd = new Random();

    //durant 5 cicles (minuts) treurem un número aleatori i el sumarem al total de mostres, també actualitzarem l'accumulador
    for (acc=1; acc<=5 ; acc++){
        batec=rd.nextInt(30,151);
        System.out.println("Pulsacions del " +acc+" minut: "+batec+" bpm");
        suma_mostres=suma_mostres+batec; //acumulador
    }

    // una vegada acabat el mostreig, farem la mitjana i la mostrarem per pantalla.
    mitjana= (double) suma_mostres/(acc-1);
    System.out.println("La mitjana de les pulsacions ha sigut de " +mitjana+ " bpm");
    }
    
}
