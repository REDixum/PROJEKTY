package Projekt_1.Transport;

import Projekt_1.Transport.Transport;

public class SamochodTerenowy extends Transport {
    public int srednicaKola;
    public SamochodTerenowy(String marka,int pojemnoscSilnika, String typ, String typSilnika, String kolor,int iloscMiejsc, String numerRejestracijny, int srednicaKola, double szerokosc, double dlugosc, double wysokosc){
        super(szerokosc, dlugosc, wysokosc, marka, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.srednicaKola = srednicaKola;
    }
}
