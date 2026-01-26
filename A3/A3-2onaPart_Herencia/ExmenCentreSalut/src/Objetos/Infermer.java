/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Infermer extends ProfessionalSanitari implements Facturable {
    protected boolean faGuardies;
    
    public Infermer(String codiColegiat, String nom) {
        super(codiColegiat, nom);
        preuVisita = 20;
    }

    public Infermer(boolean faGuardies, String codiColegiat, Especialitat speciality, String nom) {
        super(codiColegiat, speciality, nom);
        this.faGuardies = faGuardies;
    }

    @Override
    public double calcularCostVisita() {
        if (faGuardies)
        {
            return preuVisita + 5;
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
