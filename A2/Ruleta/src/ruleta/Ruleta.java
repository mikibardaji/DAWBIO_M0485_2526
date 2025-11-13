/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ruleta {


    /**
     * @param args Arguments de línia d'ordres (no utilitzats).
     */
    public static void main(String[] args) { 
    
        //System.out.println(resultatJugada(0, 10, 20, 6));
       // pintaAsterisc(5);
    }

    /**
     * Funció QuantitatAposta: Demana per teclat quina quantitat vol apostar.
     * Validar que no sigui numero negatiu
     * @return int Quantitat que vol apostar, o 0 si no vol apostar més.
     */
    public static int QuantitatAposta() 
    {
            Scanner entrada = new Scanner(System.in);
        int aposta;
        do {
            System.out.print("Quant vols apostar? ");
            aposta = entrada.nextInt();
        } while (aposta < 0);
        return aposta;            
}     
            
    /**
     * Funció AfegirPunts: Demana per teclat quants punts volem afegir al saldo.
     * 
     * @param saldo Saldo actual del jugador.
     * @return int Retorna el saldo actual més els punts afegits.
     */
    public static int AfegirPunts(int saldo) {
        Scanner sc = new Scanner(System.in);
        int afegir;
        
        do{
            System.out.print("Introduce cuántos puntos quieres añadir(Pon numero positivo): ");
            afegir= sc.nextInt();
        }while(afegir<=0); 
        saldo += afegir;
        return saldo;
    }

    /**
     * Funció pintaAsterisc: rep un número enter i imprimeix per pantalla
     * tants asteriscs com indiqui el número rebut. Els asteriscs s'han de pintar amb linea (com es va demanar al examen) Al final dels asterisc pintar el numero.
     * 
     * @param numero Enter que indica el nombre d'asteriscs a mostrar.
     */
    public static void pintaAsterisc(int numero){
        for(int i=0;i<numero;i++){
            System.out.print("*");
        }
        System.out.println("->" + numero);


    }

    /**
     * Funció bola: genera i retorna un número aleatori
     * entre 0 i 36 (inclosos).
     * 
     * @return int Número aleatori entre 0 i 36.
     */
    private static int bola(){
        
        Random rd = new Random();
        
        int bola = rd.nextInt(0, 37);
        
        return bola;
        
    }

    /**
     * Funció tipusAposta: demana a l’usuari quin tipus d’aposta vol fer.
     * Les posibles seran apostar a numeros del 1 al 36 o parell o senar
     * 
     * @return int Valor enter que indica el tipus d’aposta:
     * - -2 ? aposta a PARELL  
     * - -1 ? aposta a SENAR  
     * - 1..36 ? aposta per un número concret
     */
     public static int tipusAposta() {
         Scanner sc = new Scanner(System.in);
        int tipus;
        System.out.println("\n--- Tipus d'aposta ---");
        System.out.println("-2 ? Parell");
        System.out.println("-1 ? Senar");
        System.out.println("1–36 ? Número específic");
        do {
            System.out.print("Tria la teva opció: ");
            tipus = sc.nextInt();
            if (tipus < -2 || tipus > 36) {
                System.out.println("Opció no vàlida, torna-ho a provar.");
            }
        } while (tipus < -2 || tipus > 36 || tipus == 0);
        return tipus;
    }

    /**
     * Funció apostaPunts: comprova si l’usuari pot apostar
     * la quantitat indicada segons el seu saldo.
     * 
     * @param puntsTotal Quantitat total de punts disponibles.
     * @param puntsAposta Quantitat de punts que vol apostar.
     * @return int Retorna -1 si no pot apostar, o el valor apostat si és vàlid.
     */
    public static int apostaPunts(int puntsTotal,int puntsAposta)
    {
        if (puntsAposta > puntsTotal || puntsAposta < 0) {
            return -1; /*no pot fer l'aposta*/
        }
        else
        {
            return puntsAposta;
        }
    }

    /**
     * Funció resultatJugada: gestiona una ronda de joc segons el tipus d’aposta.
 
     * @param tipusAposta Tipus d’aposta realitzada (-2, -1 o número 1–36). 
     * @param saldo Saldo actual del jugador.
     * @param puntsAposta Quantitat apostada.
     * @param bola on ha caigut la bola de la ruleta
     * Si el tipusAPosta coincideix amb la bola, el benefici es 36 vegades el punts d'aposta que s'haura de sumar al saldo
     * Sl ei tipusAposta era parell o senar, i ha encertat, el benefici es el doble dels punts d'aposta que s'haura de sumar al saldo
     * Sino, no s'ha de sumar res al saldo que quedarà igual
     * @return int Nou saldo després de la jugada. 
     * 
     */
    public static int resultatJugada(int tipusAposta,int saldo,int puntsAposta, int bola){
      if((tipusAposta == -2 && bola%2==0) || (tipusAposta == -1 && bola%2!=0)){
          System.out.println("Has ganado el doble");
         saldo += puntsAposta * 2;
      } else if (tipusAposta == bola){
          System.out.println("Has ganado 36 veces mas");
           saldo += puntsAposta * 36;
      } else {
          System.out.println("Has perdido");
         saldo -=puntsAposta;
      }
      return saldo;
    }
}


