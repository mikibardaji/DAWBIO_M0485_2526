/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class LuchadorDAO {
    List<Luchador> BattleRoyale;

    public LuchadorDAO() {
        this.BattleRoyale = new ArrayList<>();
        anyadirProductosPrueba();
    }

    private void anyadirProductosPrueba() {
        System.out.println("Añadiendo datos prueba si hay... ");
        
    }

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
    
    
}
