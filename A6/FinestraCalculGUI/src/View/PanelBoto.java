/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author mabardaji
 */
public class PanelBoto extends JPanel{ //JPÂNEL NO ES UNA FINESTRA
    JButton suma;
    JButton minus;
    JButton multiply;
    JButton divide;

    public PanelBoto() {
        initComponents(); //ficar els components al layout
    }

    private void initComponents() {
        setLayout(new GridLayout(1, 4));
        suma = new JButton("+");
        
        suma.setHorizontalAlignment(SwingConstants.CENTER);
        add(suma);
        minus = new JButton("-");
        minus.setHorizontalAlignment(SwingConstants.CENTER);
        add(minus);
        multiply = new JButton("X");
        multiply.setHorizontalAlignment(SwingConstants.CENTER);   
        add(multiply);
        divide = new JButton("/");
        divide.setHorizontalAlignment(SwingConstants.CENTER);           
        add(divide);
    }

    public JButton getSuma() {
        return suma;
    }

    public JButton getMinus() {
        return minus;
    }

    public JButton getMultiply() {
        return multiply;
    }

    public JButton getDivide() {
        return divide;
    }
    
    
    
}
