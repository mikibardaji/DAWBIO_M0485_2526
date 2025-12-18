/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaherencia;

import Objectes.Alumne;
import Objectes.Persona;
import Objectes.Profesor;

/**
 *
 * @author mabardaji
 */
public class TeoriaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Persona people = new Persona("P1","D1","T1");
        
        /*
        Alumne student = new Alumne("Pepe", "DNI3", "telefono4", "DAWBIO1");
        //student.setCiclo("DAWBIO1");
        student.setCurso("1");
        //student.setnExp(1);
        System.out.println("student1 exp" + student.getnExp());
        Alumne student2 = new Alumne("Pepe2", "DNI33", "telefono42", "DAWBIO1");
        System.out.println("student2 exp" + student2.getnExp());
        System.out.println("student1 exp" + student.getnExp());
        Alumne student3 = new Alumne("Pepe3", "DNI33", "telefono42", "DAWBIO1");
        System.out.println("student3 exp" + student3.getnExp());
        System.out.println(Alumne.getContExp()); //variable statica haig de ficar el nom classe
        Profesor teacher = new Profesor("teacher 1", "DNIt1", "telefonot1", 1, "departamentot1", "modulost1");
        teacher.setDepartamento("Informatica");
        
        
        people.mostrarCaracteristicas();
        student.mostrarCaracteristicas();
        teacher.mostrarCaracteristicas();
        
        people.saludar();
        student.saludar();
        teacher.saludar();
        
        System.out.println(people.toString());
        System.out.println(student); //por defecto se llama al toStrin
                
        String nombre = "pepe";
        people.equals(nombre);
        
        //new Persona("P1","D1","T1");
        student = new Alumne("Pepe", "D1", "telefono4", "DAWBIO1");
        student2 = new Alumne("P1", "DNI33", "T1", "DAWBIO1");
        
        if (people.equals(student))
        {
            System.out.println("Son iguales people i student");
        }
        else
        {
            System.out.println("No son iguales");
        }
        
        
        if (people.equals(student2))
        {
            System.out.println("Son iguales people i student2");
        }
        else
        {
            System.out.println("No son iguales studnt2");
        }*/
        
        /*Polimorfismo una variable de clase superior puede comportarse como cualquer clase deridava*/
        Persona people = new Persona("P1","D1","T1");
        
        people.saludar();
        //polimorfismo
        people = new Alumne("alumno", "DNI2", "telefono", "DAWBIO");
        people.saludar();
        
        Alumne aux = (Alumne) people;
       
        
        
        
        
    }
    
}
