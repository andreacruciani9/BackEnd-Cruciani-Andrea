package it.epicode.week2.day3.appunti;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class UsaDate {
    public static void main(String[] args) {
        //local date -local time -local daytime 3 classi di date
        //per creare una data non esiste il costruttore percio per creare date usiamo metodi statici
        LocalDate ld1=LocalDate.now();//vede la data di oggi aa/mm/gg
        System.out.println(ld1);

        //crare data specifica metodo of sono due il primo parametro mm e nome gg il secondo mm e nr gg
        LocalDate ld2=LocalDate.of(2020, Month.JULY,2);
        System.out.println(ld2);

        //alto modo per creare una data metodo parse è un metodo che permette di trasformare una stringa in una data se ne è presente se non la trova va in errore
        //la data deve essere scritta aa-mm-gg
        LocalDate ld3=LocalDate.parse("2023-05-06");
        System.out.println(ld3);

        //metodi LocalDate
        //metodi get permettono di prelevare nome mese ,anno ,giorno.
        //es
        ld1.getDayOfMonth(); //gg del mese

        //is after is before ci permettono di comparare quale data viene prima o dopo le date ritorna valore booleani

        System.out.println(ld1.isAfter(ld2));

        //i metodi minus=togliere e plus=aggiungere alla data non modificano mai data di partenza ma ne creano un altra modificata

        LocalDate ld4 = ld1.plusDays(20);
        System.out.println(ld1);
        
        System.out.println(ld4);
        //until ci permette di confrontare la differenza tra due date,prende come primo parametro d'ingresso un altra data e un altro parametro d'ingresso che definisce gg/mm/aa(classe ChronoUnit)
       //il - e che ld1 viene dopo ld2 ,+ e il contrario
        //restituisce un log
        System.out.println(ld1.until(ld2, ChronoUnit.DAYS));

        //classe localTime gestisce solo la parte di orario
        //non ha costruttore pubblico percio per accedere dobbiamo farlo con metodi statiti
        LocalTime.now();//otteniamo la data di ora
        //creare un orario specifico
        LocalTime lt5=LocalTime.of(5,45,40);
        System.out.println(lt5);
        //parse se scritta in ore,mm,ss
        LocalTime lt6=LocalTime.parse("10:34:45");
        System.out.println(lt6);

        //metodi uguali i get a Localdate es
        System.out.println(lt5.getHour());
        //anque qui ce is after is before per comparare se un ora viene prima o secondo
        //minus e plus come in LocalDate
        //anche qui until differenza tra due orari
        System.out.println(lt5.until(lt6,ChronoUnit.MINUTES));

        //per lavorare sia con data e ora usiamo la classe LocalDayTime
        //i metodi sono gli stessi che troviamo in localdate e localtime
        //get,is After,is Before,until ecc..
        LocalDateTime lt8=LocalDateTime.now();
        System.out.println(lt8);

        //per il time stamp metodo .toepocsecond tempo preso in secondi dal 1970
        System.out.println(lt8.toEpochSecond(ZoneOffset.UTC));//utc il nostro fuso orariog


    }
}
