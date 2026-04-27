package model;

public class Wrestler {
    private int id;
    private String name;
    private double weight;
    private String category;
    private int wins;
    private int totalFights;

    public Wrestler() {}

    public Wrestler(int id, String name, double weight, int wins, int totalFights) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        assignCategory(); // Ensure category is assigned based on weight
        this.wins = wins;
        this.totalFights = totalFights;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { 
        this.weight = weight; 
        assignCategory(); // Reassign category if weight changes
    }

    public String getCategory() { return category; }
    
    public int getWins() { return wins; }
    public void setWins(int wins) { this.wins = wins; }

    public int getTotalFights() { return totalFights; }
    public void setTotalFights(int totalFights) { this.totalFights = totalFights; }

    // Method to calculate win percentage
    public double getWinPercentage() {
        if (totalFights == 0) return 0.0;
        return (double) wins / totalFights * 100;
    }

    // Method to assign category based on weight
    public void assignCategory() {
        if (weight <= 70) {
            category = "Pes Lleuger";
        } else if (weight <= 90) {
            category = "Pes Mitjà";
        } else {
            category = "Pes Pesat";
        }
    }

    @Override
    public String toString() {
        //es pot donar el format que es vulgui, aquí es mostra una línia amb totes les dades del lluitador
        //podrieu fer amb System.out.println a la vista, però així es centralitza el format en un sol lloc
        return String.format("ID: %d, Nom: %s, Pes: %.2f kg, Categoria: %s, Victòries: %d, Total Lluites: %d, %% Victòries: %.2f",
                id, name, weight, category, wins, totalFights, getWinPercentage());
        //return "id " + id  + " nombre " + name + " .... " + getWinPercentage());
    }
}