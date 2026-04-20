/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Pokemon {
    private int id;
    private String nom;
    private String tipus;
    private int nivell;
    private int capturats;

    // Constructors
    public Pokemon(int id, String nom, String tipus, int nivell, int capturats) {
        this.id = id;
        this.nom = nom;
        this.tipus = tipus;
        this.nivell = nivell;
        this.capturats = capturats;
    }

    // Getters i Setters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getTipus() { return tipus; }
    public int getNivell() { return nivell; }
    public int getCapturats() { return capturats; }
    public void setCapturats(int capturats) { this.capturats = capturats; }

    @Override
    public String toString() {
        return String.format("[%d] %-12s | Tipus: %-10s | Nivell: %d | Capturats: %d", 
                id, nom, tipus, nivell, capturats); //aquest format l'ha fet el GeminiAI, s'hauria d'adaptar.
    }
}

