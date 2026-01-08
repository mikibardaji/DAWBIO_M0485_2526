/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji derivan futbolista y entrenador
 */
public abstract class Entrenamiento extends EquipoFutbol{

    public Entrenamiento(String nombre, int edad) {
        super(nombre, edad);
        this.salario = 1500;
        
    }
    
    public abstract void entrenar();
}
