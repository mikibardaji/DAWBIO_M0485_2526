/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionsteoria;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExceptionsTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // divisionZero();
        //fueraLimites();
        entradaDadesIncorrectes();
    }

    private static void divisionZero() {
        int num=15;
        int num2 = 0;
        double dineroHijo=0;
        try //delimita la zona de captura de exception
        { //lineas de codigo donde podria darse un error no controlado (Exception)
            //y dentro del try se podra capturar la exception
        dineroHijo = (double) num/num2;
        System.out.println(dineroHijo);
        }
        catch(ArithmeticException e)
        {
            System.out.println("No puedes dividir por zero al no tener hijos " + num2);
            dineroHijo = num;
            System.out.println("Este dinero" + dineroHijo + " se lo queda el estado");
        }
        catch(Exception e) //madre
        {
            System.out.println("Has ejecutado un error");
            System.out.println("mensaje de error " + e.getMessage());
        } //ArithmeticException
    }

    private static void fueraLimites() {
            //un array con 3 posicones enteras YA INFORMADAS
            int[] numeros = {1,2,3};
            try
            {
            for (int i = 0; i < 10; i++) {
                System.out.println("posicion " + i + " tiene " + numeros[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Has sortit de limits " + e.getMessage());
               // e.printStackTrace();
                System.out.println("Segueixo escrivint");
            }
            
            System.out.println("Fora del catch");
    }

    private static void entradaDadesIncorrectes() {
            //demanar al usuari que fiqui un numero
            //recollir-lo en una variable numerica
            // executar el programa i quant l'executes fiques la lletra A quant t'ha demanat
            try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introdueix la teva edad");
            int edad = sc.nextInt();
            }catch(InputMismatchException e)
            {
                System.out.println("He dit que fiquis la teva edad no una lletra!!!");
            }
    }
    
}
