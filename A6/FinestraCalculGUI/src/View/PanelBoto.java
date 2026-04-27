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
    JButton add;
    JButton minus;
    JButton multiply;
    JButton divide;

    public PanelBoto() {
        initComponents(); //ficar els components al layout
    }

    private void initComponents() {
        setLayout(new GridLayout(1, 4));
        add = new JButton("+");
        
        add.setHorizontalAlignment(SwingConstants.CENTER);
        add(add);
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
    
    
    
}
