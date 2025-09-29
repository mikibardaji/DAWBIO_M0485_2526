import java.util.Scanner;

public class NumeroMayorIgual {
 /*6.	Programa que llegeix dos números i ens diu quin és el més gran o si són iguals. */

 public static void main(String[] args) {
    
    //Pedir 2 numeros 
    //Hacer ver cual de los dos es mas grande
    Scanner sc = new Scanner(System.in);
    double numero1,numero2;

    System.out.println("Dime el numero 1: ");
    numero1 = sc.nextDouble();

    System.out.println("Dime el numero 2: ");
    numero2 = sc.nextDouble();

    if (numero1>numero2)
    {
    System.out.print("El numero: " + numero1 + " es el mas grande!");
    }
    else if (numero1<numero2)
    {
    System.out.println("El numero: " + numero2 + " es el mas grande!");
    }
    else
    {
    System.out.println("Los dos numeros son iguales");
    }
 }
}
