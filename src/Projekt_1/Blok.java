package Projekt_1;
        import java.util.List;

public class Blok {
        int iloscMieszkan;
        List<Osoba> listNajemca;
        List<Osoba> listOsobaBlok;
        int iloscParkingMiejsc;

        public Blok(int iloscMieszkan, List<Osoba> listNajemca, List<Osoba> listOsobBlok, int iloscParkingMiejsc){
                this.iloscMieszkan = iloscMieszkan;
                this.listNajemca = listNajemca;
                this.listOsobaBlok = listOsobBlok;
                this.iloscParkingMiejsc = iloscParkingMiejsc;
        }



}
