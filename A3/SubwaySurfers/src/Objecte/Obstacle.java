/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

import java.util.Random;

public class Obstacle {
    private String tipo;
    private int nivel;
    private static final int MIN_BARRERA = 1;
    private static final int MIN_TREN = 5;
    private static final int MAX_BARRERA = 5;
    private static final int MAX_TREN = 10;
    
    
    public Obstacle() {
        Random r = new Random();

        //r.nextInt(1, 3);
        this.tipo = r.nextBoolean() ? "tren" : "barrera";

        if (tipo.equals("tren")) {
            nivel = r.nextInt(MIN_TREN, MAX_TREN+1);
        } else {
            nivel = r.nextInt(MIN_BARRERA,MAX_BARRERA+1);
        }

        System.out.println("Obstáculo: " + tipo + " (nivel: " + nivel + ")");
    }

    private Obstacle(boolean maximo) { //es private perque no haig 
        // de donar opcio de crear-lo per fora
        //if (maximo) {
            tipo = "tren";
            nivel = MAX_BARRERA;
       // }
    }

    public static Obstacle maxBlock() {
        return new Obstacle(true);
    }

    public int getNivel() {
        return nivel;
    }

    public String getTipo() {
        return tipo;
    }
}
