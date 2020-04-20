package Projekt_1.Objekty;

public class SamochodMiejski extends Transport {
   public String  typOpon;
    public SamochodMiejski(String marka,int pojemnoscSilnika, String typ, String typSilnika, String kolor,int iloscMiejsc, String numerRejestracijny, String typOpon, double szerokosc, double dlugosc, double wysokosc){
        super(szerokosc, dlugosc, wysokosc, marka, pojemnoscSilnika, typ, typSilnika, kolor, iloscMiejsc, numerRejestracijny);
        this.typOpon = typOpon;
    }
    public String toString(){
        return "Marka: " + marka + "\n" +
                "Numer rejestracijny: " + numerRejestracijny + "\n" +
                "Objetosc: " + objetosc;
    }
}
