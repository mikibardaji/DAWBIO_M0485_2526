/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.CalculadoraDAO;

/**
 * Aquesta classe serà la que ens llanci la finestra
 * i dintre es crearen els altres panells 
 * JFRAME -[]x
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame implements ActionListener{

    //declarem els panells aquí perque els voldrem implementar més tard.
    PanelBoto botones;
    PanellDades datosEntrada;
    //aquesta interface(ActionListener) implementar la captura de la accio als components que vulguem 
    ActionListener al;
    CalculadoraDAO dao; //null
    
    
    public FinestraPrincipal()  {
        dao = new CalculadoraDAO();
        //inicialitza la part superior de la finestra
        initComponentsTitle();
        //que la finestra Jframe sera la que implementa el actionLister
        al = this; // JFRAME implements actionListener
        initContainer(); //ficar components a la part central
       // pack();
       initListeners();
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
        datosEntrada = new PanellDades();
        
        panelPrincipal.add(datosEntrada,BorderLayout.CENTER);
        botones = new PanelBoto();
        botones.setPreferredSize(new Dimension(0, 75));
        panelPrincipal.add(botones,BorderLayout.SOUTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //System.out.println("He capturat la accio");
        String accion = e.getActionCommand();
        
        String op1 = datosEntrada.getOper1Editable().getText();
        //System.out.println(op1);
        String op2 = datosEntrada.getOper2Editable().getText();
        //System.out.println(op2);
        double op1d = Double.parseDouble(op1);
        double op2d = Double.parseDouble(op2);
        double resultado=0;
        switch(accion)
        {
            case "+":
                resultado = dao.suma(op1d, op2d);
                break;
            case "-":
                resultado = dao.resta(op1d, op2d);
                break;                
        }
        
        datosEntrada.getResultado().setText(String.valueOf(resultado));
        
    }

    /**
     * Servira per ficar listeners a tots els components que vulguem que 
     * interaccionin amb alguna acció (click, agafar focus,editarlos)
     * 
     */
    private void initListeners() {
        botones.getSuma().setActionCommand("+"); //textlliure
        //que servira per saber que hem apretat aquest boto
        botones.getSuma().addActionListener(al);
        botones.getMinus().setActionCommand("-"); //textlliure
        //que servira per saber que hem apretat aquest boto
        botones.getMinus().addActionListener(al);
        botones.getMultiply().setActionCommand("*"); //textlliure
        //que servira per saber que hem apretat aquest boto
        botones.getMultiply().addActionListener(al);
        botones.getDivide().setActionCommand("/"); //textlliure
        //que servira per saber que hem apretat aquest boto
        botones.getDivide().addActionListener(al);        
        
        
        
        
    }
    
    
    
    
}
