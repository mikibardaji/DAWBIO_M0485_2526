/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class FileCharWriter {
    
    File nom_fitxer;
    FileWriter fw;    
    
    public FileCharWriter(String rutaFitxerRelatiu) throws FileNotFoundException, IOException {
        nom_fitxer = new File(rutaFitxerRelatiu);
        fw = new FileWriter(nom_fitxer);
    }    
    
    public void EscribirCaracter(char letraEscribir) throws IOException
    {
        fw.write(letraEscribir);
    }
    
    public void tancarFitxer() throws IOException
    {
        fw.close();
    }    
    
}
