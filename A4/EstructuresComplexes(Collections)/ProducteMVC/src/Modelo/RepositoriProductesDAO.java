package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Conte la estructura de dades d'enmagatzematge
 * atributs de mes per validacions
 * En aquest cas per limitar el numero de productes
 * no te sout's 
 * Pot llançar exceptions de validcio 
 */
public class RepositoriProductesDAO {
    private List<Producte> productes;
    private final int capacitatMaxima;

    public RepositoriProductesDAO(int capacitatMaxima) {
       
        this.productes = new ArrayList<>();//obligatori
        this.capacitatMaxima = capacitatMaxima;
        anyadirProductosPrueba();
        
    }
    public boolean afegirProducte(Producte p) throws RepositoriPleException {
        // validaciones opcionales
        if (productes.size() > capacitatMaxima-1) {
            throw new RepositoriPleException("Repositori ple. Capacitat : " 
                                            + capacitatMaxima);
        }
        //metode CRUD con el repositori
        //tengo que mirar que dato devuelve el metodo utilizado 
        //para devolverlo igual a la vista
        
        return productes.add(p);
    }
    public Producte cercarPerId(int id) throws IdNegativaException {
        if (id < 0) {
            throw new IdNegativaException("La ID no pot ser negativa.");
        }
        Producte auxiliar = new Producte(0,"");
        int index = productes.indexOf(auxiliar);
        if (index != -1) 
            return productes.get(index);
        return null;
    }
    public boolean eliminarProducte(int id) {
        return true;
    }
    
    public List<Producte> obtenirTots()
    {
        return productes;
    }
    
    public List<Producte> obtenirTotsPrecioBajo(double limite)
    {
        List<Producte> productosSeleccionados = new ArrayList<>();
        
        for (Producte produc : productes) {
            if (produc.getPreu()<= limite)
            {
                productosSeleccionados.add(produc);
            }
            //si no, no se añade
        }
        return productosSeleccionados;
    }
    // TO DO: altres mÃ¨todes com cercarPerNom, cercarPerPreu, etc.

    private void anyadirProductosPrueba() {
        Producte add = new Producte(1, "Product1");
        try {
            add.setId(10);
            productes.add(add);
            add = new Producte(20, "Product2");
            add.setId(20);
            productes.add(add);
            add = new Producte(30, "Product2");
            add.setId(30);
            productes.add(add);
            add = new Producte(40, "Product1");
            add.setId(40);
            productes.add(add);
            
            
        } catch (IdNegativaException ex) {
            Logger.getLogger(RepositoriProductesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
