import java.util.Scanner;

public class DineroPagar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coste, efectivo, operacion;

        System.out.println("Cuanto cuesta el producto? ");
        coste = sc.nextInt();
        System.out.println("Cuanto dinero tienes? ");
        efectivo = sc.nextInt();

        if (coste > efectivo)
        {
            operacion = coste - efectivo;
            System.out.println("Debes " + operacion + " euros.");
        }
        else
        {
            operacion =  efectivo- coste;
            System.out.println("Te devuelvo " + operacion + " euros.");
        }

    }
}
