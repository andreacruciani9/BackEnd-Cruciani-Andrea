package it.epicode.week2.day3.appunti;

import java.util.List;
import java.util.stream.Stream;

public class JavaStream {
    //e un flusso di dati puo lavorare sia parallelo che sequenziale
    //ha una sorgente degli intermedi e una destinazione
    //filtri,ordinare,mappare,distinguere
    //lo stram può avere varie sorgenti e solitamente viene generato dalle collection
    //il metodo stram nelle collection genera un flusso di dati che sara salvati nella collection
    //possiamo usare la classe strem per salvare dati al interno con il metodo of
    //quando creiamo uno stram dobbiamo dichiarare il tipo
    //altro modo statico di stream è
    //una volta chiamato possi andare ad agg dati e quando scriviamo build viene creato lo stream
// }
    public static void main(String[] args) {
        List<Integer>numeri= List.of(2,5,7,9,3);

     Stream<Integer>streamNumeri =   numeri.stream();//crea un flusso di dati dove poi potro applicare dei metodi che prende interfacce funzionali come ingrasso
    Stream<Integer> s1 =Stream.of(3,6,7,8,9,3);//ho creato uno stram a partire da questi valore
        //creare uno stream utilizzando un builder
        Stream<String> s2=Stream.<String>builder().add("java").add("C").add("javascript").build();

    //lo straam di operazione intermedie può essere modificato e queste sono
        //ciclare mappatura e il filtraggio

//supponiamo di voler stampare solo i metodi pari della lista
        for(Integer i:numeri){
            if (i%2==0){
                System.out.println(i);
            }
        }
//adesso vediamo invece l'upgrade con lo stream

        streamNumeri.filter(e->e%2==0).forEach(e-> System.out.println(e));//metodo intermedio non finalizza lo stream dobbiamo utilizzare un metodo finalizzatore(foreach,map,count,toList)



        //se vogliamo transformare dei numeri in stringhe possiamo utilizzare l'operazione intermedia map =converte un elemento in un altro elemento che può essere di tipo differente;

    }}