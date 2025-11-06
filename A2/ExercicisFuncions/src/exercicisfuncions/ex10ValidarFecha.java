/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisfuncions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ex10ValidarFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,anyo;
        boolean cierto;
        dia = pedirNumero("Pon el dia: ");
        mes = pedirNumero("Pon el mes: ");
        anyo = pedirNumero("Pon el anyo: ");
        
//        cierto = validarFecha(dia, mes, anyo);
//        if (cierto== true)
//        {
//            System.out.println("Fecha correcta");
//        }
//        else
//        {
//            System.out12.println("Fecha incorrecta");
//        }
  
          if(validarFecha(dia, mes, anyo)) //validarFecha(dia, mes, anyo)==true
         {
            System.out.println("Fecha correcta");
        }
        else
        {
            System.out.println("Fecha incorrecta");
        }       
    }
    
    public static boolean validarFecha(int dia, int mes, int anyo)
    {
        boolean error = true;
        if (anyo<1900)
        {
            //return false;
            error = false;
        }
        else if (mes < 1 || mes>12)
        {
            error = false;
        }
        else if(dia>30 || dia < 1)
        {
            error = false;
        }
        
        return error;
    }
    
    public static int pedirNumero(String frase){
          Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        return  sc.nextInt();
    }
}
