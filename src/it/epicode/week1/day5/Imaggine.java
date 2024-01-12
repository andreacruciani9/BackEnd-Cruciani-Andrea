package it.epicode.week1.day5;

public class Imaggine extends MediaElement implements showback {

    private int luminosita;

    public Imaggine(String title, int durata, int luminosita) {
        super(title, durata);
        this.luminosita = luminosita;
    }

    public void abbassaLuminosità(int luminosita) {

        if ((this.luminosita - luminosita) >= 0) {
            this.luminosita -= luminosita;
            ;
        } else {
            System.out.print("luminosità è: " + luminosita);
        }
    }

    public void alzaLuminosita(int luminosita) {
        if ((this.luminosita + luminosita) <= 100) {
            this.luminosita += luminosita;


        } else {
            System.out.print("luminosità è al massimo");
        }
    }

    @Override
    public void show() {
        for (int i = 0; i < durata; i++) {
            System.out.print("il titolo è " + title);
            System.out.print(" ");
            System.out.print("luminisità: ");
            for (int f = 0; f < luminosita; f++) {
                System.out.print("#");
            }
            System.out.println();


        }
    }
}