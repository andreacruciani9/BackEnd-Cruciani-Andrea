package it.epicode.week2.day3.appunti;

import java.util.TreeSet;

public class ProvaEspressioniLambda {
    public static void main(String[] args) {


    TreeSet<String> paroloni= new TreeSet<>((o1,o2) ->o2.compareTo(o1));




        paroloni.add("java");
        paroloni.add("C++");
        paroloni.add("python");
        paroloni.add("Javascript");
        System.out.println(paroloni);}



}




