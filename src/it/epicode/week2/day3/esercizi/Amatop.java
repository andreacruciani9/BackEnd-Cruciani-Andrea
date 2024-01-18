package it.epicode.week2.day3.esercizi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.list;

public class Amatop {


    public static void main(String[] args) {
        //creato prodotti
        Product p1 = new Product(1, "il codice da vinci", "Books", 10.50);
        Product p2 = new Product(2, "Lufy One Piace 5th Gear", "boys", 40.90);
        Product p3 = new Product(3, "cluedo", "Boys", 30.50);
        Product p4 = new Product(4, "Biberon", "Baby", 12.50);
        Product p5 = new Product(5, "ciccio", "Baby", 6.50);
        Product p6 = new Product(6, "Harry Potter il calice di fuoco", "Books", 100.50);
        //creato clienti
        Custumer c1 = new Custumer(7, "Andrea", 2);
        Custumer c2 = new Custumer(8, "Simone", 2);
        Custumer c3 = new Custumer(9, "Davide", 1);
        Custumer c4 = new Custumer(10, "Fabio", 1);


        //crea ordine
        Order order = new Order(c1);
//order.aggiungiOrdine(1,2)

        //creo listra prodotti
        List<Product> products = List.of(p1, p2, p3, p4, p5, p6);
        Stream<Product> listaprodotti = products.stream();


        List<Product> prodottifil = listaprodotti.filter(list -> list.getCategoria().contains("Book") && list.getPrice() > 100).toList();
        prodottifil.forEach(System.out::println);



    }
}
