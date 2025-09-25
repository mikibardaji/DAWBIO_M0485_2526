import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Pon el valor 1: ");
        valor1 = sc.nextInt();
        System.out.print("Pon el valor 2: ");
        valor2 = sc.nextInt();

        if (valor1>valor2)
        {
            System.out.println(valor1);
        }
        else
        {
            System.out.println(valor2);
        }
    }
}
