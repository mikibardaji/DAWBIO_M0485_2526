/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Futbolista extends Entrenamiento{
    private int goles;

    public Futbolista(String nombre, int edad) {
        super(nombre, edad);
        this.goles = 0;
    }

    public Futbolista(String nombre, int edad, int goles) {
        super(nombre, edad);
        this.goles = goles;
    }    

    
    //entrenar
    public void jugarPartido()
    {
        System.out.println("Estoy jugando un partido");
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
