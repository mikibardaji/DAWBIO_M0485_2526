/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subwaysurfers;

import Objecte.Joc;
import Objecte.Jugador;
import Objecte.Moneda;
import Objecte.Obstacle;

/**
 *
 * @author mabardaji
 */
public class SubwaySurfers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Jugador player = new Jugador("Adrian");
//        player.correr();
//        player.setPower_up(true);
//        player.correr();
//        Moneda coin = new Moneda();
//        System.out.println(coin.getValor());
//        player.recollirMoneda(coin);
//        player.correr();
//        Obstacle xoc = new Obstacle();
           Joc game = new Joc("Bardaji", "facil");
           game.jugar();
        
    }
    
}
