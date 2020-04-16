package Projekt_1.Transport;

public class Transport extends Objekt {
    public String marka;
    public int pojemnoscSilnika;
    public String typ;
    public String typSilnika;
    public String kolor;
    public int iloscMiejsc;
    public String numerRejestracijny;

    public Transport(double szerokosc, double dlugosc, double wysokosc, String marka, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny) {
        super(szerokosc, dlugosc, wysokosc);
        this.marka = marka;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typ = typ;
        this.typSilnika = typSilnika;
        this.kolor = kolor;
        this.iloscMiejsc = iloscMiejsc;
        this.numerRejestracijny = numerRejestracijny;
    }
}
