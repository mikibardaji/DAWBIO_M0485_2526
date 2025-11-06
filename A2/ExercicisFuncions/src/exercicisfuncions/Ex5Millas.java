/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisfuncions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex5Millas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double millas, km;
       
        //demanar al usuari els km
        millas = pedirDistanciaMilles();
        
        km = millesAKm(millas);
        //debo mostrar la conversion
        resultado(millas, km);
    }
    
    
    private static double millesAKm(double miles){
        final double MILLA_KM = 1.6093; //be constant
        double dis_km = miles * MILLA_KM;
        return dis_km;
    }
    
    private static double pedirDistanciaMilles(){
        
        Scanner sc = new Scanner(System.in);
        double dist;
        do
        {
            System.out.print("Posa la distancia en milles(Positives): ");
            dist = sc.nextDouble();
        }while(dist<=0);
        return dist;
        
    }
    
    private static void resultado(double millas, double km){
        System.out.println("La distancia en de " + millas + " milles en kilometres es de " + km + "km");
    }
}
