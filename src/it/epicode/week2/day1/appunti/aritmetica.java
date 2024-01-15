package it.epicode.week2.day1.appunti;

public class aritmetica {

    //creo un metodo la gestione dll'eccezione posso genstirla nel metodo ma non posso mettere un try cath con un return
    public int divisione(int a,int b)throws ArithmeticException,NullPointerException{
        return a/b;
     //   int risultato= 0;

    //try {
      //  risultato=a/b;
    //}
    //catch (ArithmeticException ex){
      //  System.out.println("divisione per 0 non ammessa");
      //  ex.printStackTrace();//dalla variabile ex e possibile arrivare hai metodi dell'eccezione
    //}
    //return risultato;
    }//quando la gestione dell'errore non ha una grande inteligenza allora in try catch si gestisce nel main

}
