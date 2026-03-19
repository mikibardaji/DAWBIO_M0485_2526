/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadoralimentos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mabardaji
 */
public class ContadorAlimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> fruites = Arrays.asList("poma", "pera", "poma", "plàtan", "poma", "pera");
        Map<String, Integer> comptador = new HashMap<>();
        
        for (String f : fruites) {
            if (comptador.get(f)!=null)
            {
                Integer quantitat = comptador.get(f);
                quantitat++;
                comptador.put(f, quantitat);
            }
            else
            {
                comptador.put(f, 1);
            }
            
            //comptador.put(f, comptador.getOrDefault(f, 0)+1);
            // Si la fruita ja està al map, suma-li 1 al valor actual
            // Si no hi és, afegeix-la amb valor 1
        }
        System.out.println(comptador);
    }
    
}
