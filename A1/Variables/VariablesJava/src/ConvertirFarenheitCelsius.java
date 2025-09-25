import java.util.Scanner;

public class ConvertirFarenheitCelsius {

    /*6.	Programa que llegeixi un valor 
    corresponent a una temperatura en graus Fahrenheit
     i escriviu la temperatura en graus Celsius. */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double farenheit, celsius;
        System.out.println("Cual es la temperatura en farenheit..");
        farenheit = lector.nextDouble();
        celsius = (farenheit-32)*5/9;

        System.out.println("En celsius es "+ celsius);




    }
}
