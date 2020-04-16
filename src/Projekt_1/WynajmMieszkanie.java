package Projekt_1;

import java.time.LocalDate;


public class WynajmMieszkanie  {
    Osoba najemca;
    LocalDate dataRozpoczeczia;
    LocalDate dataZakonczenia;

    public WynajmMieszkanie( double objetosc){
        this.dataRozpoczeczia = dataRozpoczeczia;
        this.dataZakonczenia = dataZakonczenia;
    }

    public String toString(){
        return "Mieszkanie wynajmowane: " + "\n" +
                "Data rozpoczecia: " + dataRozpoczeczia + "\n"+
                "Data zakonczenia: " + dataZakonczenia + "\n"+
                "Objetosc pomieszczenia: " + "\n";


    }

}
