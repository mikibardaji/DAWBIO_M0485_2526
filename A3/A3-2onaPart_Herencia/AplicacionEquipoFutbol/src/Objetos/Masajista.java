/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Masajista extends EquipoFutbol {
    private String titulacion;

    public Masajista(String titulacion, String nombre, int edad) {
        super(nombre, edad);
        this.salario = 500;
        this.titulacion = titulacion;
    }
    
    
    
    
    
    public void darMasaje()
            {
                System.out.println("estoy dando masaje");
            }




}
