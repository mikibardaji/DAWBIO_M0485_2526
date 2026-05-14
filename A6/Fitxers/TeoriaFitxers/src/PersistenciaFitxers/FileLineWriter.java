/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaFitxers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class FileLineWriter {
    File nom_fitxer;
    FileWriter fw;
    BufferedWriter bw; //linea a linea    

    public FileLineWriter(String rutaNomArxiu) throws IOException {
        nom_fitxer = new File(rutaNomArxiu);
        fw = new FileWriter(nom_fitxer);
        bw = new BufferedWriter(fw);
    }
    
    public void writeLineToFile(String lineaEscribir) throws IOException
    {
        if (lineaEscribir!=null)
        {
            bw.write(lineaEscribir);
            bw.newLine(); //salt de linea
        }
    }
    
    public void writeAllLinesToFile(List<String> datos) throws IOException
    {
        for (String linea : datos) {
            writeLineToFile(linea);
        }
    }
    
    public void tancarFitxers() throws IOException
    {
        bw.close();
        fw.close();
    }
    
}
