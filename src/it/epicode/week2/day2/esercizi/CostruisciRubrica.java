package it.epicode.week2.day2.esercizi;

import java.awt.*;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CostruisciRubrica {
    private static Map<String, String> rubrica;

    public CostruisciRubrica() {
        this.rubrica = new HashMap<>();
    }

    public static void aggiungi(String nom, String num) {
        rubrica.put(nom, num);
    }

    public void elimina(String nom) {
        System.out.println(rubrica.remove(nom));
    }

    public void searchNumber(String nom) {
        System.out.println(rubrica.get(nom));

    }

    public void searchNome(String num) {
        for (Map.Entry<String,String> contact: rubrica.entrySet()){
           if (contact.getValue().equals(num)) {
               System.out.println(contact.getKey());
           }
        }

    }

    public void allview() {
        for (Map.Entry<String, String> contact : rubrica.entrySet()) {
            System.out.println("la chiave è " + contact.getKey());
            System.out.println("il valore è " + contact.getValue());
            ;//entryset ti va a prendere tutto l'oggetto coppia chiave valore

        }
    }
}

