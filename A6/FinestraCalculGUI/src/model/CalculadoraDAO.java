/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mabardaji
 */
public class CalculadoraDAO {
    
    public double suma(double a, double b)
    {
        return (a+b);
    }
    
    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }
    
    public double divideix(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisió per zero");
        return a / b;
    }    
}
