/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mabardaji
 */
public class VentanaPrincipal extends JFrame  implements ActionListener{/*actionlistener para el menu*/
    private PanelContador panel_contador;
    private PanelInici panel_inici;
    ActionListener al;
    // Atributs del menú
    private JMenuBar menuBar;
    private JMenu menuNavegacio;
    private JMenuItem itemInici;
    private JMenuItem itemComptar;
    private JMenuItem itemSortir;    
    
    public VentanaPrincipal()  {
        initwindow();
        al = this;
        initContainer();
        setVisible(true);
    }

    private void initwindow() {
        setTitle("ventana");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

private void initMenu() {
        menuBar = new JMenuBar();
        menuNavegacio = new JMenu("Menú");
        
        itemInici = new JMenuItem("Inici");
        itemComptar = new JMenuItem("Comptar Caràcters");
        itemSortir = new JMenuItem("Sortir");
        
        // Assignem la pròpia finestra com a escoltador
        itemInici.setActionCommand("Inici");
        itemInici.addActionListener(al);
        itemComptar.setActionCommand("Comptar");
        itemComptar.addActionListener(al);
        itemSortir.setActionCommand("Sortir");
        itemSortir.addActionListener(al);
        
        menuNavegacio.add(itemInici);
        menuNavegacio.add(itemComptar);
        menuNavegacio.add(itemSortir);
        
        menuBar.add(menuNavegacio);
        this.setJMenuBar(menuBar);
    }


    private void initContainer() {
        
        cargarContador();
       
        
    }

    private void cargarContador() {
         Container panel = this.getContentPane();
         panel.removeAll();//si hay algun panel cargado previo lo borra
        panel.setLayout(new FlowLayout());
        //panel.setPreferredSize(new Dimension(300, 300);
        panel_contador = new PanelContador();  //INICIALITZO PERQUE NO SIGUI NULL
        panel.add(panel_contador);
        /*refrescar para qie se vea*/
        panel.revalidate();
        panel.repaint();
    }
    

    private void cargarInici() {
        Container panel = this.getContentPane();
        panel.removeAll(); // Esborra qualsevol panell previ
        panel.setLayout(new FlowLayout());
        
        panel_inici = new PanelInici(); //INICIALITZO PERQUE NO SIGUI NULL
        panel.add(panel_inici);
        
        /* Refrescar per a que es vegi */
        panel.revalidate();
        panel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accio = e.getActionCommand();
        // Esbrinar quin item de menú s'ha apretat
        if (accio.equalsIgnoreCase("Sortir")) { //PODRIA SER UN SWITCh
            System.exit(0); // Tanca l'aplicació
        } 
        else if (accio.equalsIgnoreCase("Inici")) {
            // Lògica per intercanviar al panell d'inici
            cargarInici();
        } 
        else if (accio.equalsIgnoreCase("Comptar")) {
            // Lògica per intercanviar al panell del comptador
            cargarContador();
        }
    }    
}
