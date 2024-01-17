package it.epicode.week2.day3.appunti;


import it.epicode.week2.day2.appunti.Articolo;

import java.util.List;

public class UsaLambda {
    public static void main(String[] args) {
        //servono per sostituire classi anonime in caso ce un interfaccia funzionale
        //creiamo interfaccia funzionale (sommatore)
        //quando c'e un interfaccia funzionale io posso usare la funzione lmbda
        //creo variabile di tipo sommatore
        Sommatore sommatore=(a , b)->a+b;
        System.out.println(sommatore.somma(10.00,20.00));


    Verificatore verificatore=(s,c)->s.length()>c;

        System.out.println(verificatore.verificare("ciccio",5));//haq verificato se la lunghezza è maggiore o no

        Cerchio c= r->Math.PI*r*r;
        System.out.println(c.area(5));

        System.out.println("metodo SommaLista");
        List<Double> lista= List.of(2.3,5.5,7.2,10.12);
        SommaLista sommaLista=l->{ double somma=0;
        for (double x:l){
            somma +=x;
        }
            return somma;
        };
        System.out.println("la somma lista è " + sommaLista.sommaLista(lista));

        Articolo a1=new Articolo("quaderno","consumabili",1);

        Articolo a2=new Articolo("penna","consumabili",5);
        Articolo a3=new Articolo("gomma","consumabili",1);
    List<Articolo>listArticolo=List.of(a1,a2,a3);

    //supponiamo di voler calcolare il costo totale di questi tre articoli
        //possiamo usare come primo metodo intermedio reduce( contatore(accomulatore,1 parametri))
        System.out.println(listArticolo.stream().map(a->a.getPrezzo()).reduce(0,(somma,i)->somma+=i));
//se volessi sommare solo gli articoli inferiori ad 1 euro percio prima di fare map faccio un filter(p->p<1)ecc...come sopra
        //se mi metto prima di map prendo la variabile in map .filter(a-<a.gerPrezzo()<1)....


    //per mappare il prezzo minimo
        System.out.println(listArticolo.stream().filter(a->a.getPrezzo()<1).map(a->a.getPrezzo()).min((p1,p2)->(p1-p2)));
    }
}
