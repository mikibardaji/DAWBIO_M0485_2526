package view;

import dao.WrestlerDAO;
import java.sql.SQLException;
import model.Wrestler;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WrestlerView {
    private WrestlerDAO dao;
    private MenuView menu;
    private Scanner scanner = new Scanner(System.in);
    
    
    public WrestlerView() {
        try {
            dao = new WrestlerDAO();
            menu = new MenuView();
            try {
                dao.createTable(); // Ensure table exists
            } catch (Exception e) {
                System.out.println("Error inicialitzant la base de dades: " + e.getMessage());
            }
        } catch (SQLException ex) {
            System.out.println("Exception error: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver error: " + ex.getMessage());
        }
    }

    public void run() {
        boolean running = true;
        while (running) {
            menu.showMenu();
            int choice = menu.getMenuChoice();
            switch (choice) {
                case 1:
                    addWrestler();
                    break;
                case 2:
                    listEfficiency();
                    break;
                case 3:
                    simulateCombat();
                    break;
                case 4:
                    reportByCategory();
                    break;
                case 5:
                    running = false;
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }
    }

    private void addWrestler() {
        try {
            //dades d'entrada
            Wrestler wrestler = demanarDadesLluitador();
            boolean inserted = dao.insertOrUpdateWrestler(wrestler);
            if (inserted) {
                System.out.println("Lluitador donat d'alta correctament.");
            } else {
                System.out.println("Lluitador actualitzat correctament.");
            }
        } catch (SQLException e) {
            System.out.println("Error afegint lluitador: " + e.getMessage());
        }
    }

    private Wrestler demanarDadesLluitador() {
         System.out.print("Introdueix ID del lluitador: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Introdueix nom del lluitador: ");
        String name = scanner.nextLine();
        System.out.print("Introdueix pes del lluitador (kg): ");
        double weight = Double.parseDouble(scanner.nextLine());


        Wrestler wrestler = new Wrestler(id, name, weight, 0, 0); // Inicialment sense victòries ni lluites
        return wrestler;
    }

    private void listEfficiency() {
        try {
            List<Wrestler> wrestlers = dao.getAllWrestlers();
            showWrestlers(wrestlers);
        } catch (Exception e) {
            System.out.println("Error obtenint la llista de lluitadors: " + e.getMessage());
        }
    }

    private void simulateCombat() {
      try {
            int[] ids = getCombatIds();
            Wrestler w1 = dao.getWrestlerById(ids[0]);
            Wrestler w2 = dao.getWrestlerById(ids[1]);

            if (w1 == null || w2 == null) {
                System.out.println("Un o ambdós lluitadors no existeixen.");

            }
            else
            {
                // Simulate combat
            Random rand = new Random();
            int min1, min2;
            if (w1.getWins() > 50) 
                min1 = 50;
            else 
                min1 = w1.getWins(); // Cap lluitador pot tenir més de 50 victòries per a la simulació
            if (w2.getWins() > 50) 
                min2 = 50;
            else 
                min2 = w2.getWins();
            int score1 = rand.nextInt(min1, 101);
            int score2 = rand.nextInt(min1, 101);

            String winner;
            if (score1 > score2) {
                winner = w1.getName();
                w1.setWins(w1.getWins() + 1);
            } else if (score2 > score1) {
                winner = w2.getName();
                w2.setWins(w2.getWins() + 1);
            } else {
                winner = "Empat - Guanyen els dos";
                w1.setWins(w1.getWins() + 1);
                w2.setWins(w2.getWins() + 1);
            }

            w1.setTotalFights(w1.getTotalFights() + 1);
            w2.setTotalFights(w2.getTotalFights() + 1);

            int act1 = dao.updateWrestlerStats(w1.getId(), w1.getWins(), w1.getTotalFights());
            int act2 = dao.updateWrestlerStats(w2.getId(), w2.getWins(), w2.getTotalFights());

            showCombatResult(w1, w2, score1, score2, winner);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error simulant el combat: " + e.getMessage());
        }
    }

    private void reportByCategory() {
        try {
            String category = getCategoryInput();
            if (category.isEmpty()) {
                System.out.println("Categoria no vàlida.");
                return;
            }
            List<Wrestler> wrestlers = dao.getWrestlersByCategory(category);
            showWrestlers(wrestlers);
        } catch (Exception e) {
            System.out.println("Error obtenint l'informe per categoria: " + e.getMessage());
        }
    }

    public String getCategoryInput() {
        System.out.println("Categories disponibles:");
        System.out.println("1. Pes Lleuger");
        System.out.println("2. Pes Mitjà");
        System.out.println("3. Pes Pesat");
        System.out.print("Tria una categoria (1-3): ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1: return "Pes Lleuger";
            case 2: return "Pes Mitjà";
            case 3: return "Pes Pesat";
            default: return "";
        }
    }

    public void showWrestlers(List<Wrestler> wrestlers) {
        if (wrestlers.isEmpty()) {
            System.out.println("No hi ha lluitadors registrats.");
        }
        else
        {
            System.out.println("\n=== Llistat de Lluitadors ===");
            for (Wrestler w : wrestlers) {
                System.out.println(w);
            }
            System.out.println("Llistats: " + wrestlers.size());
        }
        
    }
    
    public int[] getCombatIds() {
        System.out.print("Introdueix ID del primer lluitador: ");
        int id1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introdueix ID del segon lluitador: ");
        int id2 = Integer.parseInt(scanner.nextLine());
        return new int[]{id1, id2};
    }


    public void showCombatResult(Wrestler w1, Wrestler w2, int score1, int score2, String winner) {
        System.out.println("\n=== Resultat del Combat ===");
        System.out.println(w1.getName() + " (ID: " + w1.getId() + ") - Puntuació: " + score1);
        System.out.println(w2.getName() + " (ID: " + w2.getId() + ") - Puntuació: " + score2);
        System.out.println("Guanyador: " + winner);
    }
}