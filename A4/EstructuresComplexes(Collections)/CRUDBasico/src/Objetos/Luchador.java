/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Luchador {
    private int idLicencia;
    private String nombre;
    private int peso;

    public Luchador(int idLicencia, String nombre) {
        this.idLicencia = idLicencia;
        this.nombre = nombre;
        this.peso = 1;  //como el setter lanza una excepcion
        //no me interesa llamarlo porque si saltara la excepcion
        //el objeto en el constructor no se crearia
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) throws NotValidWeightException {
        if (peso>0 && peso <=200)
        {
            this.peso = peso;
        }
        else
            throw new NotValidWeightException();
    }
    
    
    
    
    
    
    
    
}
