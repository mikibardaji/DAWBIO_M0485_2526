/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicispoo;

import Objectes.Persona;
import Objectes.Punto;

/**
 *
 * @author mabardaji
 */
public class ExercicisPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1 = new Punto(5,0);
        System.out.println("p1.x " + p1.getX());
        System.out.println("p1.y " + p1.getY());
//        p1.x = 5;
//        p1.y = 0;
//        System.out.println("p1.x " + p1.x);
//        System.out.println("p1.y " + p1.y);
        Punto p2 = new Punto(10,10);
//        p2.x = 10;
//        p2.y = 10;
        System.out.println("p2.x " + p2.getY());
        System.out.println("p2.y " + p2.getY());
        p2.imprime();
        p2.setXY(3, 4);
        p2.imprime();
        p2.desplaza(2, 10);
        p2.imprime(); 
        
        Persona p = new Persona("1", "n1", "n2", 20);
        System.out.println("nombre -> " + p.getNombre());
        System.out.println("edad-> " + p.getEdad());
//        p.nombre= "Jackson";
        System.out.println("nombre -> " + p.getNombre());
        
        p.setDNI("NUEVO DNI");
        p.imprime();
        
        System.out.println("Mayor de edad? " + p.esMayorEdad());
        System.out.println("Jubilado? " + p.esJubilado());
        Persona x = new Persona("SS", "sssss", "ssss", 100);
        
        System.out.println("diferencia edad " + p.diferenciaEdad(x));
        System.out.println("diferencia edad " + x.diferenciaEdad(p));    
        
       
        Punto c = Punto.crearPuntoAleatorio();
        c.imprime();
        
    }
    
}
