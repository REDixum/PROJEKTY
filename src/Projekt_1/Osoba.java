package Projekt_1;

import Projekt_1.Objekty.Objekt;
import Projekt_1.Objekty.Transport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Osoba implements Comparable<Osoba>{
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
    public boolean oplataMieszkanie = false;

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


    Thread run = new Thread(new Runnable() {
        @Override
        public void run() {
          while(true) {
              try {
                  generowanieDecyzij(oplataMieszkanie);
                  oplata(najemca, oplataMieszkanie, mieszkanieList);
                  Thread.sleep(30000);
              } catch (InterruptedException e){
              }
          }
        }
    });

    public static void oplata(boolean najemca, boolean oplataMieszkanie, List<Mieszkanie> mieszkanieList){
        if(najemca){
            if(oplataMieszkanie){
                for(int i = 0; i < mieszkanieList.size(); i++){
                    mieszkanieList.get(i).dataZakonczenia.plusDays(30);
                }
            } else {

            }
        }
    }
    public static void generowanieDecyzij(boolean oplataMieszkanie){
        int decyzja = (int)Math.random()*2;
        if(decyzja == 0){
            oplataMieszkanie = false;
        } else {
            oplataMieszkanie = true;
        }
    }

    public static void eksmisja(){

    }

}
