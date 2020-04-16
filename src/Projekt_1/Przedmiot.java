package Projekt_1;

import Projekt_1.Transport.Objekt;

public class Przedmiot extends Objekt {
    public String nazwa;
    public Przedmiot(String nazwa, double szerokosc, double dlugosc, double wysokosc) {
        super(szerokosc, dlugosc, wysokosc);
        this.nazwa = nazwa;
    }
}
