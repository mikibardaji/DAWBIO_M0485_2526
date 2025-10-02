import java.util.Scanner;

public class Exer10SueldoImpuestos {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         final int SALARIO_HORA = 15;
         double salario, horas, horas_extra, tassas;
      
        System.out.println("Cuantas horas has trabajado? ");
         horas = sc.nextDouble();
        /*  System.out.println("Cuanto es el salario bruto? ");
         salario = sc.nextDouble();*/
        
        
        double salarionet; 
        /*salario sin impuestos */
        if (horas<130)
        {
           salario= horas *SALARIO_HORA;
        }
        else if (horas>130)
        { //•	Les hores que passin de 130 es paguen a 1,5 vegades la tarifa normal.
            horas_extra = horas - 130;
            salario=horas_extra*SALARIO_HORA*1.5;
            double salario_normal = 130*SALARIO_HORA;
            salario = salario + salario_normal;
           
        } 
        System.out.println("salario sin impuestos " + salario);
        

        if(salario<=500)
        {
            System.out.println("No hay tassas");
            System.out.println("Tu salario es "+ salario);
        }
        else if (salario>500 && salario<900) //System.out.println(salario);
        {
            tassas=(salario-500)*0.25;
            salarionet= salario - tassas;
            System.out.println("El salario final es " + salarionet);
            System.out.println("Tienes que pagar " + tassas + "de tassas");
        }
        else if (salario>900)
        {
            tassas=(salario-900)*0.45;
           // salarionet=salario-tassas; //tassas que superan el 900
            double tasas_500_900 = 400 * 0.25;
            tassas = tassas + tasas_500_900;
            salarionet = salarionet - tassas;
            System.out.println("El salario neto es " + salarionet);
            System.out.println("Tienes que pagar " + tassas + "de tassas");

        }
        
        salario=horas*15;

        }    






    }
}
