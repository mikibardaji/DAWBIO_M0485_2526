/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

/**
 *
 * @author mabardaji
 */
public class InventadaException extends Exception{ //obligatori extends Exception

    public InventadaException() {
        super("Mensaje fijo"); //salario no puede ser negativp
    }

    public InventadaException(String message) {
        super(message);
    }
    
    
    
}
