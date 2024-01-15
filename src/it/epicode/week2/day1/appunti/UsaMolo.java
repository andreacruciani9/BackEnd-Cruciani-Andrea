package it.epicode.week2.day1.appunti;

public class UsaMolo {
    public static void main(String[] args) {
        Molo m= Molo.crea("2342",10);
 try {

     m.assegnaPostoBarca(2, "caravella");
     m.assegnaPostoBarca(2, "santamaria");
 }catch (postoOccupatoException e){
     System.out.println(e.getMessage());

 }
    }
}
