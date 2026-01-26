/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class EquipoFutbol implements Persona{
    protected static int id=0; //no haria falta la inicializacio porque pasa a 0
    private final int idEquipoFutbol;
    protected String nombre;
    protected int edad;
    protected int salario;


    protected EquipoFutbol(String nombre, int edad)
    {
        id++;
        idEquipoFutbol = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodos abstractos
    public  void viajar()
        {
            System.out.println(nombre + " viajo al partido");
        }
    
    public final void concentrarse()
        {
        System.out.println(nombre + " estoy concentrado");
        }

    public static int getId() {
        return id;
    }

    public int getIdEquipoFutbol() {
        return idEquipoFutbol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        if (this == obj) //direccio de memoria on estan guardats
        {
            return true;
        }
        if (!(obj instanceof EquipoFutbol))
        {
            return false;
        }
        //cast obj a equipoFutbol
        EquipoFutbol x = (EquipoFutbol) obj;
        
        return this.idEquipoFutbol == x.idEquipoFutbol;
        
        // return this.edad == x.edad;
        //si el nombre i la edad coinciden
        /*if (!this.nombre.equals(x.nombre))
        {
            return false;
        }
        else if (this.edad != x.edad)
        {
            return false;
        }
        else
        {
            return true;
        }*/
        
        
//        if (this.edad == x.edad)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
        
        
    }

    @Override
    public void saludar()
    {
        System.out.println("Hola soy " + nombre);
    }
    
}
