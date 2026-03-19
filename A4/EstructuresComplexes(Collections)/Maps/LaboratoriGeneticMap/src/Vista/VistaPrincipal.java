/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.SequenciaGenetica;
import Modelo.SequenciaGeneticaDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

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

    private void actualitzarSequencia(SequenciaGeneticaDao repositori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void eliminarSequencia(SequenciaGeneticaDao repositori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
