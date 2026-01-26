/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpokemonany2025;

import Objectes.Aigua;
import Objectes.Electric;
import Objectes.LlistaNoms;
import Objectes.Pokemon;
import Objectes.Veri;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenPokemonAny2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon ash, bruno;
        
        ash = crearPokemon();
        bruno = crearPokemon();
        
        while(ash.isVida() && bruno.isVida())
        {
            bruno.RecibirImpacto(ash);
            if (bruno.isVida())
            {
                ash.RecibirImpacto(bruno);
            }
        }
        
        if (ash.isVida() && !bruno.isVida())
        {
            System.out.println(ash.getNom() + " Ash ha ganado");
        }
        else
        {
            System.out.println(bruno.getNom() + " Bruno ha gando");
        }
        
       
    }

    private static Pokemon crearPokemon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del pokemon(PIKACHU, CHARIZARD, BULBASAUR, SQUIRTLE, JIGGLYPUFF)");
        String nombre = sc.nextLine().toUpperCase();
        
        System.out.println("Dime el tipo de pokemon (Agua,Veneno,Electrico)");
        String tipo = sc.nextLine().toUpperCase();
        
        switch(tipo)
        {
            case "AGUA":
                System.out.println("creo pokemon agua");
                return new Aigua(LlistaNoms.valueOf(nombre));
            case "VENENO":
                System.out.println("creo pokemon Veri");
                return new Veri(LlistaNoms.valueOf(nombre));
            case "ELECTRICO":
                System.out.println("creo pokemon electrico");
                return new Electric(LlistaNoms.valueOf(nombre)); 
            default: 
                return new Aigua(LlistaNoms.valueOf(nombre)); 
        }
            
       
    }
    
}
