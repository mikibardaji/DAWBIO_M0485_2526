/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

/**
 *
 * @author mabardaji
 */
public class Joc {
    private Jugador player;
    private String nivell_dificultat;

    public Joc(String nom_player, String nivell_dificultat) {
        this.player = new Jugador(nom_player);
        this.nivell_dificultat = nivell_dificultat;
    }
    
    public void jugar()
    {
        Obstacle xoc;
        Moneda coin;
        
        do
        {
            player.correr();
            xoc = new Obstacle();
            player.xocar(xoc);
            coin = new Moneda();
            player.recollirMoneda(coin);
        }while(player.getEnergia()>0);
        
        System.out.println("Ha recorrido " + player.getDistancia_acumulada()
        + " monedas " + player.getPuntuacio());
    }
    
}
