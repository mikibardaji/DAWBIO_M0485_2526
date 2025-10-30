/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1Examen {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int opcio;
        int tirades = -1; // -1 vol dir que encara no s�han definit tirades
        int numeroSecret = -1; // n�mero a endevinar
        boolean numeroAssignat = false; // indica si ja s�ha generat un n�mero per la partida
        
        do {
            System.out.println("\n--- MEN� ---");
            System.out.println("0 - Sortir");
            System.out.println("1 - Instruccions del joc");
            System.out.println("2 - Tirades");
            System.out.println("3 - Jugar");
            System.out.print("Escull una opci�: ");
            
            // Validaci� b�sica
            while (!sc.hasNextInt()) {
                System.out.print("Introdueix un n�mero v�lid: ");
                sc.next();
            }
            opcio = sc.nextInt();
            
            switch (opcio) {
                case 0:
                    System.out.println("Fins la propera!");
                    break;
                    
                case 1:
                    System.out.println("Instruccions: Primer accedeix a 2 per indicar nombre de tirades i despr�s a 3 per comen�ar a jugar.");
                    break;
                    
                case 2:
                    System.out.print("Quantes tirades vols fer? ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Introdueix un n�mero v�lid: ");
                        sc.next();
                    }
                    tirades = sc.nextInt();
                    if (tirades > 0) {
                        System.out.println("Has establert " + tirades + " tirades.");
                    } else {
                        System.out.println("Nombre de tirades inv�lid.");
                        tirades = -1;
                    }
                    break;
                    
                case 3:
                    if (tirades == -1) {
                        System.out.println("No hi ha n�mero d�intents especificats. Si us plau, escull primer l�opci� 2.");
                    } else {
                        if (!numeroAssignat) {
                            numeroSecret = rand.nextInt(10) + 1; // n�mero aleatori de l�1 al 10
                            numeroAssignat = true;
                        }
                        System.out.println("Comen�a el joc! Endevina el n�mero (de l�1 al 10)");
                        
                        boolean encertat = false;
                        for (int i = 0; i < tirades; i++) {
                            System.out.print("Introdueix el teu n�mero: ");
                            while (!sc.hasNextInt()) {
                                System.out.print("Introdueix un n�mero v�lid: ");
                                sc.next();
                            }
                            int intent = sc.nextInt();
                            
                            if (intent == numeroSecret) {
                                System.out.println("Has guanyat!");
                                encertat = true;
                                break;
                            } else {
                                int restants = tirades - i - 1;
                                if (restants > 0) {
                                    System.out.println("No has encertat, et queden " + restants + " intents.");
                                } else {
                                    System.out.println("Ho sentim, has perdut! El n�mero era: " + numeroSecret);
                                }
                            }
                        }
                        // Un cop s�acaba una partida, permet que en comen�ar una nova es generi un altre n�mero
                        numeroAssignat = false;
                    }
                    break;
                    
                default:
                    System.out.println("Opci� no v�lida. Torna-ho a provar.");
            }
            
        } while (opcio != 0);
        
        sc.close();
    }
    
}
