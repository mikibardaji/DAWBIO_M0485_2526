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
        System.out.print("Introdueix capacitat m‡xima del repositori: ");
        int capacitat = scanner.nextInt();

        /* Crear una variable pel model de dades*/
        RepositoriProductesDAO repositori = 
                new RepositoriProductesDAO(capacitat);

        int opcio;

        do {
            mostrarMenu();
            opcio = scanner.nextInt();

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
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opci√≥ no v√†lida.");
            }

        } while (opcio != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- GESTI√ì DE PRODUCTES ---");
        System.out.println("1. Afegir producte");
        System.out.println("2. Llistar productes");
        System.out.println("3. Cercar producte per ID");
        System.out.println("4. Eliminar producte (Casa)");
        System.out.println("5. Buscar productos con mismo nombre (Casa)");        
        System.out.println("0. Sortir");
        System.out.print("Escull una opci√≥: ");
    }

    private void afegirProducte(RepositoriProductesDAO repositori)  {
        int id;
        
        try {
            /*1 pas (opcional) recollida dades*/
            System.out.print("ID: ");
            id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nom: ");
            String nom = scanner.nextLine();

            System.out.print("Preu: ");
            double preu = scanner.nextDouble();

            Producte p = new Producte(preu, nom);
            p.setId(id);
            
            if (repositori.afegirProducte(p))//modelo CRUD
            { //salida datos
                System.out.println("Producte afegit correctament.");
            }
            else
            {
                System.out.println("No se ha aÒadido el producto: " 
                + p); //toString
            }
            

        } catch (RepositoriPleException e) {
            System.out.println("ERROR: " + e.getMessage());
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
    }

    private void llistarProductesPreus(RepositoriProductesDAO repositori) {
        /* recogida datos (Si hay)*/
        System.out.print("Que presupuesto tienes? ");
        double limite = scanner.nextDouble();
        /* interaccion con el modelo CRUD*/
        List<Producte> todos = repositori.obtenirTotsPrecioBajo(limite);
        /*3.- Salida de datos*/
        System.out.println("\n--- LLISTA DE PRODUCTES ---");
        System.out.println("No superan " + limite +  "Ä");
        for (Producte p : todos) {
            System.out.println(p);
        }
    }    
    
    
    private void cercarProducte(RepositoriProductesDAO repositori) {
        try {
            System.out.print("Introdueix ID a cercar: ");
            int id = scanner.nextInt();

            Producte trobat = repositori.cercarPerId(id);

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

        if (repositori.eliminarProducte(id)) {
            System.out.println("Producte eliminat.");
        } else {
            System.out.println("No s'ha trobat el producte.");
        }
    }
}