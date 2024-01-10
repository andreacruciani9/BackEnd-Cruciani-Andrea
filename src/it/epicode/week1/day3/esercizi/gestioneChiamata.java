package it.epicode.week1.day3.esercizi;

import java.util.ArrayList;
import java.util.Scanner;

public class gestioneChiamata {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci il numero da salvare");
        String numSalvato = scanner.nextLine();
        System.out.println("credito esaurito,Quanto vuoi ricaricare?");
        String ricarico=scanner.nextLine();


        double credito =0.0;
        sim sim=new sim(numSalvato,credito);
        sim.datisim();

    }


}
