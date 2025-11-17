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
    private int capacidad; //ml que pot contenir la ampolla
    private int diametro; //cm3 ml/segundo
    private boolean tapon; //tiene o no
    private int liquido; //volumen actual llenado
    private String material;
    
    
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
        return diametro;
    }
}
