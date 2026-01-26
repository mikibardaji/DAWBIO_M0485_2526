/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public final class Veri extends Pokemon {
    public boolean defensa;

    public Veri() {
        super();
        LP = 50;
        defensa = false;
    }

    public Veri(LlistaNoms n) {
        super(n);
        LP = 50;
        defensa = false;
    }

    @Override
    public void RecibirImpacto(Pokemon pok) {
        int danyo = pok.Atac();
        
        if (LP<= 15)
        {
            defensa = true;
        }
        
        if (pok instanceof Aigua)
        {
            danyo = (int) (danyo*0.75);
        }
        //
        if (defensa)
        {
            LP -= (int)(danyo*0.5);
        }
        else
        {
            LP -= danyo; //LP = LP - danyo;
        }
       
        this.mostrarEstadoPokemon();
    }
    
}
