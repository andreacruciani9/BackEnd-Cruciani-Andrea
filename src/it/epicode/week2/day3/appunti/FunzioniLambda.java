package it.epicode.week2.day3.appunti;

import java.util.TreeSet;

public class FunzioniLambda {
    //nuovo modo di scrivere metodi per rendere la scrittura piu rapida
    //è una funzione anonima che possiamo passare o ottenere da un ritorno di una funzione o metodo
    //vengono utilizzate quando dobbiamo scrivere corpo o metodo di interfacce funzionali
    //interfacce con metodo astratto
    //per gestire interfacce funzionali vengono create clasii anonime cioè senza nome
    //inve di creare la classe si va a creare intefaccia funzionale pper capire come istanziare la classe

    //Triset Treemap servono quando vogliamo gestire in maniera naturale e ordinata i loro elementi
    //es THreeset
    public static void main(String[] args) {
        //creo oggetto di tipo ordinatore
        Ordinatore ordinatore=new Ordinatore();//cosi metodo compare perche abbiamo impostato gia tutto in Ordinatore
        TreeSet<String> parole=new TreeSet<>(ordinatore);//ora il costruttore efatto che prende l'oggetto ordinatore e capisce come ordinare
        //aggingo stringe
        parole.add("java");
        parole.add("C++");
        parole.add("python");
        parole.add("Javascript");

        System.out.println(parole);//saranno ordinate in ordine alfabetico perche  è un Treset

        //possiamo cambiare l'ordine delle parole in ordine crescente o decrescente per farlo dobbiamo definire nel costruttore un metodo della classe che discente comparator come parametro d'ingresso per fargli capire come verranno ordinate
        //possiamo gestirli in tre modi : - 1 creo nuova classe Ordinatore

    }
}
