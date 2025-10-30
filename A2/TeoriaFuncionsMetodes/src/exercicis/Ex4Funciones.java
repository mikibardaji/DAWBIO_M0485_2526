/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex4Funciones {

    /**
     * Programa que demana a l’usuari un nombre enter i mostra si és positiu, zero o negatiu. 
     * Cal crear el mètode int obteSigne(int x), el qual retorna -1, 0, +1 
     * segons el nombre és negatiu, zero o positiu, respectivament.
     */
    public static void main(String[] args) {
        int numero = pedirValor();
        int signo = obteSigne(numero);
        //1, 0, -1
        mostrarResultado(signo);
    }
    
    /*
    mètode int obteSigne(int x), el qual retorna -1, 0, +1 
    */
    public static int obteSigne(int x)
    {
        int signe;
        if (x>0)
        {
            signe = 1;
        }
        else if (x<0)
        {
            signe = -1;
        }
        else
        {
            signe = 0;
        }
        return signe;
    }

    public static int pedirValor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un valor ");
        int num = sc.nextInt();
        return num;
    }
    
    public static void mostrarResultado(int x)
    {
        switch(x)
        {
            case 1:
                System.out.println("Positivo");
                break;
            case -1:
                System.out.println("Negativo");
                break;
            case 0:
                System.out.println("Era un 0");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
