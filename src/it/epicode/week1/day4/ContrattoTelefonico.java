package it.epicode.week1.day4;

public class ContrattoTelefonico {
    private int numeroTel;
    private  String utente;
    private int costoTelefonate;

    private int numeroTelefonate;

    private final  double COSTO_AL_SECONDO;

    public ContrattoTelefonico(double costoAlSecondo) {

        COSTO_AL_SECONDO = costoAlSecondo;
    }
}
