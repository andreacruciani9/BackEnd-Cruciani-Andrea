package it.epicode.week2.day1.appunti;

public class Molo {
    private String codice;
    private int numPostiBarca;

    private  String[] barche;

    //costruttore
    private Molo(String codice,int numPostiBarca){this.codice=codice;
    this.numPostiBarca=numPostiBarca;
    barche=new  String[numPostiBarca];
    }

    public String getCodice() {
        return codice;
    }

    public int getNumPostiBarca() {
        return numPostiBarca;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setBarche(String[] barche) {
        this.barche = barche;
    }

    public void setNumPostiBarca(int numPostiBarca) {
        this.numPostiBarca = numPostiBarca;
    }
    public static Molo crea(String codice, int numPostiBarca){
        Molo m= new Molo(codice,numPostiBarca);
        return m;
    }
    public boolean libero(int n){
        if(barche[n]!=null){
            return false;
        }return true;
    }

    public void assegnaPostoBarca(int n,String b) throws postoOccupatoException{
        if (libero(n)){
            barche[n]=b;
        }else {
            //cosi genero l'eccezione checked exeption uncheched rantimexception
            throw new postoOccupatoException("il Posto " + n  +" è occupato" );

        }
    }
}
