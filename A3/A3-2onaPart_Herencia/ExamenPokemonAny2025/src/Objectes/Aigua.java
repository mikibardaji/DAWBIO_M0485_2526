/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Aigua extends Pokemon {
    private int corassa;
    public Aigua() {
        super();
        LP =35;
        corassa=3;
    }

    public Aigua(LlistaNoms n) {
        super(n);
        LP=35;
        corassa=3;
    }

    @Override
    public void RecibirImpacto(Pokemon pok) {
        int danyo = pok.Atac();
        
        if (corassa<=0)
        {
            if (pok instanceof Electric)
            {
                danyo = (int) (danyo*0.75);
            }
        }
        else
        {
            danyo = 0;
            corassa--;
            System.out.println(" No em fa mal tinc corassa " + corassa);
        }
        
        LP -= danyo; //LP = LP - danyo;
        
        this.mostrarEstadoPokemon();
    }
    
}
