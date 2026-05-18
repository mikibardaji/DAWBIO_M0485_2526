/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelInici extends JPanel {

    private JLabel textoInici;

    public PanelInici() {
        initComponentes();
    }

    private void initComponentes() {
        // Fem servir BorderLayout per poder centrar el text fàcilment
        setLayout(new BorderLayout());
        
        textoInici = new JLabel("Inici", SwingConstants.CENTER);
        
        add(textoInici, BorderLayout.CENTER);
    }
}