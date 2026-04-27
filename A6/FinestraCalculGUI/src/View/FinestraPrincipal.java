/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * Aquesta classe serà la que ens llanci la finestra
 * i dintre es crearen els altres panells 
 * JFRAME -[]x
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame {

    public FinestraPrincipal() throws HeadlessException {
        //inicialitza la part superior de la finestra
        initComponentsTitle();
        initContainer(); //ficar components a la part central
       // pack();
    }

    private void initComponentsTitle() {
        setTitle("Finestra que calcula operacions");
        //que haig de fer al apretar la x
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //afegir Menú
        
        //tamany finestra
        setSize(400, 400);
        //ficar la finestra centrada
        setLocationRelativeTo(null); //centrada
        
    }

    private void initContainer() {
        //afegim els components del container
        //en aquest cas, com es disposició diferent
        //fiquem dos JPanells al container
        //el primer container es un grid de 3,2
        //el segon de botons es un grid de 1,4 o flowLayout
        
        Container panelPrincipal = this.getContentPane();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setPreferredSize(new Dimension(100, 300));
        PanellDades datosEntrada = new PanellDades();
        
        panelPrincipal.add(datosEntrada,BorderLayout.CENTER);
        PanelBoto botones = new PanelBoto();
        botones.setPreferredSize(new Dimension(0, 75));
        panelPrincipal.add(botones,BorderLayout.SOUTH);
        
    }
    
    
    
    
}
