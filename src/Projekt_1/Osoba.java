package Projekt_1;

import Projekt_1.Objekty.Objekt;
import Projekt_1.Objekty.Transport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Osoba implements Comparable<Osoba> {
    private static int indeks = 0;
    public int id = 1;
    public String imie;
    public String nazwisko;
    public int pesel;
    public String adres;
    public LocalDate dataUrodzenia;
    public boolean najemca = false;
    public List<Mieszkanie> mieszkanieList;
    public List<Parking> parkingOsobaList;
    public List<Transport> transportOsobaList;
    public List<Objekt> przedmiotOsobaList;

    public Osoba(String imie, String nazwisko, int pesel, String adres, LocalDate dataUrodzenia, boolean najemca) {
        this.adres = adres;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.mieszkanieList = new ArrayList<>();
        this.parkingOsobaList = new ArrayList<>();
        this.transportOsobaList = new ArrayList<>();
        this.przedmiotOsobaList = new ArrayList<>();
        this.id = ++indeks;
        if (najemca == true) {
            this.najemca = true;
        }
    }


    @Override
    public int compareTo(Osoba o) {
        return dataUrodzenia.compareTo(o.dataUrodzenia);
    }

    public String toString() {
        return "Imie: " + imie + "\n" +
                "Nazwisko: " + nazwisko + "\n" +
                "Data urodzenia: " + dataUrodzenia + "\n" +
                "Pesel: " + pesel + "\n" +
                "Adres: " + adres + "\n" +
                "ID: " + id + "\n" +
                "Ilosc wynajetych mieszkan: " + mieszkanieList.size() + "\n" +
                "Ilosc wynajetych parkingow: " + parkingOsobaList.size() + "\n";
    }


}
