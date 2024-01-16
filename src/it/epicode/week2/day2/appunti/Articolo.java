package it.epicode.week2.day2.appunti;

import java.util.Objects;

public class Articolo {
   private String titolo;
   private  String categotia;
   private int prezzo;

    public Articolo(String titolo,String categotia,int prezzo) {
        this.titolo = titolo;
        this.categotia=categotia;
        this.prezzo=prezzo;


    }

    public int getPrezzo() {
        return prezzo;
    }

    public String getCategotia() {
        return categotia;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setCategotia(String categotia) {
        this.categotia = categotia;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override//cosi riusciamo a non aver errori in lettura nel metodo mostra
    public String toString() {
        return "Articolo{" +
                "titolo='" + titolo + '\'' +
                ", categotia='" + categotia + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articolo articolo = (Articolo) o;
        return prezzo == articolo.prezzo && Objects.equals(titolo, articolo.titolo) && Objects.equals(categotia, articolo.categotia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, categotia, prezzo);
    }
}
