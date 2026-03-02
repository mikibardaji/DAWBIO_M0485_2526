/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaarraylist;

import Objectes.Animal;
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
        
        //arrayListString();
        
        
        List<Animal> hotel; //per aprofitar polimorfisme
        hotel = new ArrayList<>(); //implementació especifica
        //afegir
        Animal Ohana = new Animal(1, "Ohana", "Mix");
        hotel.add(Ohana);
        hotel.add(new Animal(2,"Ayumi","Atrigado"));
        hotel.add(new Animal(3,"Bohr","Podenco"));
        hotel.add(new Animal(4,"Ettora","Conejo"));
        hotel.add(new Animal(5,"Bolitas","Conejo"));
        
        /*agenda.clear();
        System.out.println("Noms agenda" + agenda.size());*/
        System.out.println("Animales en el hotel: " + hotel.size());
        for (Animal pet : hotel) { //for each (Iterable)
            System.out.println(pet);
        }
       
        System.out.println("Noms agenda" + hotel.size());
        Animal buscado = new Animal(2,"Ayumi","Atrigado");
        if (hotel.contains(buscado))
        {
            System.out.println("Existe alguien en la habitacion" + 
                    buscado.getnCelda() + " en el hotel"); 
            System.out.println("Campo importance celda");
        }
        else
            System.out.println("No hay nadie  en la habitacion" + 
                    buscado.getnCelda());
        
        Animal buscado2 = new Animal(6, "Ayumi", "Atrigado");
        if (hotel.contains(buscado2))
        {
            System.out.println("Existe alguien en la habitacion" + 
                    buscado2.getnCelda() + " en el hotel"); 
            System.out.println("Campo importance celda");
        }
        else
            System.out.println("No hay nadie  en la habitacion" + 
                    buscado2.getnCelda());

        Animal buscado3 = new Animal(2, "", "");
        if (hotel.contains(buscado3))
        {
            System.out.println("Existe alguien en la habitacion" + 
                    buscado3.getnCelda() + " en el hotel"); 
            System.out.println("Campo importance celda");
        }
        else
            System.out.println("No hay nadie  en la habitacion" + 
                    buscado3.getnCelda());        
        
        
        
    
        
        
        Iterator<Animal> iterador = hotel.iterator();
        while(iterador.hasNext())
        {
            Animal nombreIterado = iterador.next();
            System.out.println(nombreIterado);
        }
        
        Animal dog = new Animal(3,"Inventado","Tiranousurs");
        //if (hotel.remove(new Animal(3,null,null)))
        if (hotel.remove(dog))
            System.out.println("Borrant sonia");
        else
            System.out.println("No existeix sonia");
        
        //metodes de interface list
        //get(int) = array[int]
        System.out.println("get");
        for (int i = 0; i < hotel.size(); i++) {
            System.out.println(hotel.get(i));
        }
        System.out.println("Noms agenda" + hotel.size());
       
        System.out.println("IndexOf em retorna la posició");
        System.out.println("Animal habitacio 4 posició esta " 
                + hotel.indexOf(new Animal(4,"Inventat","Inventat")));
        System.out.println("animal habitació 6 posició esta " 
                + hotel.indexOf(new Animal(6,"Inventat","Inventat")));
        
        Animal delete = hotel.remove(0);
        System.out.println("He borrat " + delete);
        for (Animal nom : hotel) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Animals hotel" + hotel.size());
        
        hotel.add(1, delete);
        System.out.println("he tornar a afegir " + delete );
        for (Animal nom : hotel) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Noms agenda" + hotel.size());
        System.out.println("Actualizo posició 2 a");
        hotel.set(2, new Animal(14,"Olatz","Sense raça")); //UPDATE
        for (Animal nom : hotel) { //for each (Iterable)
            System.out.println(nom);
        }
        System.out.println("Noms agenda" + hotel.size());

    }

//    private static void metode1(List<String> agenda) { //aprofito polimorfisme
//        //podria ser ArrayList o linkedlist
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private static void arrayListString() {
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
    
}
