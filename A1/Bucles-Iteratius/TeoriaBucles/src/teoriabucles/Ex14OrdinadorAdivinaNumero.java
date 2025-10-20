/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriabucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex14OrdinadorAdivinaNumero {

    /**
     * Programa on l'usuari pensa un número de l'1 al 100 i l'ordinador 
     * intenta endevinar-lo. És a dir, l'ordinador anirà proposant números una vegada 
     * i una altra fins a endevinar-lo (l'usuari haurà d'indicar-li a l'ordinador si és més gran, menor o igual al número que ha pensat). Se li indicara amb =(igual) +(mes gran) o -(mes petit). A cada volta el ordenador ha d'acotar el limit.
     */
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int ordinador_numero;
        char resposta;
        int valor_minim=1, valor_maxim = 101;
        //ordinador diu un numero entre 1 i 100
        do{
        ordinador_numero = rd.nextInt(valor_minim, valor_maxim);
        System.out.println("He pensat el " + ordinador_numero);
        System.out.print("He encertat igual(=), mes gran(+) o mes petit(-)? ");
        resposta = sc.next().charAt(0);
        
        switch(resposta)
        {
            case '=': ////si has encertat = , ok has encertat
                System.out.println("Has encertat");
                break;
            case '+':
                //si el numero es mes gran
                //llavors el minim sera el numero que t'ha dit mes un 
                valor_minim = ordinador_numero + 1;
                break;
            case '-': // 
                valor_maxim = ordinador_numero;
                break;
            default:
                System.out.println("Opcio incorrecta");
                break;
               
        }
        }while(resposta!='=');

        System.out.println("Fi de programa");
        
        //si el numero es mes petit 
             //llavors el maxim ha de ser el numero que t'hagi ordenat (-1)
        
       
        
    }
    
}
