package it.epicode.week1.day3.appunti;

public class day3 {
    //all'interno di una classe mettiamo variabili di istanza
    private int cilindrata;
    private String marca;
    private String nome;
    private String targa;
    private int porte;

    private TipiDiAuto categoria;

    //astrazione=concentrarsi caratteristiche dell'oggetto si preferisce non dare valori alle variabili di istanza ma renderle specifiche all'interno del costruttore
    //qui scriviamo il costruttore
    public day3(String marca, String nome, String targa, int cilindrata, int porte) {
        //utilizziamo questi parametri di ingresso per dare valore come parametri di ingresso
        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.porte = porte;
    }

    //all'interno della classe posso avere anche PIù costruttori e devono  avere anche lo stesso nome perche il costruttore deve avere il nome della classe,
    //ma  non devono avere i stessi parametri,o cambi posto ai paramatri nel costruttore o cambi il tipo
    public day3(String marca, String nome, String targa, int cilindrata) {
        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.cilindrata = cilindrata;

    }
        //metodo se è private in automobile mi da errore perche non e visibile e si fa solo in caso in cui voglio rendere inaccessibile quel metodo all'esterno e si fa solo quando
    //voglio fare un metodo che non devo far uscire all'esterno
        public void accellera () {
            System.out.println("sto accellerando");

        }
        public void decellera () {
            System.out.println("sto decellerando");
        }


        public void stampa () {
            System.out.println("cilindrata: " + cilindrata + " ,marca " + marca + ",nome " + nome + ", porte: " + porte + ", targa: " + targa + ", categoria: " + categoria);

        }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public String getTarga() {
        return targa;
    }

    public String getNome() {
        return nome;
    }

    public int getPorte() {
        return porte;
    }

    public TipiDiAuto getCategoria() {
        return categoria;
    }
//i metodi set modificano la variabile d'istanza hanno un parametro d'ingresso,che è il valore che andiamo a dare alla variabile d'istanza
    public void setCategoria(TipiDiAuto categoria) {
        this.categoria = categoria;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setMarca(String marca) {


            this.marca = marca;
        }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}

