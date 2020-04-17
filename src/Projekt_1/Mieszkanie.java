package Projekt_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mieszkanie {
        private static int indeks =0;
        public int numerIndyfikacyjny;
        List<Osoba> listOsobMieszkanie;
        LocalDate dataRozpoczeczia;
        LocalDate dataZakonczenia;
        Osoba najemca;
        double objetosc;

    public Mieszkanie(double objetosc) {
            this.objetosc = objetosc;
            listOsobMieszkanie = new ArrayList<>();
            this.numerIndyfikacyjny= ++indeks;
        }

        public String toString () {
            return "\n Mieszkanie: " + "\n" +
                    "Najemca: " + (najemca != null ? najemca.id : "Nie ma najemcy!") +
                    "Data rozpoczecia: " + dataRozpoczeczia + "\n" +
                    "Data zakonczenia: " + dataZakonczenia + "\n" +
                    "Mieszkancy: " + listOsobMieszkanie + "\n" +
                    "Numer indyfikacyjny: " + numerIndyfikacyjny  + "\n";

        }





}
