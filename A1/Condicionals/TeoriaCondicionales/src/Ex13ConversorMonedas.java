import java.util.Scanner;

public class Ex13ConversorMonedas {

    /*
     * 13.	Desenvolupeu un programa que entri un import en euros, 
     * mostri un menú amb diferents monedes, llegeixi el 
     * nom de la moneda i mostri la conversió a la moneda escollida.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double EURO_DOLAR = 1.1;
        final double EURO_PESOS = 1.5;
        final double EURO_YEN = 162.32;
        int euros;
        double cambio;
        /*Introduccion datos */
        System.err.println("Introduce una cantidad en euros: ");
        euros = sc.nextInt();
        /*Menu  */
        System.out.println("A que moneda quieres convertirlo? ");
        System.out.println("1-dolar");
        System.out.println("2-pesos");
        System.out.println("3-DIRHAM");
        System.out.print("Introduce opcion: ");
        int moneda = sc.nextInt();
        if (moneda == 1) {
            cambio = (euros * EURO_DOLAR);
            System.out.println(euros + " euros son " + cambio  + " dolares");
        } else if (moneda == 2) {
            cambio = (euros * EURO_PESOS);
            System.out.println(euros + " euros son " + cambio + " pesos");
        } else if (moneda == 3)
        {
            cambio = (euros * EURO_YEN);
            System.out.println(euros + " euros son " + cambio + " yenes");
        }
        else
        {
            System.out.println("moneda no valida");
            
        }        

        switch (moneda) {
            case 1:
            //case 5: haria lo mismo que el 1 porque no hay break en el 1
                cambio = (euros * EURO_DOLAR);
                System.out.println(euros + " euros son " + cambio  + " dolares");
                break;
            case 2:
                cambio = (euros * EURO_PESOS);
                System.out.println(euros + " euros son " + cambio + " pesos");
                break;
            case 3:
                cambio = (euros * EURO_YEN);
                System.out.println(euros + " euros son " + cambio + " yenes");
                break;
            default:
                System.out.println("moneda no valida");
                break;
        }



    }
}
