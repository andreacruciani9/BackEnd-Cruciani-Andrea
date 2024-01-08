package it.epicode.week1.day1.esercizi;

public class EsercizioUno {
    public static void main(String[] args){
        double per=moltiplicazione(5,10);
        System.out.println(per);
 String frase= concat("ciao",6);
 System.out.println(frase);

 String [] parole=new String[6];


    }

    public static double moltiplicazione(double x,double y){
        return x*y;
    }
    public  static String concat( String frase,int b ){
        return frase + b;
    }

}
