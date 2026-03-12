package Vista;

import Modelo.*;
import java.util.List;
import java.util.Scanner;

/*
Te entrada i sortida dades  (souts/Scanner)
aquest te els try-catch (si n'hi han
*/

public class VistaConsola {

    private Scanner scanner;

/*    public static void main(String[] args) {
        VistaConsola app = new VistaConsola();
        app.run();
    }*/

    public void run() {
        scanner = new Scanner(System.in);

        /* Opcional demanar dades per inicialitzar*/
        System.out.print("Introdueix capacitat màxima del repositori: ");
        int capacitat = scanner.nextInt();

        /* Crear una variable pel model de dades*/
        RepositoriProductesDAO repositori = 
                new RepositoriProductesDAO(capacitat);

        int opcio;

        do {
            mostrarMenu();
            opcio = scanner.nextInt();
            scanner.nextLine();//limpio el enter despues del int
            switch (opcio) {
                case 1:
                    afegirProducte(repositori);
                    break;
                case 2:
                    llistarProductes(repositori);
                    break;
                case 3:
                    cercarProducte(repositori);
                    break;
                case 4:
                    eliminarProducte(repositori);
                    break;
                case 5:
                    listarProductosNombre(repositori);
                    break;
                case 6:
                    BorrarProductosByPrecio(repositori);
                    break;

                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opci?³ no v? lida.");
            }

        } while (opcio != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- GESTIÓ DE PRODUCTES ---");
        System.out.println("1. Afegir producte");
        System.out.println("2. Llistar productes");
        System.out.println("3. Cercar producte per ID");
        System.out.println("4. Eliminar producte (Casa)");        
        System.out.println("5. Buscar productos con mismo nombre (Casa)");        
        System.out.println("6. Eliminar producte mas bajos de un precio");
        System.out.println("0. Sortir");
        System.out.print("Escull una opció: ");
    }

    private void afegirProducte(RepositoriProductesDAO repositori)  {
        int id;
        
        try {
            /*1 pas (opcional) recollida dades*/
            System.out.print("ID: ");
            id = scanner.nextInt();
            scanner.nextLine();

            String nom;
            do
            {
                System.out.print("Nom no pot ser buit: ");
                nom = scanner.nextLine();
            }while(nom.isBlank()); //validació entrada
            

            System.out.print("Preu: ");
            double preu = scanner.nextDouble();

            Producte p = new Producte(preu, nom);
            p.setId(id);
            
            if (repositori.afegirProducte(p))//modelo CRUD (Create)
            { //salida datos
                System.out.println("Producte afegit correctament.");
            }
            else
            {
                System.out.println("No se ha añadido el producto: " 
                + p); //toString
            }
        } catch (RepositoriPleException e) {
            System.out.println("ERROR: " 
                    + e.getMessage());
        }
        catch (IdNegativaException e) {
            System.out.println("Id erronea " + e.getMessage());
        }
    }

    private void llistarProductes(RepositoriProductesDAO repositori) {
        /* recogida datos (No hay)*/
        
        /* interaccion con el modelo CRUD*/
        List<Producte> todos = repositori.obtenirTots();
        /*3.- Salida de datos*/
        System.out.println("\n--- LLISTA DE PRODUCTES ---");
        for (Producte p : todos) {
            System.out.println(p);
        }
        System.out.println("Productos mostrados "+ todos.size());
    }

    private void llistarProductesPreus(RepositoriProductesDAO repositori) {
        /* recogida datos (Si hay)*/
        System.out.print("Que presupuesto tienes? ");
        double limite = scanner.nextDouble();
        /* interaccion con el modelo CRUD*/
        List<Producte> todos = repositori.obtenirTotsPrecioBajo(limite);
        /*3.- Salida de datos*/
        System.out.println("\n--- LLISTA DE PRODUCTES ---");
        System.out.println("No superan " + limite +  "€");
        for (Producte p : todos) {
            System.out.println(p);
        }
        System.out.println("Productos mostrados "+ todos.size());
    }    
    
    
    private void cercarProducte(RepositoriProductesDAO repositori) {
        try {
            System.out.print("Introdueix ID a cercar: ");
            int id = scanner.nextInt();

            Producte trobat = repositori.cercarPerId(id); //CRUD Read
            //sortida dades
            if (trobat != null) {
                System.out.println("Producte trobat:");
                System.out.println(trobat);
            } else {
                System.out.println("No existeix cap producte amb aquest ID.");
            }
        } catch (IdNegativaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void eliminarProducte(RepositoriProductesDAO repositori) {
        System.out.print("Introdueix ID a eliminar: ");
        int id = scanner.nextInt();

        try {
            if (repositori.eliminarProducte(id)) {
                System.out.println("Producte eliminat.");
            } else {
                System.out.println("No s'ha trobat el producte.");
            }
        } catch (IdNegativaException ex) {
            System.err.println("Error borrando producto " + ex.getMessage());
        } //err per pintar amb vermell
    }

    private void listarProductosNombre(RepositoriProductesDAO repositori) {
        //pedir un nombre
        System.out.print("Introduce el nombre del producto ");
        String nombre = scanner.nextLine();
        //consultar al modelo que me de todos los que tengan ese nombre
        List<Producte> allByName = repositori.getProductsByName(nombre);
        //listarlos
        for (Producte producte : allByName) {
            System.out.println(producte);
        }
        System.out.println("Productos con nombre " + nombre + " : " + allByName.size());
    }

    private void BorrarProductosByPrecio(RepositoriProductesDAO repositori) {
        System.out.println("Que precio quieres de limite para borrar");
        int precioLimite = scanner.nextInt();
        
        int borrados = repositori.deleteByPrecioLimite(precioLimite);
        if (borrados == 0)
        {
            System.out.println("No se ha boorado nada");
        }
        else
        {
            System.out.println("Se han borrado " + borrados);
        }
    }
}