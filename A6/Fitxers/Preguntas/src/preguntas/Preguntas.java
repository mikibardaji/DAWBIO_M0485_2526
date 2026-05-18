/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preguntas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class Preguntas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileLineRead entradaDatos = new FileLineRead("quizz\\pr1.txt");
            String lineaFitxer, correcta="", resposta;
            Scanner sc = new Scanner(System.in);
            int contador=0;
            do
            {
             lineaFitxer = entradaDatos.readLineFromFile();
             contador++;
             if (contador==1)
             {
                 System.out.print("La pregunta es ... ");
             }
             if (lineaFitxer!=null) //null
             {
                 if (lineaFitxer.endsWith("*"))
                 {
                     lineaFitxer = lineaFitxer.substring(0, lineaFitxer.length()-1); 
                     lineaFitxer = lineaFitxer.replace("*", "");
                     correcta = lineaFitxer;
                 }
                 System.out.println(lineaFitxer);
             }
            }while (lineaFitxer!=null);
            
            entradaDatos.tancarFitxers();
            System.out.println("Quina es la correcta");
            resposta = sc.nextLine();
            if (correcta.equalsIgnoreCase(resposta))
            {
                System.out.println("Has encertat");
            }
            else
            {
                System.out.println("Has fallat");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
