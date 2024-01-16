package it.epicode.week2.day2.appunti;

import java.util.ArrayList;

public class Carello {

    private ArrayList<Articolo> carrello;

    public Carello() {
        //inizializzo l'arrey list
        carrello =new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo){
        //adesso aggiungo l' articolo al carrello
        carrello.add(articolo);
    }

    public  void stampaArticolo(){
        //cosi abbiamo un problema di lettura dell'arrey perche stamperà l'indirizzo di memotia
        System.out.println(carrello);
    }

    public double totale() {
//leggere ogni elemento nel carelllo e prendere i costi prodotto

        double costoCarello=0;

        for (Articolo articolo:carrello){
            costoCarello+=articolo.getPrezzo();//ad ogni articolo che estraggo prendo il prezxzo e lo aggiungo al costo carello

        }return costoCarello;

    }
}


