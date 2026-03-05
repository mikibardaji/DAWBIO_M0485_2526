/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudbasico;

import Objetos.Luchador;
import Objetos.NotValidWeightException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class CRUDBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        List<Luchador> mundial;
        mundial = new ArrayList();
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
                
                

                if (opcion < 1 || opcion > 5) {
                    System.out.println("? Opción no válida. Debe ser entre 1 y 5.");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("? Alta Luchador.");
                            altaUsuario(mundial);
                            break;
                        case 2:
                            System.out.println("? Aquí irá el código de la opción 2.");
                            break;
                        case 3:
                            System.out.println("? Aquí irá el código de la opción 3.");
                            break;
                        case 4:
                            System.out.println("? Aquí irá el código de la opción 4.");
                            break;
                        case 5:
                            System.out.println("? Saliendo del programa...");
                            break;
                    }
                }
        } while (opcion != 5);

        sc.close();
    }

    private static void mostrarMenu() {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Alta Luchador");
            System.out.println("2. Listar todos Luchadores");
            System.out.println("3. Borrar Luchador");
            System.out.println("4. Listar Luchadores por criterio.");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
    }

    private static void altaUsuario(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
         try {
        System.out.println("Pon el numero de licencia");
        int id = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        System.out.println("Pon el nombre del luchador");
        String nombre = sc.nextLine();
        System.out.println("Pon el peso del luchador");
        int peso = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        
        Luchador wrestler = new Luchador(id, nombre);
       
        wrestler.setPeso(peso);
        
        if (mundial.add(wrestler))
        {
            System.out.println("Luchador añadido");
        }
        else
        {
            System.out.println("Luchador no se ha podido añadir");
        }
        
        
        } catch (NotValidWeightException ex) {
             System.out.println(ex.getMessage());
             System.out.println("Vuelve a intentar dar de alta");
        }
        
        
        
    }
    
}
