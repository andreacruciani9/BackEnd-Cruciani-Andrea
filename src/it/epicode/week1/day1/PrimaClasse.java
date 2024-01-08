package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {
    public static void main(String[] args) {
//SCANNER
        //scanner prima bisogna dichiararle
        Scanner scanner = new Scanner(System.in);//stiamo dicendo crea un oggetto(new scanner) che prende dati dalla tastiera in fase di esecuzione
//per prendere dati dalla tastiera creo una variabile

System.out.println("dammi un numero");
        int k = scanner.nextInt();//vuol dire che mi aspetto che l utente mi da un numero intero e lo assegno alla variabile j

        System.out.println(k);
        scanner.nextLine();
        System.out.println("dammi nuna parola");
        String parola = scanner.nextLine();
        System.out.println(parola.length());

        //VARIABILI
//come creare una variabile e come dichiararla

        int x;//prima di assegnare un valore alla variabile bisogna dichiarare la variabile e il tipo

        x = 8;//assegnazione di un valore

        x = 9;//cambio valore alla variabile

        //e possibile dichiarare il valore della variabile anche monoriga

       int y = 7;

       //possiamo fare dichiararzione a catena scrivento una sola volta  il tipo

        int a=10,b=20,c=40;

        //quando voglio fare una variabile che e una costatnte
        final int r=6;//non protra piu modificare il suo valore

        //variabile di tutti tipi primitivi

        boolean t=true;//ho creato una variabile buleanna

        char f ='e';//variabile con un solo carattere

        byte m=6;//puo contenere valori che va da -128 a +127

        short p =9;//puo contere da

        long u=3000;
        //puo vontenere fino a miliardi

        float l =3.5f;// contiene numeri con virgolaa

        double h =3.6;

        String frase= "corso java";//la variabile frase vcontiene corso java re va obbligatoriamente messa tra doppi apici
                                    // ed è un primo oggetto
        String frase2="epicode";

        String fraseConcatenata = frase+frase2;//concatenazione di stringhe

        //come stampare in console poi premi play

        System.out.println(fraseConcatenata);//con println stapa e poi va a capo invece con print e basta andra a stamapare quello che voglio dopo nella stessa riga

        //casting implicito da titpo piu piccolo in un tipo piu grande e non ci da problemi
        //casting esplicito si cerca di portare un tipo piu grande in tipo piu piccolo ma dobbiamo portare noi java a farlo

        // casting implicito

        int z= p;//short 16 bit int 32 bit

        float f2 = z;//java considera i virgola mobile + grande degli interi

        System.out.println(z);//con println stapa e poi va a capo invece con print e basta andra a stamapare quello che voglio dopo nella stessa riga
        System.out.println(f2);//con println stapa e poi va a capo invece con print e basta andra a stamapare quello che voglio dopo nella stessa riga
//OPERAZIONI
//z=z/6;//sto dicendo 9/6 quello che torna me lo salvi in z,adesso z è 1. Tra numeri interi restituira un numero  intero

        System.out.println(z);
        //Operatore modulo
        z=z%6;//se nella divisione vogliamo conoscere il resto usiamo % e serve per vedre se un numero e multiplo o se è pari o dispari
        System.out.println(z);

        //incremento

        z++;
        System.out.println(z);

        //decremento
        z--;
        System.out.println(z);


//METODI
        //metodi va scrit6to fuori main e va richiamato nel main



        double somma= somma(4, 5);
System.out.println((somma));

benvenuto("Andrea");

benvenuto("Francesca");
    }

    public static double somma(double x,double y){
      double somma=x+y;
      return somma;//se il metodo deve ritornare qwualcosa si usa return
    };

    public static void benvenuto(String nome){
        System.out.println("Benvenuto " + nome);
    }//abbiamo concatenato la stringa benvenuto + nome che passeremo come parametro


}
