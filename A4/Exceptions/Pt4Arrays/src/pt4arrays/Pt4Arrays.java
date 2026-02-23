/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt4arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Pt4Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] taulell = new char[25];
        inicialitzarTaulell(taulell);
        mostrarTaulell(taulell);
        int torn=0, fitxesJ, fitxesO;
        do{
            if (tornJugador(taulell))
            {
                System.out.println("Fitxa colocada correctament");
            }
            else
            {
                System.out.println("No has col·locat fitxa");
            }
            if (tornOrdinador(taulell))
            {
                System.out.println("Fitxa colocada pel ordinador");
            }
            else
            {
                System.out.println("El ordinador no ha colocat fitxa");
            }
            fitxesJ = comptarFitxes(taulell, 'J');
            fitxesO = comptarFitxes(taulell, 'O');
            mostrarMarcador(fitxesJ, fitxesO);
            torn++;
            if (torn%15==0)
            {
                mostrarTaulell(taulell);
            }
            
        }while(!taulellPle(taulell)
                && !avantatgeSuperiorACinc(fitxesJ, fitxesO));
        
        System.out.println("coloca" +tornJugador(taulell) );
    }
    
    /*
    Omple totes les posicions amb '-' per indicar que estan lliures.
    */
    public static void inicialitzarTaulell(char[] taulell)
    {
        for (int i = 0; i < taulell.length; i++) 
        {
            taulell[i] = '-';
        }
    }
    
    /*
    Mostra per pantalla les 50 posicions del taulell, simplement el valor que contingui cada posició. Aquí hem representat un taulell que a la posició 0 i 5 tenen una J, a la 3 i 8 un O i la resta guions,
    public static void mostrarTaulell(char[] taulell)

    */
    public static void mostrarTaulell(char[] taulell)
    {
        for (int i = 0; i < taulell.length; i++) {
            if (i<10)
            {
                System.out.print((i+1) + " ");
            }
            else
            { //mes d'un
                System.out.print((i+1) + "  ");
            }
        }
        System.out.println("");
        for (int i = 0; i < taulell.length; i++) {
            System.out.print(taulell[i] + " ");
        }
        System.out.println("");
    }

/*
A dins la funció demana una posició al jugador, 
comprova si està lliure i col·loca la fitxa si és possible.  
Retorna true si ha col·locat fitxa i false si no. Una posició lliure és si conté el valor -, qualsevol altre valor està ocupat.

*/
public static boolean tornJugador(char[] taulell)
{
    Scanner sc = new Scanner(System.in);
    int posicio;
    do
    {
    System.out.println("Pon una posicion donde poner la fitxa"
        + "(1-" + taulell.length + ")");
    posicio = sc.nextInt();
    }while(posicio<1 || posicio>taulell.length);
    
    if (taulell[posicio-1]=='-')
        {
        taulell[posicio-1] = 'J';
        return true;
        }
    else
        {
        return false;
        }
}
/*    
Genera una posició aleat?ria i col·loca fitxa.  
Si està ocupada, en genera una segona i col·loca fitxa si no esta ocupada.  Retorna true si ha col·locat fitxa i false si no.

*/

    public static boolean tornOrdinador(char[] taulell)
    {
        int pos, intentos=1;
        Random rd = new Random();
//        do
//        {
//            pos = rd.nextInt(0, taulell.length);
//            intentos++;
//        }while(taulell[pos]!='-' && intentos<=2);    
//        if (taulell[pos]=='_')
//        {
//             taulell[pos] = 'O';
//            return true;
//        }
//        else
//        {
//            return false;
//        }
        pos = rd.nextInt(0, taulell.length);
        if(taulell[pos]=='-')
        {
            taulell[pos] = 'O';
            return true;
        }
        else
        {
            pos = rd.nextInt(0, taulell.length);
            if(taulell[pos]=='-')
            {
                taulell[pos] = 'O';
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }

    /*
    Recorre el taulell i compta quantes fitxes 
    hi ha d’un determinat tipus el que vingui informat a tipusFitxa.
public static int comptarFitxes(char[] taulell, char tipusFitxa)

    */
    public static int comptarFitxes(char[] taulell, char tipusFitxa)
    {
        int contar = 0;
        for (int i = 0; i < taulell.length; i++) {
           if(taulell[i]==tipusFitxa) 
           {
               contar++;
           }
        }
        return contar;
    }
    
    /*
    Retorna true si no queda cap posició lliure.
    public static boolean taulellPle(char[] taulell)
    */
    public static boolean taulellPle(char[] taulell)
    {
        for (int i = 0; i < taulell.length; i++) {
            if(taulell[i]=='-')
            {
                return true; //hay un espacio pues no esta lleno
            }
        }
        return false;
    }
    
    /*
   Comprova si la diferència de fitxes 
    entre jugador i ordinador és superior a 5.

    */
    public static boolean avantatgeSuperiorACinc
        (int fitxesJugador, int fitxesOrdinador)
    {
        int diferencia = fitxesJugador - fitxesOrdinador;
        // o diferencia = Math.abs(fitxesJugador - fitxesOrdinador)
        if (diferencia < 0)
        {
            diferencia = diferencia*(-1);
        }
        if (diferencia>=5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /*
        Retorna true, si les fitxes del jugador 
        son superiors a les d’ordinador, 
        sin? en qualsevol altre cas fals.


        */
    public static boolean Guanyador(int fitxesJugador, int fitxesOrdinador)
    {
        return fitxesJugador>fitxesOrdinador;
//        if (fitxesJugador>fitxesOrdinador)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
    }
       
    /*
    Mostrar marcador (0,25 pts)
    Mostra el nombre de fitxes de cada jugador i la diferència actual.

    */
    public static void mostrarMarcador(int fitxesJugador, int fitxesOrdinador)
    {
        System.out.println("Fitxa jugador: " + fitxesJugador);
        System.out.println("Fitxa ordinador: " + fitxesOrdinador);
        int diferencia;
        if (fitxesJugador>fitxesOrdinador)
        {
            diferencia = fitxesJugador - fitxesOrdinador;
        }
        else
        {
            diferencia = fitxesOrdinador - fitxesJugador;
        }
        System.out.println("Diferencia : " + diferencia);
    }
        
}