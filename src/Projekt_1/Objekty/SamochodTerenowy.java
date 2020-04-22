package Projekt_1.Objekty;

public class SamochodTerenowy extends Transport {
    public int srednicaKola;

    public SamochodTerenowy(int numerIndefikacyjnyObjektu, String nazwa, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny, int srednicaKola, double szerokosc, double dlugosc, double wysokosc) {
        super(nazwa, numerIndefikacyjnyObjektu, szerokosc, dlugosc, wysokosc, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.srednicaKola = srednicaKola;
    }

    public String toString() {
        return "Marka: " + nazwa + "\n" +
                "Numer rejstracyjny: " + numerRejestracijny + "\n" +
                "Objetosc: " + objetosc + "\n";
    }
}
