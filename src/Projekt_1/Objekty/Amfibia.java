package Projekt_1.Objekty;

public class Amfibia extends Transport {
    public int iloscKolo;

    public Amfibia(int numerIndefikacyjnyObjektu, String nazwa, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny, int iloscKolo, double szerekosc, double wysokosc, double dlugosc) {
        super(nazwa, numerIndefikacyjnyObjektu, szerekosc, wysokosc, dlugosc,  pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.iloscKolo = iloscKolo;

    }

    public String toString() {
        return "Marka: " + nazwa + "\n" +
                "Numer rejstracyjny: " + numerRejestracijny + "\n" +
                "Objetosc: " + objetosc + "\n";
    }
}
