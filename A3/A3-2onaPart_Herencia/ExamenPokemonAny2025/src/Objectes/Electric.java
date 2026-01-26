/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public final class Electric extends Pokemon{
    protected int superAtac;
    
    public Electric() {
        super();
        LP =40;  
        superAtac=2;
    }

    public Electric(LlistaNoms n) {
        super(n);
        superAtac=2;
        LP=40;
    }

    @Override
    public void RecibirImpacto(Pokemon pok) {
        int danyo = pok.Atac();
        
        if (pok instanceof Veri)
        {
            danyo = (int) (danyo*0.75);
        }
        //
        LP -= danyo; //LP = LP - danyo;
    }

    @Override
    public int Atac() {
        int total = super.Atac(); 
        total += superAtac;
        superAtac++;
        return total;
    }
    
    
}
