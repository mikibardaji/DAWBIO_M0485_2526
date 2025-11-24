/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author mabardaji
 */
public class Got {
    //TO DO codi
    private int capacidad; //ml que pot contenir la ampolla
    private double diametro; //cm3
    private int liquido; //volumen actual llenado
    private String material;  
    
    public Got()
    {
        diametro = 5;
        capacidad = 10;
        material = "Vidre";
        //liquido = 0
    }
    
    public Got(int capacidad)
    {
         diametro = 5;
        this.capacidad = capacidad;
        material = "Corcho";
        //liquido = 0       
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad>0)
        {
            this.capacidad = capacidad;
        }
        else
        {
            System.out.println("Capacitat que m'has passat ha de ser positiva -> " + capacidad);
        }
    }

    public void setLiquido(int liquido) {
        if (liquido>0
                && liquido<= capacidad)
        {
            this.liquido = liquido;
        }
        else
        {
            System.out.println("No puedo poner esta cantidad de liquido" + liquido);
        }
    }
    
    
}
