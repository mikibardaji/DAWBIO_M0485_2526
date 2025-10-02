import java.util.Scanner;

public class Medicaments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el teu pes en kg: ");
        int pes = sc.nextInt();

        System.out.println("Selecciona el medicament:");
        System.out.println("0- Ibuprofeno");
        System.out.println("1- Xarelto");
        System.out.println("2- Amoxicilina");
        System.out.println("3- Fluoxetina");
        int medicament = sc.nextInt();

        System.out.print("Amb el pes de " + pes + "kg ha de prendre ");

        /*switch (medicament) {
            case 0:
                if (pes < 70) {
                    System.out.println("500mg de Ibuprofeno");
                } else {
                    System.out.println("1g de Ibuprofeno");
                }
                break;
        
            default:
                break;
        }*/
        if (medicament == 0) { // Ibuprofeno
           if (pes < 70) {
                    System.out.println("500mg de Ibuprofeno");
                } else {
                    System.out.println("1g de Ibuprofeno");
                }
        } else if (medicament == 1) { // Xarelto
            if (pes < 60) {
                System.out.println("10mg de Xarelto");
            } else if (pes <= 80) {
                System.out.println("15mg de Xarelto");
            } else {
                System.out.println("20mg de Xarelto");
            }
        } else if (medicament == 2) { // Amoxicilina
            if (pes < 65) {
                System.out.println("500mg de Amoxicilina");
            } else {
                System.out.println("1g de Amoxicilina");
            }
        } else if (medicament == 3) { // Fluoxetina
            if (pes < 80) {
                System.out.println("20mg de Fluoxetina");
            } else {
                System.out.println("40mg de Fluoxetina");
            }
        } else {
            System.out.println("un medicament desconegut");
        }

    }
}

