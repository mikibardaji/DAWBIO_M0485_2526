import java.util.Scanner;

public class ClasificacionNumero {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int valor1;

        System.out.print("Pon un numero: ");
        valor1 = sc.nextInt();

        if (valor1<0)
        {
            System.out.println("Negatiu");
        }
        else if (valor1>0)
        {
            System.out.println("Positivo");
        }
        else
        {
            System.out.println("Cero");
        }
    }
}
