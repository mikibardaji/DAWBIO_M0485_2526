/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Luchador;
import Modelo.LuchadorDAOBD;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.InputMismatchException;
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
                        listarLuchadores(repositori);
                        break;
                    case 3:
                        System.out.println("? Borrar Luchador");
                        borrarLuchador(repositori);
                        break;
                    case 4:
                        System.out.println("? Listar Luchadores que no superen el peso.");
                        listarLuchadoresPeso(repositori);
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

    //VIIIIIsta
 private void listarLuchadores(LuchadorDAOBD repositori) {
       
        try {
            List<Luchador> listaluchadores = repositori.getAll();
            mostrarResultados(listaluchadores, "Todos los luchadores");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        
        
    }

private void altaLuchadores(LuchadorDAOBD repositori) {
       
        try{
        System.out.println("Dime el ID del Luchador");
        int id = sc.nextInt();
       
        sc.nextLine();
       
        System.out.println("Dime el nombre del Luchador");
        String nombre = sc.nextLine();
       
        System.out.println("Dime el peso del luchador");
        int peso = sc.nextInt();
       
        Luchador Wrestler = new Luchador(id, nombre, peso);
       
        int filas = repositori.altaLuchador(Wrestler);
       
            if (filas == 0) {
                System.out.println("No se ha podido dar de alta al luchador.");
            }
            else
            {
                System.out.println("Se ha dado de alta al luchador!");
            }
       
        }catch(InputMismatchException ex)
        {
            System.err.println("Se tiene que introducir un numero entero!");
            System.err.println(ex.getMessage());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

private void borrarLuchador(LuchadorDAOBD repositori) {
        try {
            System.out.println("Inserte el nombre del luchador a borrar: ");
            String nombre = sc.nextLine();
            Luchador borrado = new Luchador(4673673,nombre,643278);
            
            int filas = repositori.removeLuchador(borrado);
            
            if(filas != 0){
                System.out.println("Borrados " + filas + " luchadores");
            }
            else{
                System.out.println("No se ha podido borrar " + borrado.getNombre());
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
    }

    private void listarLuchadoresPeso(LuchadorDAOBD repositori) {
        //pedir datos entrada
         System.out.print("Inserta peso maximo de los luchadores: ");
         int pesoMax = sc.nextInt();
         //validaciones de les dades que ens han suministrat.
         if (pesoMax > 0)
         {
             try {
                 //cridarem al model
                 List<Luchador> luchadoresPermitidos = repositori.filtrarLuchadorPeso(pesoMax);
                 mostrarResultados(luchadoresPermitidos, "Luchadores que no superan el peso " + pesoMax );
                 
             } catch (SQLException ex) {
                 System.err.println(ex.getMessage());
             }
             
         }
         else
         { //throw exception 
             System.err.println("Peso debe ser positivo");  
         }
         
    }

    private void mostrarResultados(List<Luchador> luchadoresPermitidos, String titulo) {
        System.out.println(titulo);
                 for (Luchador wrestler : luchadoresPermitidos) {
                     System.out.println(wrestler);
                 }
        System.out.println("Luchadores mostrados: " + luchadoresPermitidos.size());
    }
}
