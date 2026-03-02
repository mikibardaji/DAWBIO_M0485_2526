/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class TeoriaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> agenda; //per aprofitar polimorfisme
        agenda = new ArrayList<>(); //implementació especifica
        //afegir
        agenda.add("Jackson");
        agenda.add("Samuel");
        agenda.add("Matteo");
        agenda.add("Sonia");
        agenda.add("Joan");
        
        /*agenda.clear();
        System.out.println("Noms agenda" + agenda.size());*/
        
        for (String nom : agenda) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Noms agenda" + agenda.size());
        if (agenda.contains("Sonia"))
            System.out.println("Existe Sonia en la agenda");
        else
            System.out.println("No esta soniia");
        if (agenda.contains("Jordi"))
        {
            System.out.println("Existe Jordi en la agenda");
        }
        else
        {
            System.out.println("No esta Jordi");
        }
        
        Iterator<String> iterador = agenda.iterator();
        while(iterador.hasNext())
        {
            String nombreIterado = iterador.next();
            System.out.println(nombreIterado);
        }
        
        if (agenda.remove("Sonia"))
            System.out.println("Borrant sonia");
        else
            System.out.println("No existeix sonia");
        
        //metodes de interface list
        //get(int) = array[int]
        System.out.println("get");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i));
        }
        System.out.println("Noms agenda" + agenda.size());
        
        System.out.println("IndexOf em retorna la posició");
        System.out.println("Jackson posició esta " 
                + agenda.indexOf("Jackson"));
        System.out.println("Jordi posició esta " 
                + agenda.indexOf("Jordi"));
        
        String delete = agenda.remove(0);
        System.out.println("He borrat " + delete);
        for (String nom : agenda) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Noms agenda" + agenda.size());
        
        agenda.add(0, delete);
        System.out.println("he tornar a afegir " + delete );
        for (String nom : agenda) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Noms agenda" + agenda.size());
        System.out.println("Actualizo posició 2 amb Baltasar");
        agenda.set(2, "Baltasar"); //UPDATE
        for (String nom : agenda) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Noms agenda" + agenda.size());
        
    }

//    private static void metode1(List<String> agenda) { //aprofito polimorfisme
//        //podria ser ArrayList o linkedlist
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}
