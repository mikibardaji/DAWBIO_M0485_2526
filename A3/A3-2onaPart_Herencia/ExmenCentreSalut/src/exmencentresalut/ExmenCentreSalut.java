/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmencentresalut;

import Objetos.Fisioterapeuta;
import Objetos.GestorCentre;
import Objetos.Infermer;
import Objetos.Metge;
import Objetos.Pacient;

/**
 *
 * @author mabardaji
 */
public class ExmenCentreSalut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metge m1 = new Metge("1", "M1");
        Metge m2 = new Metge("2", "M2");
        Infermer inf = new Infermer("3", "I3");
        Fisioterapeuta fisio = new Fisioterapeuta("4", "F4");
        Pacient p = new Pacient("P4");
        
        System.out.println("Cost visita pacient " + m1.aplicarDescompte(p));
        System.out.println("Cost visita Infermer " + m1.aplicarDescompte(inf));
        System.out.println(m1.getNom());
        System.out.println(GestorCentre.calcularCostTotal(m1, inf, fisio));
  
    }
    
}
