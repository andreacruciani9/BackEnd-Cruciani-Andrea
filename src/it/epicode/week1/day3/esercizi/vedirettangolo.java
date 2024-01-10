package it.epicode.week1.day3.esercizi;

import java.util.Scanner;

public class vedirettangolo {
    public static void main(String[] args) {
       {
           rettangolo rettangolo=new rettangolo(10,20);
           rettangolo rettangolo2=new rettangolo(20,10);


           rettangolo.stampa();
           rettangolo2.stampa();

           rettangolo.duerettangoli(rettangolo,rettangolo2);
           Scanner scanner=new Scanner(System.in);
           System.out.println("imposta altezza rettangolo");
           int alt=scanner.nextInt();
           System.out.println("imposta larghezza rettangolo");
           int larg=scanner.nextInt();

           rettangolo rettangolo3=new rettangolo( alt,larg);
           System.out.println("l'area del rettangolo è " + rettangolo3.stampaArea());





        };
    }
}
