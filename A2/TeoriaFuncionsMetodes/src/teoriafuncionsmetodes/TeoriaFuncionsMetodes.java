/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriafuncionsmetodes;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaFuncionsMetodes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcio;
        //crida a metodes 
        //metode que saluda
        salutacio();
        menu();
        opcio = demanarOpcioMenu(0,2);
        //que demani al usuari la opció del menú
        System.out.println("Has escollit la opcio " + opcio);
        opcio = demanarOpcioMenu(0,5);
        //que demani al usuari la opció del menú
        System.out.println("Has escollit la opcio " + opcio);
   
    } //final main
    
    
    private static void salutacio()
    { //al ser void no acaba amb return
        System.out.println("Hola que tal estas.... ");   
    }
    
    /*
    Metode que m'imprimeixi un menu
     que tingui opcio 0-Sortir, 1 Jugar, 2.- Configuració
    */
    private static void menu()
    {
        System.out.println("===========================");
        System.out.println("| 0.- Sortir              |");
        System.out.println("| 1.- Jugar               |");
        System.out.println("| 2.- Configuracio        |");
        System.out.println("===========================");
    }
    
    
    private static int demanarOpcioMenu(int opcion_minima, int opcion_maxima)
    { 
        //sempre ha d'acabar amb return (tipus);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Pon la opción del menu escogida (" + opcion_minima
        + "-" + opcion_maxima + ")");
        opcion = sc.nextInt();
        //}while(!(opcion <= opcion_maxima && opcion >= opcion_minima));
        }while(opcion < opcion_minima || opcion> opcion_maxima);
        //cuando quiero opcion <= opcion_maxima && opcion >= opcion_minima
        
        return opcion;
    }
    
    
} //public class TeoriaFuncionsMetodes  final
