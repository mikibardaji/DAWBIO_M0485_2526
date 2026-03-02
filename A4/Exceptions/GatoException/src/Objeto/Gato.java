/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

/**
 *
 * @author mabardaji
 */
public class Gato {
    private String nombre;
    private int edad;
    private double peso;



    public Gato(String nombre, int edad, int peso) 
                                throws NameTooShortException, 
                                ValueNotNegativeException  {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setPeso(peso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NameTooShortException{
        if (nombre!=null && nombre.length()>=3)
        {
            this.nombre = nombre;
        }
        else
        {
            throw new NameTooShortException();
        }
        
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ValueNotNegativeException  {
        if (edad > 0)
        {
            this.edad = edad;
        }
        else
        {
            throw new ValueNotNegativeException("Edad");
        }
    }

    public void setPeso(double peso) throws ValueNotNegativeException {
        if (peso > 0)
        {
            this.peso = peso;
        }
        else
        {
            throw new ValueNotNegativeException("Peso");
        }
    }
    @Override
    public String toString() {
        return "El gato " + nombre + " tiene " + edad  + " años. ";
    }
    
    
}
