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
    private PosicionesCampo posicion;

    public Futbolista(String nombre, int edad) {
        super(nombre, edad);
        this.goles = 10;
        posicion = PosicionesCampo.DELANTERO;
    }

    public Futbolista(String nombre, int edad, int goles, PosicionesCampo x) {
        super(nombre, edad);
        this.goles = goles;
        this.posicion = x;
    }    

    
    //entrenar
    public void jugarPartido()
    {
        System.out.println("Estoy jugando un partido");
        this.salario += 1000;
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
