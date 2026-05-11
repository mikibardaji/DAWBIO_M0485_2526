/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFitxers;

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
public class FileCharRead {
    
    File nom_fitxer;
    FileReader fr;

    public FileCharRead(String rutaFitxerRelatiu) throws FileNotFoundException {
        nom_fitxer = new File(rutaFitxerRelatiu);
        fr = new FileReader(nom_fitxer);
    }
    
    
    /*
    Retorna el codi ASCII del caracter llegit
    i retorna -1 que indica que ja no hi ha res més que llegir
    */
    public int llegirCaracter() throws IOException
    {
        return fr.read();
    }
    
    public List<Integer> llegirTotFitxer() throws IOException
    {
        List<Integer> caractersAscii = new ArrayList<>();
        int i;
        do
        {
            i = fr.read();
            if (i!=-1)
            {
                caractersAscii.add(i);
            }
        }while(i!=-1);
        
        
        while ((i =fr.read())!= -1)
        {
            caractersAscii.add(i);
        }
        return caractersAscii;
    }
    

    public List<Character> llegirTotFitxerCaracter() throws IOException
    {
    List<Character> caractersAscii = new ArrayList<>();
    
    // El 'try-with-resources' assegura que el fitxer es tanqui en acabar
    
        int i;
        while ((i = fr.read()) != -1) {
            char lletra = (char) i;
            caractersAscii.add(lletra);
        }
     
    // Al final, la llista contindrà ABSOLUTAMENT TOTS els caràcters del fitxer
    return caractersAscii;
    }
    
    public void tancarFitxer() throws IOException
    {
        fr.close();
        
    }

    
    
}
