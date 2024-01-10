package it.epicode.week1.day3.esercizi;

public class rettangolo {
    private int higth;
    private int weigth;


    public rettangolo(int higth,int weigth ){
        this.higth=higth;
        this.weigth=weigth;


    }



    public void stampa() {
        int area=this.higth*this.weigth;
        int perimetro= (this.higth+this.weigth)*2;
        System.out.println("l'area è " + area );
        System.out.println("il perimetro è " +perimetro);

    }

    public int stampaArea(){
        return this.weigth*this.higth;
    }
    public  int stampaPerimetro(){
        return (this.higth+this.weigth)*2;
    }


        public  void  duerettangoli(rettangolo ret1,rettangolo ret2){
        ret1.stampa();
        ret2.stampa();

        System.out.println("l'area dei due rettangoli è " +(ret1.stampaArea()+ret2.stampaArea()));
        System.out.println("il perimetro dei due rettangoli è "+ (ret2.stampaPerimetro()+ret1.stampaPerimetro()));

    }
}
