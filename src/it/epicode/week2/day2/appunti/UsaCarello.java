package it.epicode.week2.day2.appunti;

public class UsaCarello {
    public static void main(String[] args) {
        Carello carello=new Carello();

        //creiamo l'oggetto che ha gia dentro la lista carello
        //adesso creo l'oggetto articolo

        Articolo a1=new Articolo("quaderno","consumabili",1);

        Articolo a2=new Articolo("penna","consumabili",5);
        Articolo a3=new Articolo("gomma","consumabili",1);
//adesso li aggiungo alla lista carello

        carello.aggiungiArticolo(a1);
        carello.aggiungiArticolo(a2);
        carello.aggiungiArticolo(a3);
        carello.aggiungiArticolo(a2);

        carello.stampaArticolo();

        System.out.println(carello.totale());
    }
}
