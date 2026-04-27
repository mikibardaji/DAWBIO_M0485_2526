package view;

import model.Wrestler;
import java.util.List;
import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n=== WrestleManager V2 ===");
        System.out.println("1. Alta de Lluitador");
        System.out.println("2. Llistat d'Eficiència");
        System.out.println("3. Simulació de Combat");
        System.out.println("4. Informe de lluitadors amb més victòries");
        System.out.println("5. Sortir");
        System.out.print("Tria una opció: ");
    }

    public int getMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    public void showMessage(String message) {
        System.out.println(message);
    }

 
}