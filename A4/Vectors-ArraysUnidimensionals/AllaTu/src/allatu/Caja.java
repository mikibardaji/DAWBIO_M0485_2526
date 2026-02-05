/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allatu;

/**
 *
 * @author mabardaji
 */
public class Caja {
    private double premio;
    private boolean abierta;
    private boolean elegida;

    public Caja(double premio) {
        this.premio = premio;
        abierta = false;
        elegida = false;
    }


    public double getPremio() {
        return premio;
    }
    
    public void setPremio(int premio) {
        this.premio = premio;
    }
    
    public boolean isAbierta() {
        return abierta;
    }
    
    public boolean isCerrada(){
        return abierta==false;
    }
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public boolean isElegida() {
        return elegida;
    }
    
    public void setElegida(boolean elegida) {
        this.elegida = elegida;
    }
}
