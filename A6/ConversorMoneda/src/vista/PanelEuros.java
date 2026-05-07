/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class PanelEuros extends JPanel {
    JTextField monedasCambio;
    JLabel resultadoCambio;
    JButton EurDolar;
    JButton EurGbp;
    JButton EurYen;
    JButton EurJpy;
           

    public PanelEuros() {
        this.setLayout(new GridLayout(4, 2));
        JLabel etiqueta = new JLabel("Euro: ");
        this.add(etiqueta);
        monedasCambio = new JTextField();
        this.add(monedasCambio);
        JLabel etiqueta2 = new JLabel("Conversion: ");
        this.add(etiqueta2);
        resultadoCambio = new JLabel("----");
        this.add(resultadoCambio);
        EurDolar = new JButton("A dolares");
        this.add(EurDolar);
        EurGbp = new JButton("A Libras");
        this.add(EurGbp);        
        EurJpy = new JButton("A moneda japonesa");
        this.add(EurJpy);     
    }

    public JTextField getMonedasCambio() {
        return monedasCambio;
    }

    public JLabel getResultadoCambio() {
        return resultadoCambio;
    }

    public JButton getEurDolar() {
        return EurDolar;
    }

    public JButton getEurGbp() {
        return EurGbp;
    }

    public JButton getEurYen() {
        return EurYen;
    }

    public JButton getEurJpy() {
        return EurJpy;
    }
    
    
}
