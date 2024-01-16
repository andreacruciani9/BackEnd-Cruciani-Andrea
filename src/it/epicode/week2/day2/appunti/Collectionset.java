package it.epicode.week2.day2.appunti;

import java.util.HashSet;

public class Collectionset {
    //set non accetta duplicati
    //non permette l' acesso posizionale perche non ha indice
    //le implementazioni piu importanti sono
    //Hashset
    public static void main(String[] args) {
        //in questo modo abbiamo fatto una lista di parole che non permette duplicati e indice
        HashSet<String>parole=new HashSet<>();
//i HashSet hanno i stessi metodi di list tranne quelli che hanno l'utilizzo dell'indice
    parole.add("udinese");
    parole.add("sassuolo");
    parole.add("cagliari");
    parole.add("udinese");
//la stampa non mi mostrerà due volte la stringa udinese e non garantisce l'ordine di inserimento

        System.out.println(parole);
for (String s:parole){
    System.out.println(s);
}
    }
}
