package it.epicode.week2.day2.appunti;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Arrayliste {
    public static <Strings> void main(String[] args) {
        //il costruttore senza parametri d'ingresso crea un lista vuota;l'arreylist e una lista che si autoridimensiona percio se inseriamo o togliamo elementi la lista si allunga o diminuisce da sola;
      //si chiamano cosi perche utilizzano gli array con la logica delle collection;per accedere alle varie posizione si usa indice
        //cosi come dichiarato io posso inserire qualsiasi tipo di dato;e crea problemi nell'estrazione perche me li estrae che sono di tipo object e percio ho difficolta nel lavorarci
        // lo si risolve con i generics<String> abbiamo detto che la lista dovrà contenere solo stringhe
        ArrayList <String> lista=new ArrayList<>();//ora sara un arrey list di stringhe e ci si metterano solo oggetti di tipo string e verranno estratti come stringhe e non come objetct
//i generic accettano solo classi e no i primitivi per aggiungere i proimitivi ci sono delle classi:
        // Integer;Byte;Short;Long;Float;Boolean;Character.

        //cosi dichiaro un arrey come fatto fin ora
        //int[]numeri=new int[3];



        //come inserire i dati nelle liste
    //il metodo add ci permette di aggiungere elementi a questa lista in questo caso sono stringhe
        lista.add("Cagliari");
        lista.add("Empoli");
        lista.add("Sassuolo");
        lista.add("Udinese");

        //per estrarre uso il metodo get prende un parametro d'ingresso che e l'indice
    String s = lista.get(1);//mi estrarra quella in posizione 2 devo star attento ad non estrarre quelle in posizione sbagliata senno ho un eccezione che dovro gestire
        System.out.println(s);

        //per vedere quando è lunga la lista
        System.out.println(lista.size());

        //per cancellare tutti gli elementi della lista
       // lista.clear();

        //e un metodo contrario di get percio noi diamo elemento e lui ci dice dove trovarli se abbiamo due uguali lui ci restituirà solo il primo
        System.out.println(lista.indexOf("udinese"));

        //prende l'oggetto che vogliamo rimuovere e la sua lunghezza si accorcia
        lista.remove(0);

        // il metodo set mi npermette di settare/modificare solo posizioni gia occupate da   un elemento già presente prende due parametri d'ingresso un indice e l'elemento
       lista.set(0,"parma");
        System.out.println(lista.get(0));

    //quando chiamamiamo il toString nella lista dobbiamo fare attenzione che quegli elementi hanno il toString

        //restituisce un arrey che con gli elementi nella lista
    Object[] parole= lista.toArray();
    //se vogliamo passarlo in un arrey di stringhe

    String[]squadre=new String[5];

    lista.toArray(squadre);

    //come ciclare negli arrey (for) dobbiamo scrivere nella condizione nomeLista.size e la fine .get(i)
    for (int i =0;i<lista.size();i++){
        System.out.println(lista.get(i));
    }
    //for avanzatono usa indici,entre nella lista prende il 'primo elemnto ecosi via percio noi andremo a lavorare solo con x perche contiene tutti gli elementi
        for(String x:lista){//dichiarazione della variabile che è lo stesso tipo della lista-nome variabile:nomeLista
            System.out.println(x);//con  questo for non si puo fare il controllo posizione perche non usa l'indice qui cicla tutta la lista ma va bene per estrarre tutti i dati
        }
    }

    {   //si sceglie tra i due list in base alle prestazioni
        LinkedList<String> linkedList = new LinkedList<>();
        //hanno gli stessi metodi degli Arreylist+ addFirst,addLast
        //getFirst andiamo a prendere il primo elemento della lista
        //getLast l'ultimo
        //poll non fanno la stessa cosa di get ma quando preleva l'elemento lo cancella dalla lista
//push prende l'elemento che vogliamo inserire come parametro e lo inserisce in testa}
    }}
//linkedHaset a i stessi metodi ma mantierne l'ordine di inserimento
//triset permette di avere un ordinamento naturale all'interno del set e lo si puo avere un particolaare costruttore o per ordine di crescenza o alfabetico