/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

/**
 *    
    public static void main(String[] args) {
        int contador = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica el numero top");
        int top = sc.nextInt();
        
        while (contador<=top)
        {
            System.out.println(contador);
            contador += 2;
        }
        
    } 
 */
public class Ex5Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Preparant quirofan...");
        for (int i = 10; i > 0; --i) {
            System.out.println(i + "... ");
        }
        System.out.println("Preparat quirofanzº");
    }
    
}
