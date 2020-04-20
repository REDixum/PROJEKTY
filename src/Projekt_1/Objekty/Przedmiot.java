package Projekt_1.Objekty;

public class Przedmiot extends Objekt {
    private static int indeks = 0;
    public String nazwa;
    public int numerIndefikacyjnyPrzedmiotu;

    public Przedmiot(String nazwa, double szerokosc, double dlugosc, double wysokosc) {
        super(szerokosc, dlugosc, wysokosc);
        this.nazwa = nazwa;
        numerIndefikacyjnyPrzedmiotu = indeks++;
    }

    public String toString() {
      return  "Nazwa: " + nazwa + "\n" +
              "Objetosc: " + objetosc + "\n" +
              "Numer identyfikacyjny: " + numerIndefikacyjnyPrzedmiotu + "\n";
    }
}
