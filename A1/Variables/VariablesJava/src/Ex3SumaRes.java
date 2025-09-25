import java.util.Scanner;

public class Ex3SumaRes
{
/*3.	Programa que llegeixi dos números, calcula i mostra el valor de la suma, 
la resta, el producte i la divisió. */
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //declaracio variables
    int oper1,  oper2;
    double resultado;
    System.out.print("Operador 1: ");
    oper1 = teclado.nextInt();
    System.out.print("Operador 2: ");
    oper2 = teclado.nextInt();

    resultado = oper1+oper2;
    System.out.println("La suma es " + resultado);
    resultado = (double) oper1/oper2; //division devuelve entero
    System.out.println("La division es " + resultado);
    resultado = oper1-oper2;
    System.out.println("Resta es "+ resultado);
    resultado = oper1*oper2;
    System.out.println("Multiplicacion es " + resultado);
    
}


}