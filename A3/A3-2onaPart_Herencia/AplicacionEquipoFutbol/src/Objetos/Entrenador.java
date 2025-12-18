/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Entrenador extends Entrenamiento {

        private boolean tieneTitulo;
        
        
    public Entrenador(boolean tieneTitulo, String nombre, int edad) {
        super(nombre, edad);
        this.tieneTitulo = tieneTitulo;
    }

    public Entrenador ( String nombre, int edad)
    {
         super(nombre, edad);
         this.tieneTitulo = true;
    }
    
    
    //entrenar
    public void dirigirPartido()
    {
        System.out.println("Estoy dirigiendo el partido");
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
