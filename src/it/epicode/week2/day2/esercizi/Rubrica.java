package it.epicode.week2.day2.esercizi;




import java.util.HashMap;

import static it.epicode.week2.day2.esercizi.CostruisciRubrica.aggiungi;

public class Rubrica {

    public static void main(String[] args) {
CostruisciRubrica rub=new CostruisciRubrica();

        aggiungi("ciccio","892424");
        aggiungi("ciccia","892626");
        aggiungi("franco","892525");

        rub.elimina("franco");

        rub.allview();
        System.out.println("il numero che stai cercando è : ");
        rub.searchNumber("ciccia");
        System.out.println("il nome che stai cercando è : ");
        rub.searchNome("892424");






    }

   /* public static HashMap inserisci(String n,Integer t){

        HashMap<String,Integer> rub=;
        rub.put(n,t);
return rub;
    }*/

}
