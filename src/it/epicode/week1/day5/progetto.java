package it.epicode.week1.day5;

import java.util.Arrays;
import java.util.Scanner;

public class progetto {
    public static void main(String[] args) {
        Audio audio = new Audio("Bella Ciao ", 5, 50);
        audio.play();
        audio.abbassaVolume(40);
        audio.play();
        audio.abbassaVolume(15);
        audio.alzaVolume(40);
        audio.alzaVolume(100);


        Video video = new Video("Ciccio Pasticcio", 5, 1, 1);
        video.show();

        video.show();
        video.alzaVolume(3);
        video.alzaLuminosita(3);
        video.show();
        video.abbassaVolume(2);
        video.show();
        video.abbassaLuminosità(1);
        video.show();

        Imaggine imaggine = new Imaggine("Naranca", 3, 1);

        imaggine.show();
        imaggine.alzaLuminosita(5);
        imaggine.show();
        imaggine.abbassaLuminosità(2);
        imaggine.show();

        Scanner scanner = new Scanner(System.in);
        MediaElement[] mediaElements = new MediaElement[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("scegli la categoria" + ("1= audio," + "2=video " + ", 3=imaggine"));
            int type = scanner.nextInt();
            String title = "";
            if (type > 0 && type < 4) {
                System.out.println("inserisci titolo");
                title = scanner.next();
            } else {
                System.out.println("selezione errata");
            }
            switch (type) {
                case 1:
                    System.out.println("inserisci la durata");
                    int durata = scanner.nextInt();
                    System.out.println("inserisci volume di partenza");
                    int volume = scanner.nextInt();
                    mediaElements[i] = new Audio(title, durata, volume);
                    System.out.println(mediaElements[0].title + mediaElements[0].durata);
                    break;
                case 2:
                    System.out.println("inserisci la durata");
                    int durata2 = scanner.nextInt();
                    System.out.println("inserisci il volume");
                    int volume2 = scanner.nextInt();
                    System.out.println("inserisci la luminosità");
                    int lume = scanner.nextInt();
                    mediaElements[i] = new Video(title, durata2, volume2, lume);
                    break;
                case 3:
                    System.out.println("inserisci la durata");
                    int durata3 = scanner.nextInt();
                    System.out.println("inserisci la luminosità");
                    int lume2 = scanner.nextInt();
                    mediaElements[i] = new Imaggine(title, durata3, lume2);
            }

        }

        int scelta;
        do {
            System.out.println("scegli tra 1 e 5 per selezionare gli eelmenti");
            scelta = scanner.nextInt();
            if (scelta > 0 && scelta <= 5) {
                if (mediaElements[scelta].getClass() == Video.class || mediaElements[scelta].getClass() == Audio.class) {
                    mediaElements[scelta - 1].play();

                } else if (mediaElements[scelta].getClass() == Imaggine.class) {
                    mediaElements[scelta - 1].show();
                } else {
                    System.out.println("hai sbagliato");
                }
            }
        }
            while (scelta != 0) ;





    }
}



