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
    private final String DNI;
    private String nombre;
    private String apellidos;
    private int edad;
    
    
    public Persona(String dni, String name, String surname, int age)
    {
        this.DNI = dni;
        nombre = name;
        apellidos = surname;
        edad = age;
    }
    
    public String getDNI()
    {
        return DNI;
    }
    
    /* setter ya no vale porque DNI es final y nunca se podra cambiar
    public void setDNI(String DNI1)
    {
        
        DNI = DNI1;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null)
        {
            this.nombre = nombre;
        }
        
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
       
    
    public void imprime()
    {
        System.out.println(this.nombre + " de apellido " + this.apellidos + " tiene dNI " +
                DNI + " tiene la edad " + this.edad);
    }
    
    public boolean esMayorEdad()
    {
        return this.edad>=18;
    }
    
    public boolean esJubilado()
    {
        return this.edad>=65;       
    }
    
    public int diferenciaEdad(Persona p)
    {
        int diferencia;
        diferencia = this.edad - p.getEdad();
        //diferencia = this.edad - p.getEdad();
         return diferencia;       
    }
    
    public static boolean validarDNI(String dni)
    {
        if (dni.length()!=9)
        {
            return false;
        }
        else if (dni.charAt(8) == 'A'
                || dni.charAt(8) == 'B'
                )
       // 
            //return Character.isLetter(dni.charAt(8)); //letra
            return false;
    }
    
}
