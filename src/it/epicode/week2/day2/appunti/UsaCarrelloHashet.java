package it.epicode.week2.day2.appunti;

public class UsaCarrelloHashet {



        public static void main(String[] args) {
            CarrelloHasset carello=new CarrelloHasset();

            //creiamo l'oggetto che ha gia dentro la lista carello
            //adesso creo l'oggetto articolo

            Articolo a1=new Articolo("quaderno","consumabili",1);

            Articolo a2=new Articolo("penna","consumabili",5);
            Articolo a3=new Articolo("gomma","consumabili",1);
Articolo a4=new Articolo("penna", "consumabile",5);
          Articolo a5=a4;
            System.out.println(a4.hashCode());
            System.out.println(a5.hashCode());
            //adesso li aggiungo alla lista carello

            carello.aggiungiArticolo(a1);
            carello.aggiungiArticolo(a2);
            carello.aggiungiArticolo(a3);
            carello.aggiungiArticolo(a4);
//l'hawsset poer poter verificare se gli oggeti sono uguali o no si una .equals o .hascode
            //hascode ci permete di prendere il codice univoco dell'oggetto che sarebbe l'indece dove sta nodo
            carello.stampaArticolo();

            System.out.println(carello.totale());
        }
    }


