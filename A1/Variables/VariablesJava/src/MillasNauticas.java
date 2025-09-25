import java.util.Scanner;
   /*7.	Programa que transforma las milles nàutiques a metres. */
public class MillasNauticas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double millas, metros;
        final int METROS_MILLA = 1852;
        System.out.print("Cuantas millas has recorrido? ");
        millas = lector.nextDouble();

        metros = millas * METROS_MILLA;
        System.out.println("Has recorrido " + metros + " metros" );
    }
}
