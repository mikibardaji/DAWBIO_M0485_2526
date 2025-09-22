import java.util.Scanner;

public class Distancias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declara variables; laps, distance_lap, total_distance , km_distance(int)
        int laps,distance_lap,total_distance, distancia_recorrida_km, metros_de_mas;
        final int METROS_KM = 1000;
        
        // no se puede hacer por que es final (constante) METROS_KM = 300;
        //Pedir las vueltas 
        System.out.print("Introduce vueltas: ");
        laps = sc.nextInt();
        //Pedir distancia
        System.out.print("Metros circuito:");
        distance_lap = sc.nextInt();

        //Calcular distancia 
        total_distance = distance_lap*laps;
        //Calcular km enteros
        distancia_recorrida_km = total_distance/METROS_KM;
        metros_de_mas = total_distance%METROS_KM;
        //mostrar resultaodos
        System.out.println("Distancia total " + total_distance + " metros.");
        System.out.println("Que son : " + distancia_recorrida_km + " km y " + metros_de_mas + "metros " );
        sc.close();
    }
}
