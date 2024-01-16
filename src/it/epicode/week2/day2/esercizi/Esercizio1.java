package it.epicode.week2.day2.esercizi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero intero");
        int n = scanner.nextInt();
        scanner.nextLine();


        HashSet<String> parola = new HashSet<>();
        HashSet<String> par = new HashSet<>();
        HashSet<String> uniche = new HashSet<>();

        for (int k = 0; k < n; k++) {
            System.out.println("inserisci numero parole");
            String p = scanner.nextLine();
            if (parola.add(p)) {

                uniche.add(p);
            } else if (!parola.add(p)) {
                String x = p;
                par.add(x);
                uniche.remove(p);


            }
            System.out.println("le parole non duplicate sono: " + uniche.size());
            System.out.println(parola);
            System.out.println("parole duplicate : " + par);
            System.out.println( "elenco parole distinte: " + uniche);

        }


    }
}






