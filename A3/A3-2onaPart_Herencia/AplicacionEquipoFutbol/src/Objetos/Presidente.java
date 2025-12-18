/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Presidente extends EquipoFutbol{
    private int anyos_cargo;

    public Presidente(int anyos_cargo, String nombre, int edad) {
        super(nombre, edad);
        this.anyos_cargo = anyos_cargo;
    }
    
    
    
    public void tratarContrato(EquipoFutbol person)
    {
        System.out.println("tratando contrato");
    }
    
    public void irPalco()
    {
        System.out.println("Estoy en el palco");
    }

    @Override
    public void viajar() {
        super.viajar();
        System.out.println("Viajo en primera");
    }


}
