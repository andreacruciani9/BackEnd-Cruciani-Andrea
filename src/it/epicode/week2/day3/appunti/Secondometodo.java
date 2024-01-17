package it.epicode.week2.day3.appunti;

import java.util.Comparator;
import java.util.TreeSet;

public class Secondometodo {
    public static void main(String[] args) {


    //
    TreeSet<String> parola= new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);//compareTo serve a comparare le due variabili e restituisce un numero

        }
    });


    //parole.add ecc uguale a come scritto in funzioni lmpda

        parola.add("java");
        parola.add("C++");
        parola.add("python");
        parola.add("Javascript");


    }


    ;//ora il costruttore efatto che prende l'oggetto ordinatore e capisce come ordinare
    //aggingo stringe





}
