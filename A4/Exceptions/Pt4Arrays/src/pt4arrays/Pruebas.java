/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt4arrays;

/**
 *
 * @author mabardaji
 */
public class Pruebas {
    
    public static void main(String[] args) {
        String  mostra= " ---atg-GCA-ttg-CTA-ggt-tga--- ";
        //Neteja inicial: Elimina els espais en blanc que hi ha als extrems de la cadena per evitar errors de lectura.
        mostra  = mostra.trim();
        System.out.println(mostra);
        //Sanejament de seqüència: Elimina tots els guions (-) que apareixen en el text per obtenir una cadena contínua de bases nitrogenades.
        mostra  = mostra.replaceAll("-","");
        System.out.println(mostra);
        //Normalització: El laboratori només accepta seqüències en majúscules.
         mostra  = mostra.toUpperCase();
        System.out.println(mostra);
        //Anàlisi de mida: Calcula el nombre total de nucle?tids que té la seqüència un cop neta i mostra el resultat per consola.
        System.out.println(mostra.length());
        //Identificació de l'inici: Mostra quin és el primer caràcte
        System.out.println(mostra.charAt(0));
        //Extracció de la mostra: Extreu el segment de la seqüència que va des de la posició 3 fins a la 9 (ambdues incloses).
        mostra  = mostra.substring(3, 10);
        System.out.println(mostra);
        mostra  = mostra.replaceAll("T","U");
        System.out.println(mostra);
        String[] separacio = mostra.split("C");
        int contador=0;
        for (String trozos : separacio) {
            System.out.println(trozos);
            contador++;
        }
        System.out.println("trozos: " + contador);
        mostra  = mostra.toLowerCase();
        System.out.println(mostra);
    }
    
}
