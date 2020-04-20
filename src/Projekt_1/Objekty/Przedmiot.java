package Projekt_1.Objekty;

public class Przedmiot extends Objekt {
    public String nazwa;
    public int numerIndefikacyjnyPrzedmiotu;

    public Przedmiot(String nazwa, double szerokosc, double dlugosc, double wysokosc) {
        super(szerokosc, dlugosc, wysokosc);
        this.nazwa = nazwa;
    }

    public String toString() {
      return  "Nazwa: " + nazwa + "\n" +
              "Objetosc: " + objetosc + "\n" +
              "Numer identyfikacyjny: " + numerIndefikacyjnyPrzedmiotu + "\n";
    }
}
