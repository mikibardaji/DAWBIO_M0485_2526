/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

public class Jugador {
    private String nom;
    private int puntuacio;
    private int distancia_acumulada;
    private int energia;
    private boolean power_up;
    private final int MAX_ENERGIA = 50;
    private final int DISTANCIA_RECORRIDA = 2;

    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distancia_acumulada = 0;
        this.energia = MAX_ENERGIA;
        this.power_up = false;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPower_up() {
        return power_up;
    }

    public void setPower_up(boolean power_up) {
        this.power_up = power_up;
    }

    public void correr() {
        if (power_up) {
            distancia_acumulada += DISTANCIA_RECORRIDA*3;
        } else {
            distancia_acumulada += DISTANCIA_RECORRIDA;
        }
        for (int i = 1; i <= distancia_acumulada; i++) {
            System.out.print("- ");
        }
        System.out.println(distancia_acumulada + " metres.");
    }

    public void recollirMoneda(Moneda m) {
        puntuacio += m.getValor();
        /*if (m.hasPowerUp()) {
            power_up = true;
        } else {
            power_up = false;
        }*/
        this.setPower_up(m.hasPowerUp());
        System.out.println("Moneda recogida: " + m.getValor() + " llevas " + puntuacio);
    }

    public void xocar(Obstacle o) {
        energia -= o.getNivel();
        setPower_up(false);
        System.out.println("Choca con " + o.getTipo()+ ". Energia actual: " + energia);
    }
}
