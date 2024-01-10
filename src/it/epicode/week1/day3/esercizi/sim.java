package it.epicode.week1.day3.esercizi;

import java.util.ArrayList;
import java.util.List;

public class sim {
    private String numeroTelefono;
    private double credito;
    private double costoPerSecondo;
    private List<String> ultimeChiamate;


public sim(String numeroTelefono, double costoPerSecondo/*,String[] ArrayList*/){
    this.numeroTelefono=numeroTelefono;
    this.credito=0;
    this.costoPerSecondo=costoPerSecondo;
    this.ultimeChiamate=new ArrayList<>();
   // this.ArrayList=ArrayList;

}

public void datisim() {
    String user = this.numeroTelefono + this.credito;
    System.out.println(user);
    for (String chiamata : ultimeChiamate) {
        System.out.println(chiamata);
    }
}public  String getNumeroTelefono(){
    return numeroTelefono;
    }

    public  double getCostoPerSecondo(){
    return  costoPerSecondo;
    }
    public  double getCredito(){
    return credito;
    }

    public void setCredito(double nuovoCredito){
    this.credito=nuovoCredito;
    }

    public boolean telefonata(int secondi, String numeroChiamato) {
        double costoChiamata = costoPerSecondo * secondi;
        if (credito >= costoChiamata) {
            credito -= costoChiamata;
            String chiamata = "Durata: " + secondi + " secondi, Numero chiamato: " + numeroChiamato;
            aggiungiChiamata(chiamata);
            return true;
        } else {
            return false;
        }
    }

    private void aggiungiChiamata(String chiamata) {
        if (ultimeChiamate.size() >= 5) {
            ultimeChiamate.remove(0);
        }
        ultimeChiamate.add(chiamata);
    }
}





