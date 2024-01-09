package it.epicode.week1.day2.esercizi;

import java.util.Arrays;
import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parole= scanner.next();
        suddividere(parole);

    }
   public static String[] suddividere(String frase) {

       int i = 0;

       String[] frasi = frase.split("");;
       while (i <= 1) {
           i++;
           System.out.println(Arrays.toString(frasi));


       }
       return frasi;


   }}




