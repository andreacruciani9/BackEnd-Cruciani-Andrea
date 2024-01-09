package it.epicode.week1.day2.esercizi;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("scegli un numero tra 0 e tre");
        int num= scanner.nextInt();
        compreso(num);

    }
public static void compreso(int parola){
        switch (parola){
            case 0:

                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                   break;
            default:
                System.out.println("scegli un numero tra 0/3");




        }
    }
}
