/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriainterfacegrafica;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mabardaji
 */
public class TeoriaInterfaceGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Frame es la finestra estandard de windows
        JFrame finestra = new JFrame("Primera finestra de windows");
        finestra.setSize(400, 300);
        
        //la acció que es feia al apretar la X de la finestra
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        disposicioBorderLayout(finestra);
        //disposicioGridLayout(finestra);
        //mostrar-lo o display
        finestra.pack();
        finestra.setVisible(true);
    }

    /*
    North-South-East-West-Center
    */
    private static void disposicioBorderLayout(JFrame finestra) {
        //marcarem el layout que ha de tenir el nostre panell
        
        Container contenidor = finestra.getContentPane();
        contenidor.setLayout(new BorderLayout());
        //BorderLayout es Norte-Sur-Este-Oeste-Centro
        
        //afegirem el primer component 
        JLabel hello = new JLabel("Hello World!!!");
        contenidor.add(hello, BorderLayout.NORTH);
        //finestra.getContentPane().add(hello);
        JButton enviar = new JButton("Aprieta para enviar");
        contenidor.add(enviar, BorderLayout.SOUTH);
        //finestra.getContentPane().add(enviar);
        JCheckBox check = new JCheckBox("Opcio1");
        contenidor.add(check, BorderLayout.EAST);
    }

    private static void disposicioGridLayout(JFrame finestra) {
        Container contenidor = finestra.getContentPane();
        contenidor.setLayout(new GridLayout(3, 4));
        
        for (int i = 1; i <= 12; i++) {
            contenidor.add(new JButton("Botó "+ i));
        }
    }
    
}
