package Projekt_1.Objekty;

public class Objekt {
    public double objetosc;
    public int numerIndefikacyjnyObjektu;
    public String nazwa;

    public Objekt(String nazwa, int numerIndefikacyjnyObjektu , double szerokosc, double dlugosc, double wysokosc){
        this.numerIndefikacyjnyObjektu = numerIndefikacyjnyObjektu;
        this.objetosc = szerokosc * dlugosc * wysokosc ;//w metrach
        this.nazwa = nazwa;
    }

}
