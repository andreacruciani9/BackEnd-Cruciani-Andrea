package it.epicode.week1.day1.esercizi;

import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] frase=new String[3];
        System.out.println("inserisci nome");
        frase[0]=scanner.nextLine();
            System.out.println("inserisci Cognome");
            frase[1]=scanner.nextLine();
            System.out.println("inserisci stato danimo");
            frase[2]=scanner.nextLine();
            benvenuto(frase[0],frase[1],frase[2]);


    }
    public static void benvenuto(String nome, String cognome, String stato){
        System.out.println("Benvenuto " + nome + cognome + stato);

    }
}
