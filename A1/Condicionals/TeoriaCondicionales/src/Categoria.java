import java.util.Scanner;

public class Categoria {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix l'any de naixement del federat: ");
        int any = sc.nextInt();

        if (any < 1924) {
            System.out.println("Aquest any no és vàlid per a jugar a categories actuals");
        } else {
            System.out.print("El/la jugador/a estarà federat a la categoria ");

            if (any > 2013) {
                System.out.println("no categoria");
            } else if (any >= 2011 && any <= 2012) {
                System.out.println("S14");
            } else if (any >= 2009 && any <= 2010) {
                System.out.println("S16");
            } else if (any >= 2007 && any <= 2008) {
                System.out.println("S18");
            } else if (any >= 1991 && any <= 2006) {
                System.out.println("Absoluta");
            } else {
                // any abans del 1991
                System.out.println("Veterans");
            }
        }

    }
}
