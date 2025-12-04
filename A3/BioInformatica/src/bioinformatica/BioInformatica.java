/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bioinformatica;

import Objetos.seqAdn;

/**
 *
 * @author mabardaji
 */
public class BioInformatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        seqAdn t1 = new seqAdn("SEQ01","AACCTTT");
        seqAdn t2 = new seqAdn("SEQ02","AAGGCCGGGTTT");
       
        System.out.println("ID 1: " + t1.getId());
        System.out.println("Seq 1: " + t1.getSeq());
        System.out.println("Longitud: " + t1.longitud());
        System.out.println("ID 2: " + t2.getId());
        System.out.println("Seq 2: " + t2.getSeq());
        System.out.println("Longitud: " + t2.longitud());        
        //System.out.println("Num de G: " + s1.comptaBase('G'));
        //System.out.println("%GC: " + s1.percentatgeGC());
        
        t2 = new seqAdn("SEQ03", "TATTAATTAA");
        
        System.out.println(seqAdn.getComptadorSeqs());

        System.out.println("A's " + t2.comptaBase('A'));
        System.out.println("B's " + t2.comptaBase('B'));
        System.out.println("& " + t2.porcentaje('A'));

        
    }
    
}
