/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moneda;

/**
 *
 * @author mabardaji
 */
public class ConversorDAO {
// Tasas de cambio aproximadas (puedes actualizarlas o sacarlas de una DB/API)
    private final double EUR_A_USD = 1.08;
    private final double EUR_A_GBP = 0.85;
    private final double EUR_A_JPY = 165.20;
    private final double EUR_A_MXN = 18.40;

   // private final double USD_A_EUR = 0.92;
    private final double USD_A_GBP = 0.79;
    private final double USD_A_JPY = 153.10;
    private final double USD_A_MXN = 17.05;

    // --- MÉTODOS DE EUROS A OTRAS MONEDAS ---

    public double convertirEurAUsd(double euros) {
        return euros * EUR_A_USD;
    }

    public double convertirEurAGbp(double euros) {
        return euros * EUR_A_GBP;
    }

    public double convertirEurAJpy(double euros) {
        return euros * EUR_A_JPY;
    }

    public double convertirEurAMxn(double euros) {
        return euros * EUR_A_MXN;
    }

    // --- MÉTODOS DE DÓLARES A OTRAS MONEDAS ---

    public double convertirUsdAEur(double dolares) {
        return dolares / EUR_A_USD;
    }

    public double convertirUsdAGbp(double dolares) {
        return dolares * USD_A_GBP;
    }

    public double convertirUsdAJpy(double dolares) {
        return dolares * USD_A_JPY;
    }

    public double convertirUsdAMxn(double dolares) {
        return dolares * USD_A_MXN;
    }    
}
