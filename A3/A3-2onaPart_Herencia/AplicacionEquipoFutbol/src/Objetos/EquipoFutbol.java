/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class EquipoFutbol {
    protected static int id=0; //no haria falta la inicializacio porque pasa a 0
    private int idEquipoFutbol;
    protected String nombre;
    protected int edad;


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
    
}
