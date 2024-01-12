package it.epicode.week1.day3.appunti.usa;

import it.epicode.week1.day3.appunti.TipiDiAuto;
import it.epicode.week1.day3.appunti.day3;

public class automobile {
    public static void main(String[] args) {
        day3 auto=new day3("fiat","500","AZ342",1500,3);

       /* auto.cilindrata=1500;
        auto.marca="fiat" ;
        auto.nome="500";
        auto.porte=3;
        auto.targa="AZ3432";
*///auto.categoria= TipiDiAuto.SUV;
auto.stampa();

auto.setMarca("Ford");
auto.setNome("kuga");
        System.out.println(auto.getMarca());
        System.out.println(auto.getNome());

     auto.accellera();

     auto.decellera();

     day3 auto2=new day3("fiat","500","AZ341",1500,5);
auto2.stampa();
   day3 auto3=auto;
   //se imposto un nuovo dato a auto 3 cambiera anche il dato di auto perche sono collegati
  // auto3.cilindrata=1700;
   System.out.println(auto.equals(auto3 ));


    }
}
