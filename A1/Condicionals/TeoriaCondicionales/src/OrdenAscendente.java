import java.util.Scanner;

public class OrdenAscendente {

    public static void main(String[] args) {
   //Programa que llegeix dos números i els visualitza en ordre ascendent.
   //Declarar variables: valor1, valor2.

   Scanner sc = new Scanner(System.in);
   double valor1, valor2;
        /*entrada datos */
   System.out.println("Afegeix un número: ");
   valor1 = sc.nextDouble();
   System.out.print("Afegeix un altre número: ");
   valor2 = sc.nextDouble();

   // Procesar datos
   // si el número 1 és més gran que el número 2:
   if (valor1>=valor2) //(valor1>=valor2)
   {
    System.out.println("Ascendent: " + valor2 + ", " + valor1);
   }
   // si el número 2 és més gran que el número 1:
   else // if (valor1<valor2)
   {
    System.out.println("Ascendent: " + valor1 + ", " + valor2);
   }
   /*  si el número 1 és igual al número 2:
   else
   {
    System.out.println("Els números són iguals: " + valor1 + ", " + valor2);
   }*/




    }
}
