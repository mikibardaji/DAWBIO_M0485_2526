/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1examenparellssenars;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici1ExamenParellsSenars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num_jugador, num_maquina, victories;
        int victoria_jugador=0, victoria_maquina=0;
        int eleccion, total; //0 par i 1 impar
        
        System.out.print("Introdueix victories màximes: ");
        victories = sc.nextInt();
        //
        int partida = 1;
        do
        {
            System.out.print("Partida " + partida + "posa un numero: ");
            num_jugador = sc.nextInt();
            System.out.print("Elegeix Parell(0) o Senar(1): ");
            eleccion = sc.nextInt();
            num_maquina = rd.nextInt(0, 11);
            System.out.println("La maquina diu : " + num_maquina);
            total = num_jugador + num_maquina;
            if ((total%2 == 0) && eleccion==0) //es parell i jo he triat parell
            {
                System.out.println("Has encertat");
                victoria_jugador++;
                System.out.println("Maquina :" + victoria_maquina);
                System.out.println("Jugador :" + victoria_jugador);
            }
            else if ((total%2 == 1) && eleccion==1)
            {
                System.out.println("Has encertat");
                victoria_jugador++;
                 System.out.println("Maquina :" + victoria_maquina);
                System.out.println("Jugador :" + victoria_jugador);
            }
            else
            {
                System.out.println("Ha encertat la maquina");
                victoria_maquina++;
                System.out.println("Maquina :" + victoria_maquina);
                System.out.println("Jugador :" + victoria_jugador);
            }
            partida++;
        }while ((victoria_jugador<victories) && (victoria_maquina < victories));
        
        if (victoria_jugador==victories)
        {
            System.out.println("Has guanyat");
        }
        else
        {
            System.out.println("Ha guanyat la maquina");
        }
        
        System.out.println("Maquina :" + victoria_maquina);
        System.out.println("Jugador :" + victoria_jugador);
        
    }
    
}
