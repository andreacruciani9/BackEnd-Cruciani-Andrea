package it.epicode.week2.day1.esercizi;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Random;
import java.util.Scanner;


public class UsaNumeri {
    final static Logger logger= LoggerFactory.getLogger("esercizio1");

    public static void main(String[] args) {
        int[] array=new int [5];
        Random random=new Random();
        Scanner scanne=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array [i]=random.nextInt(10)+1;
            System.out.println(array[i]);
            logger.info("array creato");
inserisci(array);
        }

    }
    public static void  inserisci(int []array){
        Scanner scanner=new Scanner(System.in);
        int num;
        int pos;
        final int exit=0;

        do{
            System.out.println("inserisci numero");
            num=scanner.nextInt();
            if (num == 0) {
                System.out.println("sei uscito");
continue;
            }
            try {
                System.out.println("inserisci la posizione");
                pos=scanner.nextInt();
                array[pos-1]=num;
                print(array);


            }catch (ArrayIndexOutOfBoundsException e){
                logger.info("indice non previsto");
            inserisci(array);
            }
        }while (num!=exit);


    }
    public static void print(int[] arr){
        System.out.println("nuovo array");
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
