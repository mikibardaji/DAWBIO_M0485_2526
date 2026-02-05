/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastrings;

/**
 *
 * @author mabardaji
 */
public class TeoriaStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //codiInicial();
        //cadena texto minuscula
        String frase  = "HOLA como ESTAS";
        System.out.println(frase.toLowerCase()); //importante
        System.out.println(frase.toUpperCase()); //importante
        //codePointAt devuelve el caracter del lugar
        for (int i = 0; i < frase.length(); i++) { //importante
            if (frase.codePointAt(i) == 'T')
            {
                System.out.println("esta en la posición " + i);
            }
        }
        String frase2 = " ADIOS ";
        System.out.println(frase.concat(frase2)); // que hacerlo con el +
        System.out.println("Numero d ecaracters " + frase.length());
        System.out.println("esta buit " + frase.isEmpty()); 
        //getChars
        String subcadena = "como";
        System.out.println("El como es troba " + frase.substring(5,9)); //importante
             
        System.out.println(frase.intern());
        char[] letras = frase.toCharArray();
        System.out.println(frase.lastIndexOf("ACGT"));//para encontrar la ultima cadena que buscas
        //importante
        frase = "Hola mundo mundo";
        //System.out.println(frase.replaceAll("mundo", "que"));
        System.out.println(frase.replace('m', 'c')); //importante
        int edat = 18;
        String numero = String.valueOf(edat);
        if (frase.equalsIgnoreCase("Hola Mundo mundo")) //importante
        {
            System.out.println("iguales");
        }
        
        //int posicion = frase.codePointAt(2);
        
    }

    public static void prova()
    {
        System.out.println("");
    }
    private static void codiInicial() {
       int[] arrayNumeros = {1,2,3,4};
       char[] fraseArray = {'H','o','l','a'};
       String frase = "Hola que taaal estas?";
       
       
        System.out.println(frase);
        System.out.println(fraseArray);
        System.out.println(arrayNumeros);
        int contAs=0;
        for (int i = 0; i < frase.length(); i++) {
            //System.out.println(fraseArray[i]);
            System.out.println(frase.charAt(i)); //equivalen a [] dels arrays  
            if (frase.charAt(i)=='a')
            {
                //System.out.println("Conto aquesta a... ");
                contAs++;
            }
        }
        System.out.println("La teva frase te " + contAs + " a's... ");
    }
    
}
