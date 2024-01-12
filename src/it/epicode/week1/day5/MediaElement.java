package it.epicode.week1.day5;
//classe padre
abstract public class MediaElement {
    protected  String title;
    protected int durata;


    public MediaElement(String title,int durata){
        this.title=title;
        this.durata=durata;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
