/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class PersonaCentre {
    protected String nom;

    public PersonaCentre(String nom) {
        this.nom = nom;
    }
    
    
    
    
    public String obtenirInformacio()
    {
        return "“La persona que és troba al centre és diu" + nom;
    }

    public String getNom() {
        return nom;
    }
    
    
}
