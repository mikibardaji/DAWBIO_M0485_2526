/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Luchador;
import Modelo.LuchadorDAO;
import Modelo.NotValidWeightException;
import java.util.InputMismatchException;
import java.util.List;
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
        /* Crear una variable pel model de dades*/
        LuchadorDAO repositori = new LuchadorDAO();
        int opcion=0;
        do {
            mostrarMenu();

            boolean valorEntero = false;
                
                do{
                    try
                        {
                            opcion = sc.nextInt();
                            valorEntero = true;
                            sc.nextLine();
                        }
                    catch(InputMismatchException ex)
                    {
                          System.out.println("? Debes introducir un número.");
                          sc.nextLine();
                    }
                }while(!valorEntero);

                if (opcion < 1 || opcion > 8) {
                    System.out.println("? Opción no válida. Debe ser entre 1 y 8.");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("? Alta Luchador.");
                            altaLuchadores(repositori);
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
                            System.out.println("? Listar Luchadores.");
                            //listarLuchadoresPeso(mundial);
                            break;
                        case 5:
                            System.out.println("? Alta en posicion elegida");
                            //anyadirLuchadorPosicion(mundial);
                            break;                            
                        case 6:
                            //cambiarNombre(mundial);
                            break;
                        case 7:
                            //System.out.println("nueva opcion");
                            break;
                        case 8:
                            System.out.println("? Saliendo del programa...");
                            break;
                    }
                }
        } while (opcion != 8);
        
        sc.close();
        
        
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Alta Luchador");
        System.out.println("2. Listar todos Luchadores");
        System.out.println("3. Borrar Luchador");
        System.out.println("4. Listar Luchadores por categoria peso");
        System.out.println("5. Añadir Luchador en posicion elegida");
        System.out.println("6. Cambiar nombre luchador (pedir idLicencia)");
        System.out.println("7. nueva opcion");
        System.out.println("8. Salir");
        System.out.print("Elige una opción: ");
    }

    private void altaLuchadores(LuchadorDAO repositori) {
        /*pedir datos entrada*/
         System.out.println("Pon el numero de licencia");
        int id = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        System.out.println("Pon el nombre del luchador");
        String nombre = sc.nextLine();
        System.out.println("Pon el peso del luchador");
        int peso = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        
        Luchador wrestler = new Luchador(id, nombre);
        try {
            wrestler.setPeso(peso);
         /*interaccionar*/
            
         if (repositori.addLuchador(wrestler))
         {
             System.out.println("Añadido " + wrestler.getNombre());
         }
         else
         {
             System.out.println("No se ha podido añadir " + wrestler);
         }
  
        } catch (NotValidWeightException ex) {
            System.out.println("Error de peso " + ex.getMessage());
        }
        
        
        
    }

    private void listarLuchadores(LuchadorDAO repositori) {
        
        List<Luchador> allWrestlers = repositori.getAllWrestlers();
        //salida datos 
        int num=1;
        for (Luchador Wrestler : allWrestlers) {
            System.out.println(num + "-" + Wrestler);
        }
        System.out.println("Mostrados: " + allWrestlers.size());
    }

    private void borrarLuchador(LuchadorDAO repositori) {
        System.out.println("Pon el numero de licencia del luchador a borrar");
        int id = sc.nextInt();
        Luchador fakeDelete = new Luchador(id, "delete");
        
        /*Opcion 1 solo devuelve true/false*/
        if(repositori.deleteFromLuchador(fakeDelete))
        {
            System.out.println("Se ha borrado el luchador");
        }
        else
        {
            System.out.println("No se ha boorado");
        }
    
        /*Opcion 2 si lo borra, devuelve los datos devueltos*/
        Luchador wrestlerBorrado = repositori.deleteFromLuchador2(fakeDelete);
        if (wrestlerBorrado==null)
        {
            System.out.println("No se ha boorado");
        }
        else
        {
            System.out.println("Se ha borrado " + wrestlerBorrado);
        }
                
        
        
        
    }
}
