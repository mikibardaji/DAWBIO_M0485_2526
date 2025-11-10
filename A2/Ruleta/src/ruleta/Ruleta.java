/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

/**
 *
 * @author mabardaji
 */
public class Ruleta {


    /**
     * @param args Arguments de línia d'ordres (no utilitzats).
     */
    public static void main(String[] args) { }

    /**
     * Funció QuantitatAposta: Demana per teclat quina quantitat vol apostar.
     * Validar que no sigui numero negatiu
     * @return int Quantitat que vol apostar, o 0 si no vol apostar més.
     */
    public static int QuantitatAposta() { return 0;}

    /**
     * Funció AfegirPunts: Demana per teclat quants punts volem afegir al saldo.
     * 
     * @param saldo Saldo actual del jugador.
     * @return int Retorna el saldo actual més els punts afegits.
     */
    public static int AfegirPunts(int saldo) { return 0; }

    /**
     * Funció pintaAsterisc: rep un número enter i imprimeix per pantalla
     * tants asteriscs com indiqui el número rebut. Els asteriscs s'han de pintar amb linea (com es va demanar al examen) Al final dels asterisc pintar el numero.
     * 
     * @param numero Enter que indica el nombre d'asteriscs a mostrar.
     */
    public static void pintaAsterisc(int numero) { 
    
    }

    /**
     * Funció bola: genera i retorna un número aleatori
     * entre 0 i 36 (inclosos).
     * 
     * @return int Número aleatori entre 0 i 36.
     */
    public static int bola() {
    return 0;}

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
    return 0;}

    /**
     * Funció apostaPunts: comprova si l’usuari pot apostar
     * la quantitat indicada segons el seu saldo.
     * 
     * @param puntsTotal Quantitat total de punts disponibles.
     * @param puntsAposta Quantitat de punts que vol apostar.
     * @return int Retorna -1 si no pot apostar, o el valor apostat si és vàlid.
     */
    public static int apostaPunts(int puntsTotal, int puntsAposta) { return 0;}

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
    public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola) 
    { 
    return 0;    
    }
}


