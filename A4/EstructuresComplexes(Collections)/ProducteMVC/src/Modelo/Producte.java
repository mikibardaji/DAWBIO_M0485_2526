package Modelo;

import java.util.Objects;

/**
 * Els datos que treballa la app
 * no te sout's 
 * Pot llançar exceptions de validcio 
 */
public class Producte {
    private int id;
    private String nom;
    private double preu;
    
    public Producte(double preu, String nom) {
        this.id = 0;
        this.nom = nom;
        this.preu = preu;
    }    
    
    
    
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setId(int id) throws IdNegativaException {
        if (id>0)
        {
            this.id = id;
        }
        else
            throw new IdNegativaException();
    }



 //getters i setters

    @Override
    public String toString() {
        return "ID: " + id + " | Nom: " + nom + " | Preu: " + preu + " €.";
    }
    // Equals nom?©s per ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producte)) return false;
        Producte producte = (Producte) o;
        return id == producte.id;
    }
}