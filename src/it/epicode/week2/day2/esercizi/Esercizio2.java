package it.epicode.week2.day2.esercizi;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        ArrayList<Integer> numerirandom = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("scegli un numero");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double numrandom = Math.random() * 100;
            int randomNumber = (int) numrandom;
            numerirandom.add(randomNumber);


        }


        Collections.sort(numerirandom);
        System.out.println(numerirandom);
        System.out.println(cambia(numerirandom));
        pariEdispari(numerirandom,true);
        pariEdispari(numerirandom,false);

    }

        public static ArrayList<Integer> cambia(ArrayList<Integer> numerirandom) {
            ArrayList<Integer> arr= numerirandom;
            Collections.reverse(arr);





            return arr;

        }
        public static void pariEdispari(ArrayList<Integer> lis,boolean t){

        if (t==true){
            for (int k :lis){
                if (k%2==0) {
                    System.out.println(k);
                }

            }
            ;


        }else if(t==false) {
            for (int k :lis){
                if (k%2!=0)
            System.out.println(k);}
        }
        }

}