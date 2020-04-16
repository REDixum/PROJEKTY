package Projekt_1.Objekty;

public class Przedmiot extends Objekt {
    String nazwa;
    public Przedmiot(String nazwa, double szerokosc, double dlugosc, double wysokosc) {
        super(szerokosc, dlugosc, wysokosc);
        this.nazwa=nazwa;
    }
}
