package it.epicode.week1.day1.esercizi;

import java.util.Arrays;

public class EsercizioUno {
    public static void main(String[] args){
        double per=moltiplicazione(5,10);
        System.out.println(per);
 String frase= concat("ciao",6);
 System.out.println(frase);

        String[] arr = insertIntoArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");

        System.out.println(Arrays.toString(arr));


    }

    public static double moltiplicazione(double x,double y){
        return x*y;
    }
    public  static String concat( String frase,int b ){
        return frase + b;
    }

    public static String[] insertIntoArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length +1 ; i++) {
            if(i < 2) {
                array[i] = stringArray[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }

}
