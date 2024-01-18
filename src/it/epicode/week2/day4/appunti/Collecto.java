package it.epicode.week2.day4.appunti;

import java.util.*;
import java.util.stream.Collectors;

public class Collecto {
    //possono eseere utilizzati per creare liste,map ,set ,calclare statistiche
    //metodi
    //Collectors.
    //stream2
    public static void main(String[] args) {
        List<String> so=List.of("windows,IOS,android,Linux");

        //collect metodo finalizzatore dove posso usare collectors
        //collectors.tostream ti porta uno stream in una nuova lista
      List<String>so2=  so.stream().filter(s->s.length()>4).collect(java.util.stream.Collectors.toList());

        System.out.println(so2);

        List <String> so3= so.stream().filter(s->s.length()>3).collect(java.util.stream.Collectors.toUnmodifiableList());

//toset=stiamo generando un set a partire nella lita e serve a ripetere gli elementi solo una volta

        Set<String>soSet=so.stream().filter(s->s.length()>4).collect(Collectors.toSet());
//anche per quando riguarda il set c'è un unmodifableSet
        System.out.println(soSet);

      //  Set<String>soSet2=  so.stream().filter(s->s.length()>4).collect(Collectors.toUnmodifiableList());

        //to collection possiamo andare ad avere piu controllo e andiamo a generare un nuovo stream in una nuova lista
        LinkedList<String>so4=so.stream().filter(s->s.length()>4).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(so4);

        //join ci permette di concatenare uno stream di stringhe possiamo sccegliere come concatenarlo andando a decidere dentro le tonde
     String parola = String.join(",", so);

        System.out.println(parola);
        //summing poossiamo a sommare le lunghezze delle stringhe
        so.stream().collect(Collectors.summingInt(/*value -> value.length()=*/String::length));
        //evrege serve a calcolare la media della lunghezza delle stringhe
        so.stream().collect(Collectors.averagingInt(/*value -> value.length()=*/String::length));
        //summirizing int da delle informazioni statistiche nello stram

        so.stream().collect(Collectors.summarizingInt(/*value -> value.length()=*/String::length));

        //possiamo calcolare il massimo e il minimo,con compare to  ci restituisce optional ed e una classe che permette di evitare di ricevere un null
        //accedendo all optional e possibile accedere vari metodi
        so.stream().collect(Collectors.maxBy(String::compareTo));//*value -> value.length()))
//minby(Comparetor.naturalOrder).get
so.stream().map(String::length).collect(Collectors.minBy(Comparator.naturalOrder())).get();

    //se volessimo associare ad ogni stringa la propria lunghezza (groupBy) possiamo ottenere delle mappe che ci permettono di ragguparle dentro uno stream con una chiave e un valore
        //supponiamo di voler conoscere quande stringhe iniziano con un determinata lettera (parola che vogliamo cercare)
        so.stream().collect(Collectors.groupingBy(s -> s.charAt(0),Collectors.counting()));
//partitionBy in base ad una particolare ragruppamento che accetta una condizione  es vogliamo raggruppare la grandezza aggiore di tre delle stringhe  ad una genere due
Map<Boolean, Long> mappa=so.stream().collect(Collectors.partitioningBy(s -> s.length()>3, Collectors.counting()));
//il metodo limiti ci permette di limitare lo stream è una specie di filtro e filta in base all'indice che diamo come valore
        //es
        System.out.println( so.stream().limit(2).collect(Collectors.toList()));
//metodi che consentono di definire dei calcoli e possono essere applicati dopo la scrittura di questi metodi MaptoDouble,MapToInt,MaptoLong prendono come parametro d'ingresso

//se io volessi calcolare la somma delle lunghezze delle stringhe potrei fare

        System.out.println( so.stream().mapToInt(String::length).min().getAsInt());

    }

}
