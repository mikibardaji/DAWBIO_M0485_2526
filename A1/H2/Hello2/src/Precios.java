import java.util.Scanner;

public class Precios {

    public static void main(String[] args) {
        //objeto Scanner que sirve para recoger datos
        //System.in <-- teclado
        Scanner sc = new Scanner(System.in);
        double precio = 3.5;
        double iva_anyadido = 2.4, descuento;

        System.out.println("Pon el precio sin iva: " );
        precio = sc.nextDouble();

        System.out.print("Introduce el IVA del producto: ");
        iva_anyadido = sc.nextDouble();

        System.out.print("Introduce descuento: ");
        descuento = sc.nextDouble();


        double precio_total = precio + iva_anyadido - descuento;

        System.out.println("Precio sin IVA: " + precio);
        System.out.println("           IVA: " + iva_anyadido);
        System.out.println("Descuento     : "+ descuento);
        System.out.println("Precio total  : " + precio_total);
    }

}
