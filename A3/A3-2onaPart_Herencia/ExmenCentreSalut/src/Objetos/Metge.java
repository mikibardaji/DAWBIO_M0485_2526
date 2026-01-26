/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Metge  extends ProfessionalSanitari implements Facturable{
    private int anysExperiencia;

    public Metge(String codiColegiat, String nom) {
        super(codiColegiat, nom);
        preuVisita = 50;
    }

    public Metge(int anysExperiencia, String codiColegiat, Especialitat speciality, String nom) {
        super(codiColegiat, speciality, nom);
        this.anysExperiencia = anysExperiencia;
        preuVisita = 50;
    }

    @Override
    public double calcularCostVisita() {
        if (anysExperiencia>10)
        {
            return preuVisita*1.2;
        }
        else if(anysExperiencia>5)
        {
            return preuVisita*1.1;
        }
        else
        {
            return preuVisita;
        }
    }



    @Override
    public double aplicarDescompte(PersonaCentre e) {
        if ((e instanceof Metge))
        {
            return calcularCostVisita()*0.5;
        }
        else if ((e instanceof Infermer))
        {
            return calcularCostVisita()*0.5;
        }
        else
        {
            return calcularCostVisita();
        }
    }
    
    
    
}
