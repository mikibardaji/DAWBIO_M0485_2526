/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gatoexception;

import Objeto.Gato;
import Objeto.NameTooShortException;
import Objeto.ValueNotNegativeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class GatoException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Gato cat=null;
        try {
            cat = new Gato("Roser", 10, 20);
        } catch (NameTooShortException ex) {
            System.err.println(ex.getMessage());
            //Logger.getLogger(ex.getMessage());
        } catch (ValueNotNegativeException ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            cat.setNombre("HO");
            } catch (NameTooShortException ex) {
            System.err.println(ex.getMessage());
        } 

        
        try {
            cat.setPeso(-20);
          } catch (ValueNotNegativeException ex) {
            System.err.println(ex.getMessage());
        }  
            
            
//        try
//        {
//            Gato cat = new Gato("Susana", 100);
//            System.out.println(cat); //toString
//            //cat.setEdad(-10);
//            cat.setNombre("Su");
//        }catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        Gato cat2=null;
//        try
//        {
//            cat2 = new Gato("Su", 100);
//            System.out.println(cat2); //toString
//        }catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        
//        try {
//            cat2.setNombre("David de Mingo");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        
       
        
    }
    
}
