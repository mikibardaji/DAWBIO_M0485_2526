/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

/**
 *
 * @author mabardaji
 */
public class Ex12DivisorCelulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acum_celulas=1; //no se a cuanto lo tengo que inicializar
        for (int horas = 1; horas <= 10; horas++) {
            acum_celulas = acum_celulas * 2;
            System.out.println("Hora " + horas + " celulas " + acum_celulas);
        }
    }
    
}
