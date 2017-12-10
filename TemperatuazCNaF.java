package Zadanie1;
/*Zadanie 1.Napisać program służący do konwersji wartości temperatury
podanej w stopniach Celsjusza na stopnie w skali Fahrenheita
(stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;



public class TemperatuazCNaF

{
    public static void main (String[]args)
    {
        // pobrac temperature w C i zamineic na F
        double tempC, tempF;
        int wybrana = 0;
        System.out.println ("Wybierz co chcesz zrobic i nacisnij odpowiednią cyfrę.\n 1. Zamiana Celsjusza na Farenheita. \n 2. Zamiana Farenheita na Celsjusza");
        Scanner sc = new Scanner(System.in);
        wybrana = sc.nextInt();
        switch (wybrana) {
            case 1: {
                System.out.print("Podaj stopnie w celsjuszach :");
                tempC = sc.nextInt();
            }
            tempF = 1.8 * tempC + 32;
            System.out.println(tempC + " stopni celsjusza to " + tempF + " w stopniach Farenheita");
            break;

            case 2: {
                System.out.print(" Podaj temperature w feranhaicie :");
                tempF = sc.nextInt();
                tempC = ( tempF - 32)/1.8;
                System.out.println(tempF +  " stopni celsjusznheita to " + tempC + " w stopniach elsjusza ");
                break;
            }
            //System.out.println("tak");

        }

    }
}
