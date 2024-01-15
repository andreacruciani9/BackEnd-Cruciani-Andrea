package it.epicode.week2.day1.appunti;

import java.sql.SQLException;

public class usaAritmetica {
    public static void main(String[] args) {
        aritmetica aritmetica=new aritmetica();
        //5:0 non si puo fare percio porta un eccezione
     ;
        try{
            System.out.println(aritmetica.divisione(5,3));
        }
        //se voglio gestire piu eccezioni usi la super classe e qui metto tutte le eccezzionji ma non si tutte le eccezioni percio dovremo gestirla qui posso mettere una stampa ma non e una buona pratica un fase di programmazione
        //mi da errore nel secondo catch perchè non ci entrero mai  per farlo funnzionare bisogna fare il contrario
     //   catch (Exception e){}
        catch (ArithmeticException e){
            System.out.println("divisione per 0 non ammessa");
        }/*catch (ArithmeticException e){
            System.out.println("ciccio");
        }*/
        finally {

        }
        //catch (SQLException e){}
        System.out.println("programma finito");
    }
}
