package Projekt_1.Objekty;

public class Transport extends Objekt {
    public int pojemnoscSilnika;
    public String typ;
    public String typSilnika;
    public String kolor;
    public int iloscMiejsc;
    public String numerRejestracijny;

    public Transport(String nazwa, int numerIndefikacyjnyObjektu, double szerokosc, double dlugosc, double wysokosc,  int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny) {
        super(nazwa, numerIndefikacyjnyObjektu, szerokosc, dlugosc, wysokosc);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typ = typ;
        this.typSilnika = typSilnika;
        this.kolor = kolor;
        this.iloscMiejsc = iloscMiejsc;
        this.numerRejestracijny = numerRejestracijny;
    }
}
