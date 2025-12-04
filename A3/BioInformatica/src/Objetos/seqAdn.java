/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class seqAdn {
    private final String id;
    private String seq;
    private double qualitat;
    private static int comptadorSeqs =0; //inicializa
    public static final double MIN=0;
    public static final double MAX=1;
    
    
    public seqAdn(String id, String seq)
    {
//        MIN = 0; //        MAX = 1;
        comptadorSeqs = comptadorSeqs + 1;  
        // si quisiera que el id fuera unico siempre
        // this.id = id + String.valueOf(comptadorSeqs);
        this.id = id;
        this.seq = seq;
        this.seq = this.seq.toUpperCase(); 
        this.qualitat = (MIN+MAX)/2;
         
    }
    
    public String getId()
    {
        return id;
    }

    public String getSeq() {
        return seq;
    }

    public double getQualitat() {
        return qualitat;
    }

    public static int getComptadorSeqs() {
        return comptadorSeqs;
    }
    
    public void setSeq(String seq)
    {
        if (seq.length()>0)
        {
            this.seq = seq.toUpperCase();
        }  
    }
    
    public void setQualitat(double qu)
    {
        if (qu>=MIN && qu<=MAX)
        {
            this.qualitat = qu;
        }
    }
    
    /*
    public int longitud() ? 
    retorna la longitud de la seqüència. Hi ha un mètode a String que et dona la longitud d’un string
    */
    public int longitud()
    {
        return seq.length();
    }
    
    /*
    public static int getComptadorSeqs() 
    ? retorna el número total de seqüències creades.
    */
    public static int getComptadorSeqsStatic()
    {
        return comptadorSeqs;
    }
    
    public int comptaBase(char base)
    {
        int contador = 0;
        for (int i = 0; i < this.seq.length(); i++) {
            if (this.seq.charAt(i)==base)
            {
                contador++;
            }
        }
        return contador;
    }
    
    public double porcentaje(char base)
    {
        int contador = comptaBase(base);
        double porcen = (contador*100) / (seq.length());
        return porcen;
    }
}
