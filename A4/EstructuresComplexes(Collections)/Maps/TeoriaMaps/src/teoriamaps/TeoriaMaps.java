/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriamaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class TeoriaMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Double> nevera; //la Clau (key) sempre ha de tenir el mètode equals
        
        //com no importa tenirlos ordenats ni saber el ordre de inserció
        nevera = new HashMap<>();
        
        nevera.put("Llet", 2.0);
        nevera.put("Ous", 6.0);
        nevera.put("Aigua", 1.5);
        nevera.put("Tomates", 2.0);
        
        System.out.println("Quanta aigua tinc: " + nevera.get("Aigua"));
        System.out.println("Quants yogurts tinc: " + nevera.get("Yogurts"));
        
        //saber si tenim una clau en particular
        System.out.println("Tenim yogurts a la nevera? " + nevera.containsKey("Yogurts"));
        
        System.out.println("Quants ous  tinc: " + nevera.get("Ous"));
        //eliminar els ous de la nevera
        nevera.remove("Ous");
        System.out.println("Quants ous  tinc: " + nevera.get("Ous"));
        //contador
        System.out.println("Quants aliments tinc a la nevera: " + nevera.size());
        
        //recuperar totes les claus a un conjunt (Set)
        Set<String> clausNevera = nevera.keySet();
        System.out.println("claus"  + clausNevera);
        for (String aliment : clausNevera) {
                Double value = nevera.get(aliment);
                System.out.println("[ Key: "+ aliment + "][ Value:" + value +"]");
        }
        
        //especie def foreac
        for (Map.Entry<String, Double> aliment : nevera.entrySet()) {
            System.out.println("[ Key: "+ aliment.getKey() + "][ Value:" + aliment.getValue() +"]");
        }
        
        
        
        
        
    }
    
}
