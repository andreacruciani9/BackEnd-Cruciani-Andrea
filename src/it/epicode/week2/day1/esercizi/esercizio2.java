package it.epicode.week2.day1.esercizi;

import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.logging.Logger;

public class esercizio2 {

    public static void main(String[] args) {
        int km;
        int litro;
        final Logger logger= (Logger) LoggerFactory.getLogger("input");
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci il num km");
        km=scanner.nextInt();
        System.out.println("inserisci num litri");
        litro=scanner.nextInt();

        try {
            System.out.println("rapporto km per litro");
            System.out.println(km/litro);

        }catch (ArithmeticException e){
            logger.info("divisione sbagliata");
        }
    }
}
