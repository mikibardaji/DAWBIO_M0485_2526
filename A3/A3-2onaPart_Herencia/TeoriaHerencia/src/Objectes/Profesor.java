/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Profesor extends Persona{
    
    private int codProfesor;
    private String departamento;
    private String modulos;

    public Profesor(String nombre, String DNI, String telefono, int codProfesor, String departamento, String modulos) {
        super(nombre, DNI, telefono);
        this.codProfesor = codProfesor;
        this.departamento = departamento;
        this.modulos = modulos;
    }

    public int getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(int codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas(); 
        System.out.println("departamento " + departamento + " modulos " + modulos);
    }

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("¿como va?");
    }
    
    
    
    
}
