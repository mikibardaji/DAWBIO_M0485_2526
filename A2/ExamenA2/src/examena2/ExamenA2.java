/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examena2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(quantitatMenjarAportat(5));
        //System.out.println(tirarMoneda());
        int menjar_joc = 10;
        int menjar_apostat, menjar_restant, menjar_actual_apostat;
        char tirada1, tirada2;
        
        do{
           System.out.println("PARTIDA TENS " + menjar_joc + " PUNTS DE MENJAR DISPONIBLES");
           menjar_apostat = quantitatMenjarAportat(menjar_joc);
           System.out.println("Has apostat " + menjar_apostat + " punts de menjar.");
           menjar_restant = menjar_joc - menjar_apostat;
           tirada1 = tirarMoneda();
            System.out.println("Tirada de moneda 1: " + tirada1);
            tirada2 = tirarMoneda();
            System.out.println("Tirada de moneda 2: " + tirada2);
            menjar_actual_apostat = calcularTresor(tirada1, tirada2, menjar_apostat);
            mostrarResultat(tirada1, tirada2, menjar_actual_apostat);
            menjar_joc = menjar_restant + menjar_actual_apostat;
        }while(continuarExpedición(menjar_joc));
    }
    
    public static int quantitatMenjarAportat(int menjarDisponible) {
    Scanner sc = new Scanner(System.in);
    
    int menjarAportar = 0;
    do {
        System.out.println("cuanto menjar vas a aportar? Debe de ser menor a " + menjarDisponible + " (Tu saldo actual)");
        menjarAportar = sc.nextInt();
    } while (menjarAportar > menjarDisponible || menjarAportar < 1);
    return menjarAportar;
   }

    private static char tirarMoneda() {
        Random rd = new Random();
        int moneda = rd.nextInt(1,3);
        char letra;
        
        switch (moneda) {
            case 1 -> letra = 'C';
            case 2 -> letra = 'X';
            default -> throw new AssertionError();
        }
        return letra;
    }    
    
    
    public static int calcularTresor(char tirada_1, char tirada_2, int punts_menjar_apostar) {
        if (tirada_1 == 'C' && tirada_2 == 'C') {
            return punts_menjar_apostar * 3;
        } else if (tirada_1 == 'X' && tirada_2 == 'X') {
            return punts_menjar_apostar * 0;
        } else {
            return punts_menjar_apostar;
        }
        
    }
    
    
    public static void mostrarResultat(char tirada1, char tirada2, int resultat){

        System.out.println("*****MAPA DEL TRESOR*****");
        if (tirada1=='C')
        {
            System.out.println("Moneda 1: cara " );
        }
        else
        {
            System.out.println("Moneda 1: creu " );
        }
        if (tirada2=='C')
        {
            System.out.println("Moneda 2: cara " );
        }
        else
        {
            System.out.println("Moneda 2: creu " );
        }
        //System.out.println("Moneda 1: " + (tirada1 == 'C' ? "cara" : "Creu" ));
        //System.out.println("Moneda 1: " + (tirada2 == 'C' ? "cara" : "Creu" ));
        System.out.println("Resultat tirada:" + resultat);
        System.out.println("*************************");

    }    
    
        public static boolean continuarExpedición(int ptocomidarestante ){
        boolean condicion = true;

            if (ptocomidarestante > 0 && ptocomidarestante < 30) {
                
                condicion = true;
            }else if (ptocomidarestante >= 30){
                System.out.println("Enhorabuena, has encontrado el tesoro");
                condicion = false;
            
            }else{
                System.out.println("Te has quedado sin comida, fin de la partida");
                condicion = false;
            }
   
            return  condicion;
        }
    
    
}
