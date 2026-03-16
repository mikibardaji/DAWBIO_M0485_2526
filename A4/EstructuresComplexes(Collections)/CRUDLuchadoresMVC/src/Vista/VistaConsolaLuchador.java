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
                            System.out.println("? Listar Luchadores que no superen el peso.");
                            listarLuchadoresPeso(repositori);
                            break;
                        case 5:
                            System.out.println("? Alta en posicion elegida");
                            anyadirLuchadorPosicion(repositori);
                            break;                            
                        case 6:
                            cambiarNombre(repositori);
                            break;
                       // case 8: no hace falta controlarla
                      //      System.out.println("? Saliendo del programa...");
                      //      break;
                    }
                
        } while (opcion != menuLuchador.getOpcioSalida());
        
        System.out.println("? Saliendo del programa...");
        sc.close();
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
            num++;
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

    private void listarLuchadoresPeso(LuchadorDAO repositori) {
        System.out.println("Pon el peso maximo de los luchadores");
        int peso = sc.nextInt();
        
        List<Luchador> WrestlerByPeso = repositori.damiIlotatoriConPesoMismo(peso);
        System.out.println("Luchadores que no superan " + peso + " kg. ");
        for (Luchador luchador : WrestlerByPeso) {
            System.out.println(luchador);
        }
        System.out.println("Listados: " + WrestlerByPeso.size());  
    }

    private void anyadirLuchadorPosicion(LuchadorDAO repositori) {
                  /*pedir datos entrada*/
        System.out.println("Pon el numero de licencia");
        int id = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        System.out.println("Pon el nombre del luchador");
        String nombre = sc.nextLine();
        System.out.println("Pon el peso del luchador");
        int peso = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        int posicion;
        Luchador wrestler = new Luchador(id, nombre);
        try {  
            wrestler.setPeso(peso);
            System.out.println("Pon en que posicion quieres al luchador: ");
            posicion = sc.nextInt()-1; 
            if (repositori.addLuchadorByPosition(wrestler, posicion))
            {
                System.out.println("Luchador añadido en la posicion" + (posicion+1));
            }
            {
                System.out.println("No se ha podido añadir "
                        + "posiblemente no hay tantos luchadores");
            }
            
        } catch (NotValidWeightException ex) {
            System.err.println(ex.getMessage());
        }
    }

    //cambiar nombre y pido licencia
    private void cambiarNombre(LuchadorDAO repositori) {
        System.out.println("Pon el numero de licencia del luchador que cambias nombre");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Pon el nuevo nombre luchador ");
        String nombre = sc.nextLine();
        Luchador updateFake = new Luchador(id, nombre);
        if (repositori.updateNombreById(updateFake))
        {
            System.out.println("He cambiado el nombre");
        }
        else
        {
            System.out.println("No habia luchador con este id");
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
