package Projekt_1;

import Projekt_1.Objekty.Objekt;
import Projekt_1.Objekty.Transport;

import java.lang.reflect.Array;
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
    public List<Mieszkanie> mieszkanieNaOplate;
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
        this.mieszkanieNaOplate = new ArrayList<>();
        run.start();
        run1.start();
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
                  oplata(najemca, oplataMieszkanie, mieszkanieList, mieszkanieNaOplate, parkingOsobaList);
                  Thread.sleep(30000);
              } catch (InterruptedException e){
              }
          }
        }
    });

    Thread run1 = new Thread(new Runnable() {
        @Override
        public void run() {
            while(true) {
                try {
                    sprawdzenieOplaty(mieszkanieList, mieszkanieNaOplate);
                    Thread.sleep(10000);
                } catch (InterruptedException e){
                }
            }
        }
    });

    public static void oplata(boolean najemca, boolean oplataMieszkanie, List<Mieszkanie> mieszkanieList, List<Mieszkanie> mieszkanieNaOplate, List<Parking> parkingOsobaList) {
        if (najemca){
            for(int i = 0; i < mieszkanieNaOplate.size(); i++) {
                if (oplataMieszkanie) {
                    int id = mieszkanieNaOplate.get(i).numerIndyfikacyjny;
                    mieszkanieList.get(id).dataZakonczenia.plusDays(30);
                    mieszkanieNaOplate.remove(i);
                } else if (!oplataMieszkanie || mieszkanieNaOplate.get(i).dataZakonczenia.isBefore(Zegar.getCurrentDate())) {
                    eksmisja(parkingOsobaList, mieszkanieList, mieszkanieNaOplate);
                }
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

    public static void eksmisja(List<Parking> parkingOsobaList, List<Mieszkanie> mieszkanieList, List<Mieszkanie> mieszkanieNaOplate){
        boolean sprawdzSpszedazTransportu = false;
        int count = 0;
        if(parkingOsobaList.size() != 0){
            for(int i = 0; i < parkingOsobaList.size(); i++){
                if(parkingOsobaList.get(i).transportList.size() != 0){
                    count++;
                    for(int j = 0; j < parkingOsobaList.get(i).transportList.size(); j++){
                        parkingOsobaList.get(i).transportList.remove(j);
                        sprawdzSpszedazTransportu = true;
                        dalszyWynajm(mieszkanieNaOplate, mieszkanieList);
                        break;
                    }
                    break;
                } else if(!sprawdzSpszedazTransportu){
                    if(parkingOsobaList.get(i).przedmiotList.size() != 0){
                        count++;
                        for(int j = 0; j < parkingOsobaList.get(i).przedmiotList.size(); j++){
                            parkingOsobaList.get(i).przedmiotList.remove(j);
                            sprawdzSpszedazTransportu = true;
                            dalszyWynajm(mieszkanieNaOplate, mieszkanieList);
                            break;
                        }
                        break;
                    }
                } else {
                    if(count == parkingOsobaList.size()){
                        eksmisjaMieszkancow(mieszkanieList, mieszkanieNaOplate);
                    }
                }
            }
        }
    }

    public static void dalszyWynajm(List<Mieszkanie> mieszkanieNaOplate, List<Mieszkanie> mieszkanieList){
        int id = 0;
        for(int i = 0; i<mieszkanieNaOplate.size(); i++){
            id = mieszkanieNaOplate.get(i).numerIndyfikacyjny;
            mieszkanieList.get(id).dataZakonczenia.plusDays(60);
        }
    }

    public static void eksmisjaMieszkancow(List<Mieszkanie> mieszkanieList, List<Mieszkanie> mieszkanieNaOplate){
        int id;
        for(int i = 0; i < mieszkanieNaOplate.size(); i++){
            id = mieszkanieNaOplate.get(i).numerIndyfikacyjny;
            mieszkanieList.get(id).najemca = null;
            mieszkanieList.remove(id);
        }
        for(int i = 0; i < mieszkanieNaOplate.size(); i++){
            id = mieszkanieNaOplate.get(i).numerIndyfikacyjny;
            for(int j = 0; j < mieszkanieNaOplate.get(i).listOsobMieszkanie.size(); j++){
                mieszkanieList.get(id).listOsobMieszkanie.remove(j);
            }
        }
    }

    public static void sprawdzenieOplaty(List<Mieszkanie> mieszkanieList, List<Mieszkanie> mieszkanieNaOplate) {
        for(int i = 0; i < mieszkanieList.size(); i++){
            for(int j = 0; j < mieszkanieNaOplate.size(); j++){
                if(mieszkanieNaOplate.get(j) == mieszkanieList.get(i)){
                    // Mieszkanie juz znajduje w liscie na oplate!
                } else{
                    if(mieszkanieList.get(i).dataZakonczenia.isBefore(Zegar.getCurrentDate())){
                        mieszkanieNaOplate.add(mieszkanieList.get(i));
                    }
                }
            }
        }
    }

}
