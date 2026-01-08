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
        this.salario = 10000;
        this.anyos_cargo = anyos_cargo;
    }
    
    
    
    public void tratarContrato(EquipoFutbol person)
    {
        if (person instanceof Futbolista)
        {
            System.out.println("Si vols cobrar has de fer més gols");
        }
        else if (person instanceof Entrenador)
        {
            System.out.println("frase al entrenador");
        }
        else if (person instanceof Masajista)
        {
            System.out.println("si es lesionen et faig fora");
        }
        else // if (person instanceof Presidente)
        {
            System.out.println("Nem a menjar, pago jo!!!");
        }
        
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

    @Override
    public void saludar() {
        super.saludar(); 
        System.out.println("Soy tu jefe");
    }


}
