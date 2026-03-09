package Modelo;



public class IdNegativaException extends Exception {

    public IdNegativaException() {
        super("La ID no pot ser negativa.");
    }

    public IdNegativaException(String missatge) {
        super(missatge);
    }
}
