package Projekt_1.Objekty;

public class Lodz extends Transport {
    public int kondygnacja;

    public Lodz(int numerIndefikacyjnyObjektu, String nazwa, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny, int kondygnacja, double szerokosc, double dlugosc, double wysokosc) {
        super(nazwa, numerIndefikacyjnyObjektu, szerokosc, dlugosc, wysokosc, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.kondygnacja = kondygnacja;
    }

    public String toString() {
        return "Marka: " + nazwa + "\n" +
                "Numer rejstracyjny: " + numerRejestracijny + "\n" +
                "Objetosc: " + objetosc + "\n";
    }
}
