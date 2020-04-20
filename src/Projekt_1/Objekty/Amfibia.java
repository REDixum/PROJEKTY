package Projekt_1.Objekty;

public class Amfibia extends Transport {
    public int iloscKolo;
    public Amfibia(String marka, int pojemnoscSilnika, String typ, String typSilnika, String kolor, int iloscMiejsc, String numerRejestracijny, int iloscKolo, double szerekosc, double wysokosc, double dlugosc){
        super(szerekosc, wysokosc, dlugosc, marka, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.iloscKolo = iloscKolo;
    }

    public String toSting(){
        return "";
    }
}
