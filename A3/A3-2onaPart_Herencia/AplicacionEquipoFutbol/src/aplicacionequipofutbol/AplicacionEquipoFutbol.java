/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionequipofutbol;

import Objetos.Entrenador;
import Objetos.*;

/**
 *
 * @author mabardaji
 */
public class AplicacionEquipoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbolista soccer = new Futbolista("Messi", 38);
        System.out.println("nombre " + soccer.getNombre());
        System.out.println("id " + soccer.getIdEquipoFutbol());
        Futbolista soccer2 = new Futbolista("CR7", 40);
        System.out.println("nombre2 " + soccer2.getNombre());
        System.out.println("id2 " + soccer2.getIdEquipoFutbol());
         Entrenador trainer = new Entrenador("Flick", 645);
        System.out.println("nombre3 " + trainer.getNombre());
        System.out.println("id3 " + trainer.getIdEquipoFutbol());   
        System.out.println("id general " + EquipoFutbol.getId());
        soccer.concentrarse();
        soccer2.concentrarse();
        trainer.concentrarse();
        soccer.viajar();
        Presidente presi = new Presidente(10,"floren", 10);
        presi.viajar();
         
    }
    
}
