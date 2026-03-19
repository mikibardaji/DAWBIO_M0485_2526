/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mabardaji
 */
public class SequenciaGenetica {
    private String idMostra;
    private String organisme;
    private int longitudCadena;

    public SequenciaGenetica(String idMostra, String organisme, int longitudCadena) {
        this.idMostra = idMostra;
        this.organisme = organisme;
        this.longitudCadena = longitudCadena;
    }

    public SequenciaGenetica() {
        idMostra = "";
        organisme = "";
    }

    public String getIdMostra() {
        return idMostra;
    }

    public void setIdMostra(String idMostra) {
        this.idMostra = idMostra;
    }

    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public int getLongitudCadena() {
        return longitudCadena;
    }

    public void setLongitudCadena(int longitudCadena) {
        this.longitudCadena = longitudCadena;
    }

    @Override
    public String toString() {
        return "La sequencia (" +  idMostra + ") pertany a un/a " + organisme + " i té una longitud de " + longitudCadena;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        if (this == obj) //direccio de memoria on estan guardats
        {
            return true;
        }
        if (!(obj instanceof SequenciaGenetica))
        {
            return false;
        }
        //cast obj a equipoFutbol
        SequenciaGenetica x = (SequenciaGenetica) obj;
        
        return this.idMostra == x.idMostra; 
    }
    
    
    
    
    
}
