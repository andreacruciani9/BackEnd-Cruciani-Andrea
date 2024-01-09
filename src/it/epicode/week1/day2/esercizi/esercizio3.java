package it.epicode.week1.day2.esercizi;

import java.util.Arrays;
import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci una parola");
       String parola = scanner.next();
        while (!parola.equals(":q")) {
            suddividere(parola);
            System.out.println("inserisci una parola");
            parola = scanner.next();

        }
    }
   public static void suddividere(String frase) {

        String[] frasi = frase.split("");;
        System.out.println(Arrays.toString(frasi));





       }



   }




