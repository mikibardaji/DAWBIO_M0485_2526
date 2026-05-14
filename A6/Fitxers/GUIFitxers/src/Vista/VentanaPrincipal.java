/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author mabardaji
 */
public class VentanaPrincipal extends JFrame  {/*actionlistener para el menu*/
    PanelContador panel_contador;
    
    public VentanaPrincipal()  {
        initwindow();
        initContainer();
        setVisible(true);
    }

    private void initwindow() {
        setTitle("ventana");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    private void initContainer() {
        
        cargarContador();
       
        
    }

    private void cargarContador() {
         Container panel = this.getContentPane();
        panel.setLayout(new FlowLayout());
        //panel.setPreferredSize(new Dimension(300, 300);
        panel_contador = new PanelContador();
        panel.add(panel_contador);
        /*refrescar para qie se vea*/
        panel.revalidate();
        panel.repaint();
    }
    
    
    
}
