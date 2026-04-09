/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class LuchadorDAOList {
    List<Luchador> BattleRoyale;

    public LuchadorDAOList() {
        this.BattleRoyale = new LinkedList<>();
        //anyadirProductosPrueba();
    }
/*
    private void anyadirProductosPrueba() {
        try {
            System.out.println("Añadiendo datos prueba si hay... ");
            Luchador ejemplo = new Luchador(2, "Topuria");
            ejemplo.setPeso(100);
            BattleRoyale.add(ejemplo);
            ejemplo = new Luchador(3, "Joan");
            ejemplo.setPeso(88);
            BattleRoyale.add(ejemplo);
            ejemplo = new Luchador(10, "Goku");
            ejemplo.setPeso(74);
            BattleRoyale.add(ejemplo);
            ejemplo = new Luchador(99, "Vegeta");
            ejemplo.setPeso(64);
            BattleRoyale.add(ejemplo);
            ejemplo = new Luchador(50, "Musculator");
            ejemplo.setPeso(63);      
            BattleRoyale.add(ejemplo);
        } catch (NotValidWeightException ex) {
            System.err.println("PEso no valido " + ex.getMessage());
        }
    }
*/
    public boolean addLuchador(Luchador wrestler) {
        /*validacion si hace falta*/
        if (!BattleRoyale.contains(wrestler))
            return BattleRoyale.add(wrestler);
        else
            return false; //prodia lanzar uan exception
        /*metodo para Create /inser */
        
    }

    public List<Luchador> getAllWrestlers() {
        return BattleRoyale; //no hi ha filtre, sino tindria que fer un List<Luchador> selec
    }

    public boolean deleteFromLuchador(Luchador fakeDelete) {
        return BattleRoyale.remove(fakeDelete);
    }
    
    public Luchador deleteFromLuchador2(Luchador fakeDelete) {
        int posicion = BattleRoyale.indexOf(fakeDelete);
        if (posicion!=-1)
        {
            Luchador borrado = BattleRoyale.get(posicion);
            BattleRoyale.remove(posicion);
            return borrado;
        }
        else
        {
            return null; //si no lo encuentra
        }
        
    }

    public List<Luchador> damiIlotatoriConPesoMismo(int peso) {
        List<Luchador> selec = new ArrayList<>();
        for (Luchador fighter : BattleRoyale) {
            if (fighter.getPeso()<=peso)
            {
                selec.add(fighter);
            }
        }
        return selec; 
    }

    public boolean addLuchadorByPosition(Luchador wrestler, int posicion) { //throws IndexOutOfBoundsException
        //validar que la posicion sea positiva o 0
        try
        {
            BattleRoyale.add(posicion, wrestler);
            return true; //no ha dado indexOutOfbounds
        }
        catch(IndexOutOfBoundsException ex)
        {
            return false;
        }
        
    }

    public boolean updateNombreById(Luchador updateFake) {

        int posicionFind = BattleRoyale.indexOf(updateFake);
        if (posicionFind!=-1)
        {
            BattleRoyale.get(posicionFind).setNombre(updateFake.getNombre());
            return true;
        }
        else
        {
            return false;
        }
    }


    
    
}
