package Projekt_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mieszkanie extends WynajmMieszkanie{
        private static int indeks =0;
        public int numerIndyfikacyjny;
        List<Osoba> listOsobMieszkanie;

    public Mieszkanie(double objetosc) {
            super(objetosc);
            listOsobMieszkanie = new ArrayList<>();
            this.numerIndyfikacyjny= ++indeks;
        }

        public String toString () {
            return "\n Mieszkanie: " + "\n" +
                    "Najemca: " + (najemca != null ? najemca.id : "") +
                    "Data rozpoczecia: " + dataRozpoczeczia + "\n" +
                    "Data zakonczenia: " + dataZakonczenia + "\n" +
                    "Mieszkancy: " + listOsobMieszkanie + "\n" +
                    "Numer indyfikacyjny: " + numerIndyfikacyjny  + "\n";

        }





}
