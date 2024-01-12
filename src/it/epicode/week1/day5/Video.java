package it.epicode.week1.day5;

public class Video extends MediaElement implements showback {
    private int volume;
    private int luminosita;

    public Video(String title, int durata, int volume, int luminosita) {
        super(title, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }





    public void abbassaVolume(int volume) {

        if ((this.volume - volume) >= 0) {
            this.volume -= volume;
        } else {
            this.volume = 0;
            System.out.println("il volume è " + volume);
        }
    }

    public void alzaVolume(int volume) {
        if ((this.volume + volume) <= 100) {
            this.volume += volume;
        } else {
            this.volume = 100;
            System.out.println("il volume è " + volume);
        }
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
            for (int k = 0; k < volume; k++) {
                System.out.print("!");
            }
            System.out.print(" ");
                for (int f = 0; f < luminosita; f++) {
                    System.out.print("#");
                }
                System.out.println();

        }
    }
}