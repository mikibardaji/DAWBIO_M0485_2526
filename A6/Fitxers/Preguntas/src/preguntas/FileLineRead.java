/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preguntas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class FileLineRead {
    /*atributs referents a lectura fitxer linea a linea*/
    File nom_fitxer;
    FileReader fr;
    BufferedReader br; //linea a linea

    public FileLineRead(String RutaRelativaFitxer) throws FileNotFoundException {
        nom_fitxer = new File(RutaRelativaFitxer);
        fr = new FileReader(nom_fitxer);
        br = new BufferedReader(fr);
        /*has obert el fitxer*/
    }
    
    public String readLineFromFile() throws IOException
    {
        /*sol llegeix una linea del fitxer
        retorna null si es el final del fitxer*/
        return br.readLine();
    }
    
    public List<String> readAllLinesFromFile() throws IOException
    {
        List<String> datos = new ArrayList<>();
        String elem;
        do
        {
            elem = br.readLine();
            if (elem!=null)
                datos.add(elem);
        }while(elem!=null);
        
        return datos;
    }
    
    public void tancarFitxers() throws IOException
    {
        br.close();
        fr.close(); 
    }
    
    
}
