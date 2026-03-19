/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class SequenciaGeneticaDao {


    Map<String, SequenciaGenetica> proves;
    
    public SequenciaGeneticaDao() {
        proves = new HashMap<>();
        //afegimdadesprova
    }    

    /*
    Rep un objecte mostra. Ha de validar si l'ID de la mostra ja existeix:
Si l'ID ja existeix, el sistema no pot duplicar la mostra i retorna false.
Si l'ID és nou, l'afegeix al mapa i retorna true.

    */
    public boolean registrarMostra(SequenciaGenetica anyadir) {
        if (proves.get(anyadir.getIdMostra())!=null) //si existeis no pot dupplicar
        {
            return false; //ja existeix
        }
        else
        {
            proves.put(anyadir.getIdMostra(), anyadir);
            return true;
        }
        
        
    }

    public Collection<SequenciaGenetica> obtenirTotes() {
        return proves.values();
    }

    public List<SequenciaGenetica> obtenirTotes2() {
        List<SequenciaGenetica> selec = new ArrayList<>();
        Set<String> clausProves = proves.keySet();
        //System.out.println("claus"  + clausNevera);
        for (String id : clausProves) {
                SequenciaGenetica value = proves.get(id);
                selec.add(value);
        }
        return selec;
    }

    public double calcularMitjanaLongitud() {
        Set<String> clausProves = proves.keySet();
        //System.out.println("claus"  + clausNevera);
        double longTotal=0, longIndividuo=0;
        
        for (String id : clausProves) {
                SequenciaGenetica value = proves.get(id);
                //si solo quisiera humanos pondria if (value.getOrganisme().equalsIgnoreCase("Humanos"))
                longIndividuo = value.getLongitudCadena();
                longTotal += longIndividuo;
        } 
        double media = (double) longTotal/proves.size();
        return media;
    }
 
    public double calcularMitjanaLongitud2() {
        Collection<SequenciaGenetica> todas = proves.values();
        double longTotal=0, longIndividuo=0;
        
        for (SequenciaGenetica muestra : todas) {
                //si solo quisiera humanos pondria if (muestra.getOrganisme().equalsIgnoreCase()
                longIndividuo = muestra.getLongitudCadena();
                longTotal += longIndividuo;
        } 
        double media = (double) longTotal/proves.size();
        return media;
    }
    
}
