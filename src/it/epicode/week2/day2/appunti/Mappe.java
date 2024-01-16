package it.epicode.week2.day2.appunti;

import java.util.HashMap;
import java.util.Set;

public class Mappe {
    //le mappe è composta come due colonne percio ogni riga e composta da due elementi 1 chiave e un valore che corrispondono inieme
    //le chiavi non possono contenere duplicati mentre i  valori si
    //le mappe viene implementate da queste tre classi
    //Hashmap i dati sono contenuti in chiave valore e non contengono un ordine di indice
    //treemap discente da sorted map che un altra interfaccia e aggiunge l'ordine naturale delle chiavi utilizzando un tremap
    //LinkedHasmap mantiene l'ordine e sono piu lente

    public static void main(String[] args) {
       //le mappe hanno bisogno di due generic il primo riferito alla chiave il secondo il valore
        //cosi creo un hashmap
        HashMap<Integer,Articolo>inventario=new HashMap<>();

        Articolo a1=new Articolo("quaderno","consumabili",1);

        Articolo a2=new Articolo("penna","consumabili",5);
        Articolo a3=new Articolo("gomma","consumabili",1);

        //metodi di Hashmap

        //inventario.clear();ripulisci completamente la mappa
        //.put analogo add cioe mi permette di inserire una coppia chiave valore
        inventario.put(1,a1);//l'articolo a1 avra codice 1
        inventario.put(2,a2);//ho inserito gli elementi nella mappa
        inventario.put(3,a3);
    //se inserisco un duplicato viene scartato quello vecchio
    //conteins key o conteins value verifico se contiene chiave o valore ed e booleano
        System.out.println(inventario.containsKey(3));
        //metodo get mi permette di estrarre un valore dandoigli la chiave e mette in atto unica ricerca diretta in una mappa
        Articolo a=inventario.get(1);

        //per ciclare una mappa non possiamo fare un ciclo avanzata perche abbiamo una coppia
        //per ciclare possiamo utilizzare il metodo keySet e ci permette di ciclare le chiavi della mappa ed estrarle e salvarle nel set
        Set <Integer>chiavi=inventario.keySet();
        //adesso posso fare un ciclo avanzato e per ogni chiave entro nella mappa e estraggo articolo associato
        for (Integer c:chiavi){
            System.out.println(inventario.get(c));
        }//per modificare gli elementi dentro le mappe si usa il metodo replace puoi andare a sostituire una coppia con un altra coppia
        //il metodo remuve si puo rimuovere sia la chiave che valore solo se ce quella chiave corrisponde quel valore

        //per cercare la key collegata al valore delle mappe
 Set<Integer> chiav=inventario.keySet();
        for (Integer f :chiav) {
            Articolo articolo=inventario.get(f);

            if (articolo.equals(a1)){
                System.out.println("l'articolo collegato è " + f);
            }

        }
//estraiamo tutte le chiavi dalla mappe
//cicliamo l'articolo

    }

}

