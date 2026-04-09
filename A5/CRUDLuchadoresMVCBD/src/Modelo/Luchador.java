/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class Luchador {
    private int idLicencia;
    private String nombre;
    private int peso;

    public Luchador(int idLicencia, String nombre, int peso) {
        this.idLicencia = idLicencia;
        this.nombre = nombre;
        this.peso = peso;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre + "tiene la licencia" + idLicencia + " y su peso es" + peso + " kg.";
    }


    
    
}
