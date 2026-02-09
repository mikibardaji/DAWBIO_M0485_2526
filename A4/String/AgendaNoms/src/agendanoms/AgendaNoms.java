/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendanoms;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AgendaNoms {

public static void main(String[] args) {
    String agenda[] = new String[10];
    char opcio;
    ponerAgendaBlanco(agenda);
    afegirNomsProva(agenda);
do {
        mostrarMenu();
        opcio = obtenirOpcioUsuari();

        switch (opcio) {
        case 'a':
            llistat(agenda);
        break;
        case 'b':
            afegirNom(agenda);
        break;
        case 'c':
            modificarNom(agenda);
        break;
        case 'd':
            esborrarNom(agenda);
        break;
        case 'e':
        //opcio
        break;
        default:
        System.out.println("Opció no vàlida. Torna a intentar.");
        }

} while (opcio!='e');
}

private static void mostrarMenu() 
{
    System.out.println("Menú:");
    System.out.println("a. Llistar noms");
    System.out.println("b. Afegir nom");
    System.out.println("c. Modificar nom");
    System.out.println("d. Esborrar nom");
    System.out.println("e. Sortir");
}

private static char obtenirOpcioUsuari() 
{
    Scanner scanner = new Scanner(System.in);

    System.out.print ("Selecciona una opció: ");
    //recollir lletra i retornar-la
    return scanner.next().charAt(0);
}

/*
Llistar noms (mostrarà tots els noms fins al moment, 
al moment de llistar-lo, els ha de mostrar amb majuscules 
i a mes al canto, el numero de lletres que tinguis, 
si no tenen infirmació o estan en blanc no s'han de mostrar) 
*/
    private static void llistat(String[] agenda) {
        int cont_Nonulls=0;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i]!=null && !agenda[i].equals("")) //agenda.isEmpty()
            { //si esta informat abans
                System.out.println(agenda[i].toUpperCase());
                cont_Nonulls++;
            }
        }
        System.out.println("Noms agenda.... " + cont_Nonulls);
    }

    /*
    Afegir nom(Buscara la primera posició no informada
    i afegira el nom introduit al usuari)
    */
    private static void afegirNom(String[] agenda) {
        String nom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un nom per afegir... ");
        nom = sc.nextLine();
        for (int i = 0; i < agenda.length; i++) {
            //si he inicialitzat el array a espais
            //if (agenda[i].equals(""))
            if (agenda[i].isEmpty())
            {
               agenda[i] = new String(nom);
               System.out.println("El nom " + nom + " s'ha afegit... ");
               break; //sortir del bucle 
            }
            //si no he inicialitzat el array a espais o sea esta a null las vacias
            if (agenda[i]==null)
            { //s¡informa la primera posiciço
                agenda[i] = new String(nom);
                System.out.println("El nom " + nom + " s'ha afegit... ");
               break; //sortir del bucle
               //i = agenda.length (aix? fa sortir també del buckle
            }
        }
    }

    private static void afegirNomsProva(String[] agenda) {
            agenda[0] = new String("David de Mingo");
            agenda[1] = new String("Camilo");
            agenda[2] = new String("Amoros");
    }

    private static void modificarNom(String[] agenda) {
        String nom, nom_canviat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin nom vols canviar");
        nom = sc.nextLine();
        System.out.println("Per quin nom el canvies");
        nom_canviat = sc.nextLine();
        boolean trobat = false;
        int pos = 0;
        while (pos<agenda.length && !agenda[pos].equalsIgnoreCase(nom))
        {
            pos++;
        }
        if (pos<agenda.length)
        {
            agenda[pos] = nom_canviat;
            System.out.println("He canviat el nom "
                + nom  + " per " + nom_canviat);
        }
        else
        {
            System.out.println("No s'ha canviat el nom " + nom);
        }
        
        /* opcio 2 amb nulls
        for (int i = 0; i < agenda.length; i++) {
            if(agenda[i]!= null && agenda[i].equals(nom))
            {
                trobat = true;
                agenda[i] = nom_canviat;
                //agenda[i] = new String(nom_canviat);
                System.out.println("He canviat el nom "
                + nom  + " per " + nom_canviat);
            }
        }
        if (!trobat)
        {
            System.out.println("No s'ha canviat el nom " + nom);
        }
        */
    }

    private static void ponerAgendaBlanco(String[] agenda) {
          for (int i = 0; i < agenda.length; i++) {
            agenda[i] = "";
        }
    }

    private static void esborrarNom(String[] agenda) {
        String nom_borrar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin nom vols eliminar");
        nom_borrar = sc.nextLine();
        boolean trobat = false;
        for (int i = 0; i < agenda.length; i++) {
            //if (agenda[i]!=null && agenda[i].equalsIgnoreCase(nom_borrar))
            if (agenda[i].equalsIgnoreCase(nom_borrar)) //todas las posicoines estan
                //a espacio (Informadas)
            {
                agenda[i] = "";
                System.out.println("He borrado " + nom_borrar);
                trobat = true;
            }
        }
        if(!trobat)
        {
            System.out.println("No existeix el nom " + nom_borrar) ;
        }
    }
    
}
