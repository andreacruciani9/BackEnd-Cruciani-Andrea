package it.epicode.week1.day3.appunti.usa;

import it.epicode.week1.day3.appunti.day3;

public class automobile {
    public static void main(String[] args) {
        day3 auto=new day3("fiat","500","AZ342",1500,3);

       /* auto.cilindrata=1500;
        auto.marca="fiat" ;
        auto.nome="500";
        auto.porte=3;
        auto.targa="AZ3432";
*/
        System.out.println("cilindrata: " + auto.cilindrata + " ,marca " + auto.marca + ",nome " + auto.nome + ", porte: " + auto.porte + ", targa: " + auto.targa);

     auto.accellera();

     auto.decellera();

    }
}
