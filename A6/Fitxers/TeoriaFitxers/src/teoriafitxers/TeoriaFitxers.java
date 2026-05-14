/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriafitxers;

import PersistenciaFitxers.FileCharRead;
import PersistenciaFitxers.FileCharWriter;
import PersistenciaFitxers.FileLineRead;
import PersistenciaFitxers.FileLineWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class TeoriaFitxers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //fileComDirectori();
        
        //provesFile();
        //llegirFitxerCaracters();
        //escriureFitxerSortida();
        //copiaSeguretatFitxer();
        //lecturaFitxerLinea();
        EscrituraFicheroLinea();
    }

    private static void mostrarRutas(File f) {
          System.out.println("getParent " + f.getParent());
          System.out.println("getName " + f.getName());
          System.out.println("absoluteParh " + f.getAbsolutePath());
          System.out.println("Existe fichero  " + f.exists());
    }

    private static void provesFile() {
        File f; //per referenciar qualsevol fitxer que volem tractar
        // ruta absoluta tota la direccio del fixer, desde la arrel
        f = new File("C:\\Users\\mabardaji\\Documents\\juego.pdf");

        //ruta relativa
        //agafa la carpeta d'execucio del programa
        //C:\Users\mabardaji\Documents\M0485\A6\Fitxers\TeoriaFitxers
        File f2  = new File("fitxers\\prova.txt");
         File f3  = new File("fitxers\\prova2.txt");
        System.out.println("fitxer ruta absoluta");
        mostrarRutas(f);
        System.out.println("Fitxer ruta relativa");
        mostrarRutas(f2);
        System.out.println("Invntat");
        mostrarRutas(f3);
        File f4 = new File("fitxers\\");
        mostrarRutas(f4);
    }

    
    /* això seria agafar un file(carpeta) i obtenir
    tots els fitxers que depenen d'aquesta (carpetes i fitxers)
    */
    private static void fileComDirectori() {
          File directori = new File("C:\\Users\\mabardaji\\Downloads");
          if (directori.isDirectory())
          {
              //obtindrem el llistat de files
              File[] fitxer = directori.listFiles();
              long bytesTotals= 0;
              for (File arxiu : fitxer) 
              {
                  if (arxiu.isDirectory())
                  {
                      System.out.println("Carpeta --> " + arxiu.getName());
                  }
                  else
                  {
                      bytesTotals += arxiu.length();
                      System.out.println("Arxiu **> " + arxiu.getName());
                      if (arxiu.getName().equalsIgnoreCase("borrar.java"))
                      {
                          if (arxiu.delete())
                          {
                              System.out.println("Borrat");
                          }
                      }
                      if (arxiu.isHidden())
                      {
                          System.out.println("Fitxer ocult!!!!");
                      }
                  }
              }
              System.out.println("bytes totals " + bytesTotals);
          }
    }

    /*
    Obrir un fitxer llegir-lo caracter a caracter i mostrar-lo
    */
    private static void llegirFitxerCaracters() {
        try {
            FileCharRead ficheroLectura = new FileCharRead("FicherosPrueba\\datosEntrada.txt");
            
            
          /*  int ascii;
            do
            {
                ascii = ficheroLectura.llegirCaracter();
                if (ascii!=-1)
                {
                    System.out.print((char) ascii);
                }
            }while(ascii!=-1);
            System.out.println("");
            ficheroLectura.tancarFitxer();*/
           /* List<Character> todoTexto = ficheroLectura.llegirTotFitxerCaracter();
            for (Character letra : todoTexto) {
                System.out.print(letra + "-");
            }
            */
        } catch (FileNotFoundException ex) {
            System.err.println("Fitxer no existeix");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error leyendo datos fichero entrada");
            System.out.println(ex.getMessage());
        }
    }

    private static void escriureFitxerSortida() {
        try {
            FileCharWriter FileW = new FileCharWriter("FicherosPrueba\\salida.txt");
            String frase = "El barça va guanyar la lliga";
            
            for (int i = 0; i < frase.length(); i++) {
                char letra = frase.charAt(i);
                FileW.EscribirCaracter(letra);
            }
            FileW.tancarFitxer();
            System.out.println("He escrit el fitxer salida.txt");
        } catch (IOException ex) {
            System.err.println("Error leyendo datos fichero entrada");
            System.out.println(ex.getMessage());
        }
    }

    private static void copiaSeguretatFitxer() {
               try {
            FileCharRead ficheroLectura = new FileCharRead("FicherosPrueba\\datosEntrada.txt");
            FileCharWriter FileW = new FileCharWriter("FicherosPrueba\\salida2.txt");
            
            int ascii;
            do
            {
                ascii = ficheroLectura.llegirCaracter();
                if (ascii!=-1)
                {
                    FileW.EscribirCaracter((char) ascii);
                    //System.out.print((char) ascii);
                }
            }while(ascii!=-1);
            System.out.println("Fitxer copiat a FicherosPrueba\\salida2.txt");
            ficheroLectura.tancarFitxer();
            FileW.tancarFitxer();
          
            
        } catch (FileNotFoundException ex) {
            System.err.println("Fitxer no existeix");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error leyendo datos fichero entrada");
            System.out.println(ex.getMessage());
        }
    }

    private static void lecturaFitxerLinea() {
        try {
            System.out.println("Lectura fichero de linea en linea");
            FileLineRead entradaDatos = new FileLineRead("FicherosPrueba\\datosEntrada.txt");
            
            List<String> lineasFichero = entradaDatos.readAllLinesFromFile();
            for (String lineaIndividual : lineasFichero) {
                //tratamiento individual 
                //cambis als string
                System.out.println(lineaIndividual);
            }
            System.out.println("Cerrando Ficheros");
            entradaDatos.tancarFitxers();
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("Fitxer no existeix");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error leyendo datos fichero entrada");
            System.out.println(ex.getMessage());
        }
    }

    private static void EscrituraFicheroLinea() {
        try {
            FileLineWriter salidaDatos = 
                    new FileLineWriter("FicherosPrueba\\salidaLineaLinea.txt");
            Scanner sc = new Scanner(System.in);
            String lineaEscrita;
            do
            {
                System.out.println("Pon una linea a escribir en el fichero:");
                lineaEscrita = sc.nextLine();
                salidaDatos.writeLineToFile(lineaEscrita);
            }while (!lineaEscrita.equalsIgnoreCase("SALIR"));
            
            salidaDatos.tancarFitxers();
            
        } catch (IOException ex) {
            Logger.getLogger(TeoriaFitxers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
