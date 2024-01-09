package it.epicode.week1.day2.esercizi;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci un numero");
        int nume=scanner.nextInt();
        conto(nume);


    }

    public static void conto(int num){
        int numero=num;
        for (int i=0;i<=num;i++){
            System.out.println(numero);
            numero--;

        }

    }
}
