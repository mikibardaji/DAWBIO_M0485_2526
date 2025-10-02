import java.util.Scanner;

public class Semaforo {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         char semaforo;

         System.out.println("De que color esta semaforo");
         System.out.println(("V-Verde,R-Rojo,N-Naranja"));
         semaforo = sc.nextLine().charAt(0);

         if (semaforo == 'V')
         {
            System.out.println("Puedes pasar");
         }
         else if (semaforo == 'R')
         {
            System.out.println("Parate");
         }
         else if (semaforo == 'N')
         {
            System.out.println("Precaución");
         }
         else
         {
            System.out.println("Opción incorrecta.");
         }
    }
}
