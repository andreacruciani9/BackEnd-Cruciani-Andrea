package it.epicode.week2.day3.appunti;


import java.util.List;
@FunctionalInterface
public interface SommaLista {

    public double sommaLista(List<Double> numeri);

    public default void stampa(){
        System.out.println("ciao");//con default posso implementare un alro metodo;
    }
}
