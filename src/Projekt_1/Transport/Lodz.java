package Projekt_1.Transport;

public class Lodz extends Transport {
    public int kondygnacja;
    public Lodz(String marka,int pojemnoscSilnika, String typ, String typSilnika, String kolor,int iloscMiejsc, String numerRejestracijny, int kondygnacja, double szerokosc, double dlugosc, double wysokosc){
        super(szerokosc, dlugosc, wysokosc, marka, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.kondygnacja = kondygnacja;
    }
}
