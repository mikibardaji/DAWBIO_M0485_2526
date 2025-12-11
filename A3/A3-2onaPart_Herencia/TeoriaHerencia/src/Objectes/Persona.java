/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Persona {
    private String nombre;
    private String DNI;
    protected String telefono;

    public Persona(String nombre, String DNI, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void mostrarCaracteristicas()
    {
        System.out.println("nombre " + nombre + ", dni: " + DNI + " telefono: " + telefono);
    }

    @Override
    public String toString() {
        return "La persona se llama " + nombre + ", su dni es  " + DNI + "  y su telefono= " + telefono;
    }
    
    public void saludar()
    {
        System.out.println("Hola!!!");
    }
    
    public final void adios()
    {
        System.out.println("Adios!!!!");
    }

    @Override
    public boolean equals(Object obj) {
       //true si es lo mismo 
       
       //false
       if (obj == null)
       {
           return false;
       }
       
       if (!(obj instanceof Persona))
       {
           return false;
       }
       
       Persona other = (Persona) obj;
       
       if (this.DNI.equals(other.DNI))
       {
           return true;
       }
       else
       {
           return false;
       }
       
    }
    
    
    
    
}
