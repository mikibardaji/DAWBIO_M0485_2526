/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisstring;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici4String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demanem la frase
        System.out.print("Introdueix una frase: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();  //paso a minuscula per sol contar les minuscules

        int n_a = 0, n_e = 0, n_i = 0, n_o = 0, n_u = 0;

        // Recorrem la frase
        for (int pos = 0; pos < frase.length(); pos++) {
            char lletra = frase.charAt(pos);

            switch (lletra) {
                case 'a': 
                case 'A': //si no hagues fet el toLowerCase();    
                    n_a++; break;
                case 'e': n_e++; break;
                case 'i': n_i++; break;
                case 'o': n_o++; break;
                case 'u': n_u++; break;
            }
        }

        System.out.println(" A's: " + n_a);
        System.out.println(" E's: " + n_e);
        System.out.println(" I's: " + n_i);
        System.out.println(" O's: " + n_o);
        System.out.println(" U's: " + n_u);

        sc.close();
    }
    
}
