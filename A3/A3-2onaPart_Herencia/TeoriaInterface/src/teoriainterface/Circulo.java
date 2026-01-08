/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriainterface;

/**
 *
 * @author mabardaji
 */
public class Circulo implements Figura{
    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return PI*radio*radio;
    }
    
    
}
