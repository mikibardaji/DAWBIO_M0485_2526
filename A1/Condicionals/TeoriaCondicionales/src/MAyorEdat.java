import java.util.Scanner;

public class MAyorEdat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;
        //pedir tu edad
        System.out.println("Que edad tienes? ");
        edad = sc.nextInt();
        //decirte si puedes entrar discoteca (es para los que tiene almenos 21)

        //if (condicion logica)
        if (edad>=21)
            {
            System.out.println("Puedes entrar, disfruta de la fiesta");        
            }
        else
            {
                System.out.println(" A tu casa!!!! ");    
            }

    System.out.println("Disco Proven... ");
        
    }
}
