package Projekt_1.Objekty;

public class Motocykl extends Transport {
    public int waga;

    public Motocykl(int numerIndefikacyjnyObjektu, String nazwa, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny, int waga, double szerokosc, double dlugosc, double wysokosc) {
        super(nazwa, numerIndefikacyjnyObjektu, szerokosc, dlugosc, wysokosc, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.waga = waga;
    }

    public String toString() {
        return "Marka: " + nazwa + "\n" +
                "Numer rejstracyjny: " + numerRejestracijny + "\n" +
                "Objetosc: " + objetosc + "\n";
    }
}
