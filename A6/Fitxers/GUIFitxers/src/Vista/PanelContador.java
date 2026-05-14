/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Persistencia.FileCharRead;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class PanelContador extends JPanel implements ActionListener{

    private JTextField archivo1;
    private JTextField letra;
    private JLabel texto1;
    private JLabel texto2;
    private JButton boton;
    
    ActionListener al;
    
    
    
    public PanelContador() {
        initComponentes();
        al=this;
        initListener();
    }

    private void initComponentes() {
        setLayout(new GridLayout(3, 2));
        texto1 = new JLabel("Archivo -->");
        archivo1 = new JTextField();
        texto2 = new JLabel("Letra -->");
        letra = new JTextField();
        boton = new JButton("Contar");
        add(texto1);
        add(archivo1);
        add(texto2);
        add(letra);
        add(boton);
        
    }

    public JTextField getArchivo1() {
        return archivo1;
    }

    public JTextField getLetra() {
        return letra;
    }

    public JButton getBoton() {
        return boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Has hecho una accion");
        String accion = e.getActionCommand();
        switch (accion){
            case "contar":
                contarLetras();
               
                
        }
            
                
                
    }

    private void initListener() {
        //getBoton()
        boton.setActionCommand("contar");
        boton.addActionListener(al);
    }

    private void contarLetras() {
        System.out.println("Contar");
                String fichero = archivo1.getText();
                String letra_buscada = letra.getText();
                System.out.println(fichero);
                if (letra_buscada.length()!=1) {
                    JOptionPane.showMessageDialog(
                            this, /*ventana donde mostrarse*/
                            "Solo puedes poner una letra", /*mensaje*/
                            "Error", /*titulo*/
                            JOptionPane.ERROR_MESSAGE);
                }
                else 
                {
                    char letra_char = letra_buscada.charAt(0);
                    System.out.println(letra_char);
                    contarLetraFichero(letra_char, fichero);
                }
                
    }

    private void contarLetraFichero(char letra_char, 
            String fichero) {
        FileCharRead fr;
        try {
            fr = new FileCharRead(fichero);
            int codigoAscii, contador=0;
            char letra_fichero;
            do{
                codigoAscii = fr.llegirCaracter();
                if (codigoAscii!=-1)
                {
                    letra_fichero = (char) codigoAscii;
                    if (letra_fichero==letra_char)
                    {
                        contador++;
                    }
                }
            }while(codigoAscii!=-1);
            fr.tancarFitxer();
            JOptionPane.showMessageDialog(
                            this, /*ventana donde mostrarse*/
                            "Se ha encontrado " + contador + " veces",
                            "Resultado", /*titulo*/
                            JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(
                            this, /*ventana donde mostrarse*/
                            ex.getMessage(), /*mensaje*/
                            "Fichero no encontrado", /*titulo*/
                            JOptionPane.ERROR_MESSAGE);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                            this, /*ventana donde mostrarse*/
                            ex.getMessage(), /*mensaje*/
                            "Error al leer el fichero", /*titulo*/
                            JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    
    
}
