package it.epicode.week2.day1.esercizi;

import java.util.Random;

public class NumeriRandom {
    int [] num;

    public NumeriRandom() {
    }

    public void mostra(int n){
       int num[]=new int[5] ;
        if (num==null){
            Random random=new Random();
            for (int i=0;i<num.length;i++){
               num[i]= random.nextInt(10);

            }

        }

        System.out.print(num[]);
    }

    public void modifica (int numero) {

        if ( numero<10&&numero!=0){
            Random random=new Random();
            for (int i =0;i<num.length;i++){
                num[numero]=random.nextInt(10);

            }

        }

    }
}
