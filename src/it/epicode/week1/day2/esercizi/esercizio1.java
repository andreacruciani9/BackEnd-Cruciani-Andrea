package it.epicode.week1.day2.esercizi;

import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("scrivi frase");

        String str=scanner.next();

     System.out.println(pari(str));

     System.out.println("scrivi anno");
     int parola= scanner.nextInt();
     System.out.println(anno(parola));

    };
public  static boolean pari( String frase ){
    if(frase.length()%2==0){
        System.out.println("il numero è pari");
    return true;}else {
        System.out.println("il numero è dispari");
        return false;
    }



};
public static boolean anno(int num){
    if (num %4==0 || num%100==0&&num%400==0){
        System.out.println("l'anno è bisestile");
        return true;
    }else {System.out.println("l'anno non è bisestile");
    return false;}
}}

