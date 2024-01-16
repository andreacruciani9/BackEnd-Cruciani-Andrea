package it.epicode.week2.day2.esercizi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        ArrayList<Integer> numerirandom=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);



        System.out.println("scegli un numero");
       int n= scanner.nextInt();
       for (int i=0;i<n;i++){
           double numrandom=Math.random()*100;
           int randomNumber=(int) numrandom;
           numerirandom.add(randomNumber);


       }


        System.out.println(numerirandom);
        }
    }
/*public ArrayList cambia(ArrayList e){


}*/
