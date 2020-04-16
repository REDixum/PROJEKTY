package Projekt_1.Objekty;

public class Motocykl extends Transport {
    public int waga;
    public Motocykl(String marka,int pojemnoscSilnika, String typ, String typSilnika, String kolor,int iloscMiejsc, String numerRejestracijny, int waga, double szerokosc, double dlugosc, double wysokosc){
        super(szerokosc, dlugosc, wysokosc, marka, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.waga = waga;
    }
}
