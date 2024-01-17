package it.epicode.week2.day3.appunti;

import java.util.Comparator;

public class Ordinatore  implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);//compareTo serve a comparare le due variabili e restituisce un numero
        //indica positivo:viene dopo la striga opassata come parametro
        //negativo il contrario
        //il valore che restitisce  e la differenza le prime due lettere delle parole diverse e calcola quande lettere mancano alla stinga che troviamo come parametro
        //o1.compareTo(o2) ordinamento alfabetico
        //o2.compareto(o1) ordinamento inverso
        //ora andiamo alla pagina di prima
    }

    // comparator e la prima interfaccia funzionale percche ha solo un metodo atratto

}
