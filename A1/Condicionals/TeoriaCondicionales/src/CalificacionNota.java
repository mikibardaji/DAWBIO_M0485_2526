import java.util.Scanner;

public class CalificacionNota {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double nota, deberes;
         System.out.println("que nota has sacado? ");
         nota = sc.nextDouble();
         

         if (nota>= 0 && nota < 5)
         {
            System.out.println("Has suspendido");
            System.out.println("has entregado los deberes (0-No/1-Si)? ");
            deberes = sc.nextInt();
            if (deberes == 1) //ha entregado deberes 
            {
                System.out.println("tendras examen de repesca");
            }
            else
            {
                System.out.println("vuelve el año que viene");
            }
         }
         else if (nota>=5 && nota <6 ) {
            System.out.println("Has aprobado");
         }
         else if (nota>=6 && nota <9 )
         {
            System.out.println("Notable");
         }
         else if (nota>=9 && nota < 10)
         {
            System.out.println("Excelente");
         }
         else
         {
            System.out.println("nota introducida erronea " + nota);
         }

         sc.close();

    }
}
