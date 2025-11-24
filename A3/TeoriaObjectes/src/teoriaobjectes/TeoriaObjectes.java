/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaobjectes;

import java.util.Scanner;
import objectes.Ampolla;

/**
 *
 * @author mabardaji
 */
public class TeoriaObjectes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        Ampolla bottle;
        bottle = new Ampolla();
        
        System.out.println("material : " + bottle.getMaterial());
        System.out.println("capacidad : " + bottle.getCapacidad());
        System.out.println("liquido : " + bottle.getLiquido());
        System.out.println("Tapon : " + bottle.isTapon());
        System.out.println("Diametro : " + bottle.getDiametro());
        System.out.println("Ara pleno ampolla....");
        bottle.plenar();
        System.out.println("capacidad : " + bottle.getCapacidad());
        System.out.println("liquido : " + bottle.getLiquido());   
        System.out.println("Vaig a tirar liquido sin quitar tapon -> " + bottle.verter() );
        System.out.println("capacidad : " + bottle.getCapacidad());
        System.out.println("liquido : " + bottle.getLiquido());   
        bottle.obrir();
        System.out.println("Vaig a tirar liquido sin tapon -> " + bottle.verter() );
        System.out.println("capacidad : " + bottle.getCapacidad());
        System.out.println("liquido : " + bottle.getLiquido());   
        Ampolla bottle2 = new Ampolla(100, 7);
        
        System.out.println("Nova ampolla amb constructor no buit");
        System.out.println("material : " + bottle2.getMaterial());
        System.out.println("capacidad : " + bottle2.getCapacidad());
        System.out.println("liquido : " + bottle2.getLiquido());
        System.out.println("Tapon : " + bottle2.isTapon());
        System.out.println("Diametro : " + bottle2.getDiametro());        
        
        
    }
    
}
