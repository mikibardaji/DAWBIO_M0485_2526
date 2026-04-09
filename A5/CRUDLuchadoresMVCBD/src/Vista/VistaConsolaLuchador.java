/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.LuchadorDAOBD;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class VistaConsolaLuchador {
    Scanner sc = new Scanner(System.in);
    
    
    public void run()
    {   
        try {
            LuchadorDAOBD repositori = new LuchadorDAOBD();
            /* Crear una variable pel model de dades*/
            //LuchadorDAOList repositori = new LuchadorDAOList();
            Menu menuLuchador = new Menu("Mantenimiento Luchadores");
            anyadirOpcionesMenu(menuLuchador);
            int opcion=0;
            do {
                menuLuchador.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuLuchador.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("? Alta Luchador.");
                        //altaLuchadores(repositori);
                        break;
                    case 2:
                        System.out.println("? Listar todos Luchadores");
                        //listarLuchadores(repositori);
                        break;
                    case 3:
                        System.out.println("? Borrar Luchador");
                        //borrarLuchador(repositori);
                        break;
                    case 4:
                        System.out.println("? Listar Luchadores que no superen el peso.");
                        //listarLuchadoresPeso(repositori);
                        break;
                    case 5:
                        System.out.println("? Alta en posicion elegida");
                        //anyadirLuchadorPosicion(repositori);
                        break;
                    case 6:
                        //cambiarNombre(repositori);
                        break;
                        // case 8: no hace falta controlarla
                        //      System.out.println("? Saliendo del programa...");
                        //      break;
                }
                
            } while (opcion != menuLuchador.getOpcioSalida());
            
            System.out.println("? Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando drivers");
            System.out.println(ex.getMessage());
        }
    }

    

    private void anyadirOpcionesMenu(Menu menuLuchador) {
        menuLuchador.afegirOpcio("Alta Luchador");
        menuLuchador.afegirOpcio("Listar todos Luchadores");
        menuLuchador.afegirOpcio("Borrar Luchador");
        menuLuchador.afegirOpcio("Listar Luchadores por categoria peso");
        menuLuchador.afegirOpcio("Añadir Luchador en posicion elegida");
        menuLuchador.afegirOpcio("Cambiar nombre luchador (pedir idLicencia)");
        menuLuchador.afegirOpcio("Salir");
        menuLuchador.setOpcioSalida(7); //salida
    }
}
