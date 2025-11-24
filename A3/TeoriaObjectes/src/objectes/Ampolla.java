/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author mabardaji
 */
public class Ampolla {
        //TO DO codi
    //definir atributs de la ampolla
    //public que ho pot veure tothom / private que sol ho coneix dintre la classe
    public int capacidad; //ml que pot contenir la ampolla
    private int diametro; //cm3 ml/segundo
    private boolean tapon; //tiene o no
    private int liquido; //volumen actual llenado
    private String material;
    
    //constructor buit faampolles de aquestes caracteristiques
    public Ampolla()
    {
        capacidad = 25;
        diametro = 3;
        tapon = true;
        material = "Plastic";
        liquido= 0;
    }
    
    public Ampolla(int n_capacidad, int diametro)
    {
        capacidad = n_capacidad;
        this.diametro = diametro;
        tapon = true;
        material = "Vidre";
        liquido=0;
    }
    
    /**
     * Quitar el tapon a la botella
     */
    public void obrir()
    {
        tapon = false;
    }
    
    /**
     * Poner el tapon a la botella
     */
    public void tancar()
    {
        tapon = true;
    }
    
    /**
     * Llenar al maximo la botella
     */
    public void plenar()
    {
        liquido = capacidad;
    }
    
    /**
     * verter liquido...
     * @return 
     */
    public int verter()
    {
        int vertido;
        if (liquido<=0)
        {
            vertido = 0;
        }
        else if (tapon==true)
        {
            vertido = 0;
        }
        else if (liquido< diametro)
        {
            vertido = liquido;
            liquido = 0;
        }
        else
        {
            liquido -= diametro;
            vertido = diametro;
        }
            
        return vertido;
    }
    
    // GEtter get atribut
    public int getCapacidad()
    {
        return capacidad;
    }
    
    public int getDiametro()
    {
        return diametro;
    }

    public boolean isTapon() {
        return tapon;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }
    
    public void setCapacidad(int nova_capacitat)
    {
        if (nova_capacitat>0)
        {
            capacidad = nova_capacitat;
        }
        else
        {
            System.out.println("Capacitat que m'has passat ha de ser positiva -> " + nova_capacitat);
        }
            
    }
    
    public void setLiquido(int nuevo_liquido)
    {
        if (nuevo_liquido>0
                && nuevo_liquido<= capacidad)
        {
            liquido = nuevo_liquido;
        }
        else
        {
            System.out.println("No puedo poner esta cantidad de liquido" + nuevo_liquido);
        }
        
    }
    
    
    
}
