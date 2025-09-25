import java.util.Scanner;

public class TeoriaCondicionals {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int codigo;
       //pedir codigo trabajador
        System.out.print("Que codigo tienes? ");
        codigo = sc.nextInt();

        if (codigo==1)
            {
                System.out.println("eres estudiante");
                System.out.println("no llegues tarde a clase");
            }
        else if (codigo==2)
            {
                 System.out.println("eres profesor");
                 System.out.println("Corrige bien");
            }   
        else if (codigo==3)
            {
            System.out.println("Eres del equipo directivo");        
            } 
        else 
            {
             System.out.println("Eres de la limpieza");   
            }
        


       //si codig es 1 
       //luego eres estudiante

       //si codigo es 2 
       //luego eres profesor

       //si codigo 3 
       //luego eres equipo directivo

       //si codigo 4
       //luego eres personal limpieza
    }
}
