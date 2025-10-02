
/*
 9.	Programa que rep com a dades d'entrada 
 una hora expressada en hores, minuts i segons
  i un temps expressat en segons i 
  que ens calcula i escriu l'hora, minuts 
  i segons que seran, 
 transcorregut el temps especificat.
 */

import java.util.Scanner;

public class TranscurreTiempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minutos, segundos, segundos_mas;

        System.out.print("Pon la hora: ");
        hora  = sc.nextInt();
        System.out.print("Pon los minutos: ");
        minutos  = sc.nextInt();      
        System.out.print("Pon los segundos: ");
        segundos  = sc.nextInt();   
        System.out.println("Pon los segundos transcurren");  
        segundos_mas = sc.nextInt();

        segundos = segundos + segundos_mas;
        if (segundos>59)
            {
                minutos = minutos + (segundos/60);
                segundos = segundos%60;
                if (minutos>59)
                {
                    hora = hora + (minutos/60);
                    minutos = minutos %60; //sempre serien 0 (segundosmas <60)
                    if (hora>23)
                    {
                        hora = hora%24; //no me interesa la parte entera porque no sumo dias
                    }
                }
            }

        System.out.println(hora + ":" + minutos + ":" + segundos);



    }

}
