/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objecte;

import java.util.Random;

public class Moneda {
    private int valor;
    private final int VALOR_MINIMO_MONEDA=1;
    private final int VALOR_MAXIMO_MONEDA=100;

    public Moneda() {
        Random rd = new Random();
        //valor = (int)(Math.random() * 100) + 1;
        valor = rd.nextInt(VALOR_MINIMO_MONEDA, VALOR_MAXIMO_MONEDA+1);
    }

    public int getValor() { return valor; }

    public boolean hasPowerUp() {
        if (valor % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
