/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beastfigueredo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class BeastFigueredo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 3;
        double[] diners = new double[N];
        diners[0] = 1000000;

        int i = 0;
        while (i < N - 1 && diners[i] > 0) {
            System.out.println("Concursante " + (i + 1) + ", cuanto dinero quieres?");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada no valida");
                sc.next(); // consume invalid token
                continue;
            }
            double cantidad = sc.nextDouble();

            if (cantidad < 0 || cantidad > diners[i]) {
                System.out.println("Cantidad no valida");
                // retry the same contestant without changing i
                continue;
            } else {
                diners[i + 1] = diners[i] - cantidad;
                diners[i] = cantidad;
                i++;
            }
        }

        System.out.println("Array final:");
        for (int j = 0; j < diners.length; j++) {
            System.out.print("Concursante " + (j + 1) + ": " + diners[j] + " euros ");
        }

        sc.close();
    }
    
}
