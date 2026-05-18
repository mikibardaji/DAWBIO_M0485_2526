/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Persistencia.FileLineRead;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class QuizzPanel extends JPanel{

     JTextField respuesta;
    public QuizzPanel() {
        List<String> lineas = leerFicheroDatos(); 
        if (lineas!= null)
        {
            initComponentes(lineas);
        }
            
        
        
    }

    private List<String> leerFicheroDatos() 
    {
       
        try {
            FileLineRead f2;
            f2 = new FileLineRead("ficheros\\pr1.txt");
            
            List<String> todasLineas = f2.readAllLinesFromFile();
            
            f2.tancarFitxers();
            return todasLineas;
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(
                            this, /*ventana donde mostrarse*/
                            "fichero no existe" + ex.getMessage(), /*mensaje*/
                            "Error", /*titulo*/
                            JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                            this, /*ventana donde mostrarse*/
                            "Error InputOutput " + ex.getMessage(), /*mensaje*/
                            "Error", /*titulo*/
                            JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    private void initComponentes(List<String> lineas) {
        setLayout(new GridLayout(7, 1)); //5 files per 1 columna
        JLabel pruebas;
        String correcta;
        for (String pregunta : lineas) {
            
            if (pregunta.endsWith("*"))
                 {
                     pregunta = pregunta.substring(0, pregunta.length()-1); 
                     pregunta = pregunta.replace("*", "");
                     correcta = pregunta;
                 }
            pruebas = new JLabel(pregunta);
            add(pruebas);
        }
        pruebas = new JLabel("Escribe tu respuesta");
        add(pruebas);
        respuesta = new JTextField("Escribe la respuesta");
        add(respuesta);
        /*
        JLabel[] todosLables = new JLabel[lineas.size()];
        for (int i = 0; i < lineas.size(); i++) {
            
            todosLables[i] = new JLabel(lineas.get(i));
            add(todosLables[i]);
        }*/
        
        
    }
    
    
    
}
