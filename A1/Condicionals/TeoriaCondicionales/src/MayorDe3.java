import java.util.Scanner;

public class MayorDe3 {
    /*7.	Programa que llegeix tres números diferents i 
    ens diu quin és el més gran. */
    public static void main(String[] args) {
               
    Scanner sc = new Scanner(System.in);
    double a,b,c;
    // pedir nombre
    
    System.out.print("Quin és el primer número?");

    //registrar el primer numero a la variable a
    a = sc.nextDouble();

    System.out.print("Quin és el segon número?");
     //registrar el segon número a la variable b
    b = sc.nextDouble();

    System.out.print("Quin és el tercer número?");
    //registrar el tercer número a la variable c
    c = sc.nextDouble();
    //si a<b comprobar quin es més gran
    if (a>=b && a>=c) //a es la mes gran 
        {
            System.out.println("Grande -> " + a);
        }
    else if (b>=a && b>=c)
        {
            System.out.println("Grande -> " + b);
        }
    else //posible poner else if (c>=a && c>=b)
        {
        System.out.println("Grande -> " + c);            
        }
    sc.close();
    }
}
