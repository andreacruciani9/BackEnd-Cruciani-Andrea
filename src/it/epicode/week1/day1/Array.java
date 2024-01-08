package it.epicode.week1.day1;

import java.util.Scanner;

public class Array {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

     /*   int[] numeri= new int[5];//cosi si dichiara un arrey e crea arrey vuoto
    //per vedere cosa c'e dentro un arrey bisogna anadre a vederlo con i cicli il piu giusto e il ciclo for ,un arrey di base non e mai vuoto perche java all'interno mette tutti zero}



        //per prendere i valori da inserire da testo faccio uno scanner e un ciclo
for (int i=0;i<numeri.length;i++){
    System.out.println("Dammi un numero");
    numeri[i]=scanner.nextInt();
}

        //come inserire i valori dentro un arrey

        numeri[0]=4;
        numeri[2]=3;

        for (int i=0; i < numeri.length;i++){
            System.out.println(numeri[i]);
    }*/
//per creare un arrey con già dei dati faccio cosi
        String[] giorniSettimana={
            "lunedi","martedi","mercoledi","giovedi","venerdi","sabato"
        };
        for (int i=0; i < giorniSettimana.length;i++){
            System.out.println(giorniSettimana[i]);

    }
}}
