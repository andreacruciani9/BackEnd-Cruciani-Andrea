package it.epicode.week1.day1.esercizi;

import java.util.Scanner;

public class EsercizioTre {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double[] perimetro= new double[2];
System.out.println("inserisci una lunghezza");
perimetro[0]=scanner.nextDouble();
System.out.println("inserisci la larghezza");
perimetro[1]=scanner.nextDouble();
double perim1=Perimetro(perimetro[0],perimetro[1]);
System.out.println("il perimetro è " + Perimetro(perimetro[0],perimetro[1]));

System.out.println("inserisci un numero");
int number= scanner.nextInt();
        PariDispari(number);

double [] area=new double[2];
System.out.println("inserisci lunghezza base");
area[0]= scanner.nextDouble();
System.out.println("inesisci altezza");
area[1]=scanner.nextDouble();
double area1= Area(area[0],area[1]);
System.out.println( "l'area è = " +area1);



    }

    public static double Perimetro(double x,double y){
      return x+y+x+y;
    }

    public static void  PariDispari(int number){
        if (number %2==0){
            System.out.println("il numero  è pari");
        }else { System.out.println("il numero  è dispari");}
    }
    public  static double Area(double b,double h){
        return (b*h)/2;
    }
}
