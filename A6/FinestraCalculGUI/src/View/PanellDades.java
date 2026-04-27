/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * Panell que tindra la entrada de dades i la sortida calcul
 * JLabel JtextField
 * JLabel JtextField
 * JLabel Jlabel
 */
public class PanellDades extends JPanel{
    JTextField oper1Editable; //important perque interaccionarem amb ell
    //escriurem a dins i voldrem recuperar el seu valor
    JTextField oper2Editable;
    JLabel resultado;
    
    
    public PanellDades() {
        initComponents(); //ficar els components al layout
        initValue();
    }

    private void initComponents() {
        setLayout(new GridLayout(3, 2));
        JLabel oper1 = new JLabel("Numero 1: ");
        add(oper1); //primera fila primera columna
        oper1Editable = new JTextField();
        add(oper1Editable);//primera fila segunda columna
        JLabel oper2 = new JLabel("Numero 2: ");
        add(oper2); //segona fila primera columna
        oper2Editable = new JTextField();
        add(oper2Editable);
        JLabel titulo = new JLabel("Resultado => ");
        add(titulo);
        resultado = new JLabel();
        add(resultado);
    }

    private void initValue() {
        oper1Editable.setText("0.0");
        oper2Editable.setText("0.0");
        resultado.setText("--");
    }
    
    
}
