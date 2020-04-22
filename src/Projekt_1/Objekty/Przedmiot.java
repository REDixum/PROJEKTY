package Projekt_1.Objekty;

public class Przedmiot extends Objekt {
    public String nazwa;

    public Przedmiot(int numerIndefikacyjnyObjektu, String nazwa, double szerokosc, double dlugosc, double wysokosc) {
        super(nazwa,numerIndefikacyjnyObjektu, szerokosc, dlugosc, wysokosc);
        this.nazwa = nazwa;
        this.numerIndefikacyjnyObjektu =numerIndefikacyjnyObjektu;

    }

    public String toString() {
        return "Nazwa: " + nazwa + "\n" +
                "Objetosc: " + objetosc + "\n" +
                "Numer indefikacyjny: " + numerIndefikacyjnyObjektu + "\n";
    }
}
