/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.SequenciaGenetica;
import Modelo.SequenciaGeneticaDao;
import Modelo.idBlankException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class VistaPrincipal {
    
     Scanner sc = new Scanner(System.in);
 
    public void run()
    {
        /* Crear una variable pel model de dades*/
        SequenciaGeneticaDao laboratori = new SequenciaGeneticaDao();
        Menu menuSequencia = new Menu("Laboratorio");
        anyadirOpcionesMenu(menuSequencia);
        int opcion=0;
        do {
            menuSequencia.mostrarMenu();

            boolean valorEntero = false;
                
                opcion = menuSequencia.llegirOpcioValida();

                    switch (opcion) {
                        case 1:
                            System.out.println("? Alta ");
                            altaSequencia(laboratori);
                            break;
                        case 2:
                            System.out.println("? Listar ");
                            listarSequencia(laboratori);
                            break;
                        case 3:
                            System.out.println("? Estadisticas");
                            estadistiques(laboratori);
                            break;
                        case 4:
                            System.out.println("? Actualizar sequencia.");
                            actualitzarSequencia(laboratori);
                            break;
                        case 5:
                            System.out.println("? Eliminar");
                            eliminarSequencia(laboratori);
                            break;                            
                        default:
                            if (menuSequencia.getOpcioSalida() != opcion)
                            {
                                System.err.println("Opció incorrecta. Apreta enter i torna al menu");
                                sc.nextLine();
                            }
                       // case 8: salida no hace falta controlarla
                      //      System.out.println("? Saliendo del programa...");
                      //      break;
                    }
                
        } while (opcion != menuSequencia.getOpcioSalida());
        
        System.out.println("? Saliendo del programa...");
        sc.close();
    }
    
    

    private void anyadirOpcionesMenu(Menu menuP) {
        menuP.afegirOpcio("Ingressar mostra");
        menuP.afegirOpcio("Llistar banc de dades");
        menuP.afegirOpcio("Estadístiques de seqüenciació");
        menuP.afegirOpcio("Actualitzar longitud");
        menuP.afegirOpcio("Eliminar mostra");
        menuP.afegirOpcio("Buscar ID");
        menuP.afegirOpcio("Salir");
        menuP.setOpcioSalida(7); //salida
    }

    private void altaSequencia(SequenciaGeneticaDao repositori) {
        System.out.println("Dis-me el codi sequencia");
        String id = sc.nextLine().toUpperCase();
        System.out.println("Dis-me el organisme");
        String org = sc.nextLine();
        System.out.println("Dis-me la longitud");
        int longitud = sc.nextInt();
        sc.nextLine();
        SequenciaGenetica anyadir = new SequenciaGenetica(id, org, longitud);
        if(repositori.registrarMostra(anyadir))
        {
            System.out.println("Sequencia afegida: " + id);
        }
        else
        {
            System.err.println("Sequencia ja insertada " + id);
        }
        
    }

    private void listarSequencia(SequenciaGeneticaDao repositori) {
        //Collection<SequenciaGenetica> all = repositori.obtenirTotes();
        //List<SequenciaGenetica> all2 = new ArrayList<>(all);
        List<SequenciaGenetica> all = repositori.obtenirTotes2();
        //mostrar sortida
        for (SequenciaGenetica seq : all) {
            System.out.println(seq);
        }
        System.out.println("total: " + all.size());
    }

    private void estadistiques(SequenciaGeneticaDao repositori) {
         double media = repositori.calcularMitjanaLongitud();
         System.out.println("La mitja de totes les mostres es "
         + media);
        
    }

    /* vull cambiar la longitud de una sequencia donada*/
    private void actualitzarSequencia(SequenciaGeneticaDao repositori) {
        try{
        System.out.println("Dis-me el codi sequencia");
        String id = sc.nextLine().toUpperCase();
         System.out.println("Dis-me la longitud");
        int longitud = sc.nextInt();
        
        //SequenciaGenetica updateFake = new SequenciaGenetica(id, "", longitud);
        if (repositori.updateLongitud(id,longitud))
        {
            System.out.println("Sequencia cambiada");
        }
        else
            System.out.println("No hi ha cap sequencia amb el id " + id);
        } catch(InputMismatchException e)
        {
            System.out.println("Longitud tindra que ser numerica");
            System.out.println(e.getMessage());
        }
        
    }

    private void eliminarSequencia(SequenciaGeneticaDao repositori) {
        System.out.println("Dis-me el codi sequencia");
        String id = sc.nextLine().toUpperCase();
         try {
             SequenciaGenetica deleted = repositori.deleteSequencia(id);
             if (deleted!=null)
                System.out.println("He borrat " + deleted);
             else
                 System.out.println("No existeix la sequencia " + id);
         } catch (idBlankException ex) {
             System.out.println(ex.getMessage());
         }
    }
}
