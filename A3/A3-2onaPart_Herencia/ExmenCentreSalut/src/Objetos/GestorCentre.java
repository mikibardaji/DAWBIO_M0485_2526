/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class GestorCentre {
    
    public static double calcularCostTotal(ProfessionalSanitari p1, ProfessionalSanitari p2, ProfessionalSanitari p3)
    {
        return p1.calcularCostVisita() + p2.calcularCostVisita() + p3.calcularCostVisita();
    }
}
