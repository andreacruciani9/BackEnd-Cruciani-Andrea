package it.epicode.week1.day3.appunti;

public class day3 {
    //all'interno di una classe mettiamo variabili di istanza
    public  int cilindrata;
    public  String marca;
    public  String nome;
    public  String targa;
    public  int porte;
    //astrazione=concentrarsi caratteristiche dell'oggetto si preferisce non dare valori alle variabili di istanza ma renderle specifiche all'interno del costruttore
     //qui scriviamo il costruttore
 public day3(String marca,String nome, String targa, int cilindrata,int porte){
     //utilizziamo questi parametri di ingresso per dare valore come parametri di ingresso
this.marca=marca;
 this.nome=nome;
 this.targa=targa;
 this.cilindrata=cilindrata;
 this.porte=porte;
 }
 //all'interno della classe posso avere anche PIù costruttori e devono  avere anche lo stesso nome perche il costruttore deve avere il nome della classe,
    //ma  non devono avere i stessi parametri,o cambi posto ai paramatri nel costruttore o cambi il tipo
    public day3(String marca,String nome,String targa, int cilindrata){
        this.marca=marca;
        this.nome=nome;
        this.targa=targa;
        this.cilindrata=cilindrata;


    }

    //metodo
    public  void accellera(){
        System.out.println("sto accellerando");

    }
    public  void  decellera(){
        System.out.println("sto decellerando");
    }
}
