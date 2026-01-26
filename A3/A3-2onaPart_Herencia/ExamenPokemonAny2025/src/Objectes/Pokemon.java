/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public abstract class Pokemon implements AccionesCombate { //abstract impide crear objetos pokemon new Pokemon...
    protected final LlistaNoms nom; //inicialmen es error perque no l'hem inicialitzat
    protected int LP;
    protected boolean vida;

    public Pokemon()
    {
        nom = LlistaNoms.PIKACHU;
        vida = true;
    }
    
    public Pokemon(LlistaNoms n)
    {
        nom = n;
        vida = true;
    }
    
    
    
    
    public LlistaNoms getNom() {
        return nom;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Pokemon))
        {
            return false;
        }

        final Pokemon other = (Pokemon) obj;
        return this.nom.equals(nom) ;
    }

    public int getLP() {
        return LP;
    }

    public boolean isVida() {
        if (LP<=0)
        {
            vida = false;
        }
        return vida;
    }

    @Override
    public int Atac()
    {
        Random rd = new Random();
        int ataque = rd.nextInt(0, 11);
        System.out.println("el pokemon " + nom + " ataca con " + ataque);
        return ataque;
    }
    
    protected void mostrarEstadoPokemon()
    {
        System.out.print(nom + "- " + LP + " LP ");
        if (isVida())
        {
            System.out.print(" viu ");
        }
        else
        {
            System.out.print(" mort ");
        }
        //voy a pintar los ===
        for (int i = 1; i <= LP; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }
    
    
}
