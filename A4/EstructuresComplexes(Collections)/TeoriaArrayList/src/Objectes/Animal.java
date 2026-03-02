/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Animal {
    
    private int nCelda; //per cada celda solo un perro
    private String nombre;
    private String raza;

    public Animal(int nCelda, String nombre, String raza) {
        this.nCelda = nCelda;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getnCelda() {
        return nCelda;
    }

    public void setnCelda(int nCelda) {
        this.nCelda = nCelda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre + " que es un " + raza + " se encuentra alojado en la hab: " + nCelda;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Animal)) {
            return false;
        }
        final Animal other = (Animal) obj;
        return this.nCelda == other.nCelda;
    }
    
    
}
