/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Moneda.ConversorDAO;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.FlatteningPathIterator;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame implements ActionListener
{

    PanelEuros euroPanel;
    ActionListener al;
    ConversorDAO dao;
    
    //atributs Menu
    JMenuBar barra;
    JMenu opcions;
    JMenuItem conversor;
    JMenuItem About;
    JMenuItem exit;
    
    public FinestraPrincipal()  {
        dao = new ConversorDAO();
        al = this;
        //inicializar ventana
        initTitle();
        initMenu();
        initContainer();
        initListener();
        setVisible(true);
    }

    private void initTitle() {
        this.setTitle("Conversor de Monedas"); //porque finestraPrincipal es JFRAME
        //indicar que faig quant s'apreti la X de la finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //tamaño aqui si que importa
        this.setSize(1500, 500);
        
        //this.pack();
        //centrado
        this.setLocationRelativeTo(null);
    }

    private void initContainer() {
        cargarPanelConversor(); //si no tuviera
        // dos paneles (PanelEuros i AboutPanel) podria poner el codigo
        //en el mismo initCOntainer cargarPanelConversor();
        /*TODO ESTE CODIGO LO PONGO EN UN METODO APARTE
        PARA PODER RECUPERARLO EN EL JMENUITEM Conversor 
        aixi no repeteixo codi
        Container principal = this.getContentPane();
        principal.setLayout(new GridLayout(1,1)); //podria ser grid 1,1 o borderLayout (center)
        euroPanel = new PanelEuros();
        principal.add(euroPanel);
        */
    }

    private void cargarPanelConversor() {
        Container principal = this.getContentPane();
        principal.removeAll(); //borro lo que haya
        principal.setLayout(new GridLayout(1,1)); //podria ser grid 1,1 o borderLayout (center)
        euroPanel = new PanelEuros();
        principal.add(euroPanel);
        principal.revalidate();
        principal.repaint();
    }    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(e.getActionCommand());
        
        //recojo los datos antes, porque siempre es igual en todos
        //los metodos
       String operador1;
       double op1=0, conversion;
        switch (comando)
        {
            case "EURDOLAR":
                 operador1 = euroPanel.getMonedasCambio().getText(); //son string que no puedo operar
                op1 = Double.parseDouble(operador1);
                
                conversion = convertirADolar(op1);
                //ahora vendria mostrar los datos
                //pero como en los 3 casos es igual
                //llamo el mismo metodo
                mostrarResultadoLabel(conversion);   
                break;
            case "EURLibra":
                 operador1 = euroPanel.getMonedasCambio().getText(); //son string que no puedo operar
                op1 = Double.parseDouble(operador1);
                conversion = convertirALibra(op1);
                mostrarResultadoLabel(conversion); 
                break;
            case "Japonesa":
                conversion = convertirAJaponesa(op1);
                 mostrarResultadoLabel(conversion); 
                break;     
            case "about":
                cargarPanelAbout();
                break;

            case "conversor":
                cargarPanelConversor();
                break;
            
            case "exit":
                System.exit(0);
                break;
        }
    }

    private void initListener() {
        euroPanel.getEurDolar().setActionCommand("EURDOLAR");
        euroPanel.getEurDolar().addActionListener(al);
        euroPanel.getEurGbp().setActionCommand("EURLibra");
        euroPanel.getEurGbp().addActionListener(al);
        euroPanel.getEurJpy().setActionCommand("Japonesa");
        euroPanel.getEurJpy().addActionListener(al);        
    }

    private double convertirADolar(double op1) {
        //interaccion con el dao
        double dolar = dao.convertirEurAUsd(op1);
        return dolar;
        
    }

    private void mostrarResultadoLabel(double dinero) {
        String resultadoString = String.valueOf(dinero);
        euroPanel.getResultadoCambio().setText(resultadoString);
    }

    private double convertirALibra(double op1) {
        double libra = dao.convertirEurAGbp(op1);
        return libra;
    }

    private double convertirAJaponesa(double op1) {
        double JPN = dao.convertirEurAJpy(op1);
        return JPN;
    }

    private void initMenu() {
        this.barra = new JMenuBar();
        this.opcions = new JMenu("Opcions");
        /*JMenuItem conversor;
    JMenuItem About;
    JMenuItem exit;*/
        conversor = new JMenuItem("Conversor");
        conversor.setActionCommand("conversor");
        
        About = new JMenuItem("About");
        About.setActionCommand("about");
        exit = new JMenuItem("Exit");
        exit.setActionCommand("exit");
        //listener y actionCommand
        conversor.addActionListener(al);
        About.addActionListener(al);
        exit.addActionListener(al);
        //guardarho de mes petit a mes gran
        opcions.add(conversor);
        opcions.add(About);
        opcions.add(exit);
        
        barra.add(opcions);
        JMenu basura = new JMenu("Basura");
        barra.add(basura);
        this.setJMenuBar(barra);
        
    }

    private void cargarPanelAbout() {
        Container principal = this.getContentPane();
        principal.removeAll();
        principal.setLayout(new FlowLayout());
        AboutPanel p = new AboutPanel();
        principal.add(p);
        principal.revalidate();
        principal.repaint();
    }




    
}
