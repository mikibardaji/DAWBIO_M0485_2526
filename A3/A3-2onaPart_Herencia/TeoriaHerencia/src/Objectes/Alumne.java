/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Alumne extends Persona {
    
    private static int contExp=0;
    private int nExp;
    private String ciclo;
    private String Curso;



    public Alumne(String nombre, String DNI, String telefono, String ciclo)
    {
        super(nombre, DNI, telefono); //llama al constructor clase superior siempre en primera linea
        this.ciclo = ciclo;
        contExp++; //s'aumenta i es passa al nexp
        nExp = contExp;
    }

    public Alumne()
    {
        super("Joel","D2","T2");
    }
    public  int getnExp() {
        return nExp;
    }

//    public void setnExp(int nExp) {
//        nExp = nExp;
//    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    public static int getContExp() {
        return contExp;
    }    
    
    @Override
    public void mostrarCaracteristicas()
    { //sobreescric el codi
        super.mostrarCaracteristicas(); //codi de la clase superior
        System.out.println("expediente " + nExp + " ciclo " + ciclo + " Curso " + Curso);
    
    }
    
    @Override
    public void saludar()
    {
        System.out.println("Bro");
    }
    

    public void cambiarTelefono()
    {
        this.telefono = "666444444";
    }

    @Override
    public String toString() {
        return super.toString() + "con expediente=" + nExp + ", ciclo=" + ciclo + ", Curso=" + Curso + '}';
    }
    
}
