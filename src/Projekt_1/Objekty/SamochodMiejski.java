package Projekt_1.Objekty;

public class SamochodMiejski extends Transport {
    public String typOpon;

    public SamochodMiejski(int numerIndefikacyjnyObjektu, String nazwa, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny, String typOpon, double szerokosc, double dlugosc, double wysokosc) {
        super(nazwa, numerIndefikacyjnyObjektu, szerokosc, dlugosc, wysokosc, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.typOpon = typOpon;
    }

    public String toString() {
        return "Marka: " + nazwa + "\n" +
                "Numer rejstracyjny: " + numerRejestracijny + "\n" +
                "Objetosc: " + objetosc + "\n";
    }
}
