package Projekt_1;

import Projekt_1.Exceptions.AbsenceAppartmentException;
import Projekt_1.Exceptions.AppartmentRentedException;
import Projekt_1.Objekty.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // -------------------   OSOBY  -----------------------
        new Timer().schedule(new PrzesuniecieZegara(), 0 , 5000);
        List<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba("Jesus", "Dudak", 3874, "ul.Farkor", LocalDate.parse("1999-11-23"), false));
        osobaList.add(new Osoba("Maks", "Semczenko", 7823, "ul.Ukrainki", LocalDate.parse("1879-05-18"), true));  // najemca
        osobaList.add(new Osoba("Varya", "Baranczykawa", 3564, "ul.Timoshenko", LocalDate.parse("2000-03-20"), false));
        osobaList.add(new Osoba("Lesha", "Vasczilo", 2300, "ul.Pobiedzitieliej", LocalDate.parse("2002-09-06"), false));
        osobaList.add(new Osoba("Nikita", "Demczenko", 5983, "ul.Golobiewa", LocalDate.parse("2002-03-09"), true));  // najemca
        osobaList.add(new Osoba("Maciej", "Noskow", 3480, "ul.Tankistow", LocalDate.parse("1967-12-10"), false));
        osobaList.add(new Osoba("Wadim", "Pupkin", 9754, "ul.Lorzkina", LocalDate.parse("2007-11-06"), true));  // najemca
        osobaList.add(new Osoba("Artem", "Klimowicz", 7007, "ul.Woronicza", LocalDate.parse("1889-04-30"), false));
        osobaList.add(new Osoba("Lesha", "Kosteniewicz", 1111, "ul.Moloszenko", LocalDate.parse("2000-01-30"), false));
        osobaList.add(new Osoba("Patryk", "Orlowski", 2400, "ul.Koszykowa", LocalDate.parse("1992-05-12"), false));
        List<Osoba> osobaListBlock1 = new ArrayList<>();
        osobaListBlock1.add(osobaList.get(1));
        osobaListBlock1.add(osobaList.get(2));
        osobaListBlock1.add(osobaList.get(5));
        List<Osoba> osobaListBlock2 = new ArrayList<>();
        osobaListBlock2.add(osobaList.get(3));
        osobaListBlock2.add(osobaList.get(4));
        osobaListBlock2.add(osobaList.get(6));
        List<Osoba> osobaListBlock3 = new ArrayList<>();
        osobaListBlock3.add(osobaList.get(7));
        osobaListBlock3.add(osobaList.get(8));
        osobaListBlock3.add(osobaList.get(9));

        List<Osoba> listNajemca = new ArrayList<>();
        listNajemca.add(osobaList.get(1));
        listNajemca.add(osobaList.get(4));
        listNajemca.add(osobaList.get(6));

        //------------------ BLOCKI ---------------------------
        Blok B1OS1 = new Blok(45, listNajemca, osobaListBlock1, 20);
        Blok B2OS1 = new Blok(65, listNajemca, osobaListBlock2, 15);
        Blok B3OS1 = new Blok(78, listNajemca, osobaListBlock3, 10);
        List<Blok> blokList = new ArrayList<>();
        blokList.add(B1OS1);
        blokList.add(B2OS1);
        blokList.add(B3OS1);
        // ------------------ MIESZKANIE -----------------------
        List<Mieszkanie> mieszkanieList = new ArrayList<>();
        for (int i = 0; i < B1OS1.iloscMieszkan; i++) {
            mieszkanieList.add(new Mieszkanie(276.84)); // 0 - 45
        }
        for (int i = 0; i < B2OS1.iloscMieszkan; i++) {
            mieszkanieList.add(new Mieszkanie(234.3));  // 46 - 110
        }
        for (int i = 0; i < B3OS1.iloscMieszkan; i++) {
            mieszkanieList.add(new Mieszkanie(134.98)); // 111 - 189
        }
        osobaList.get(1).mieszkanieList.add(mieszkanieList.get(32));//в помещениях не пишется что они наемцы
        osobaList.get(3).mieszkanieList.add(mieszkanieList.get(74));//mieszka z najemcej
        osobaList.get(4).mieszkanieList.add(mieszkanieList.get(45));
        osobaList.get(4).mieszkanieList.add(mieszkanieList.get(64));
        osobaList.get(6).mieszkanieList.add(mieszkanieList.get(74));
        osobaList.get(6).mieszkanieList.add(mieszkanieList.get(86));
        osobaList.get(6).mieszkanieList.add(mieszkanieList.get(97));
        //------------------- PARKING --------------------------
        List<Parking> parkingList = new ArrayList<>();
        for (int i = 0; i < B1OS1.iloscParkingMiejsc; i++) { // 0 - 20
            parkingList.add(new Parking(336.74));
        }
        for (int i = 0; i < B2OS1.iloscParkingMiejsc; i++) { // 21 - 35
            parkingList.add(new Parking(2743.2));
        }
        for (int i = 0; i < B2OS1.iloscParkingMiejsc; i++) { // 36 - 45
            parkingList.add(new Parking(8671.0));
        }
        osobaList.get(1).parkingOsobaList.add(parkingList.get(12));
        osobaList.get(3).parkingOsobaList.add(parkingList.get(34));
        osobaList.get(4).parkingOsobaList.add(parkingList.get(24));
        osobaList.get(6).parkingOsobaList.add(parkingList.get(33));
        // ------------------Transport-------------------------
        List<Transport> transportList = new ArrayList<>();
        transportList.add(new SamochodMiejski("BWM", 193, "Sportowy", "Elektryczny", "Czarny", 1, "NG78IR", "Letni", 2.23, 3.1, 1.1));
        transportList.add(new Motocykl("Harley", 265, "Turystyczny", "Jonowy", "Czerwony", 2, "TY43GH", 300, 1.0, 2.5, 0.85));
        transportList.add(new Lodz("Horizon", 286, "Motorowy", "Motorowy", "Bialy", 5, "CH54IE", 1, 5.67, 9.087, 7.89));
        transportList.add(new SamochodMiejski("Mercedes", 210, "Miejski", "Hydrauliczny", "Szary", 4, "AV21JG", "Zimowy", 3, 6.789, 1.234));
        transportList.add(new Amfibia("Lilos", 500, "Sportowy", "Hydrauliczny", "Rozowy", 10, "IO67FG", 8, 12.09, 22.09, 7.65));
        transportList.add(new SamochodMiejski("Ferrari", 300, "Sportowy", "Hydrauliczny", "Bialy", 1, "AM320NM", "Sportowy", 1.22, 2.34, 0.98));
        transportList.add(new SamochodTerenowy("BMW", 250, "Turystyczny", "Hydrauliczny", "Czarny", 6, "JI67SX", 50, 2.33, 3.5, 2.45));
        transportList.add(new Lodz("Honda", 90, "Motorowy", "Hydraliczny", "Bialy", 6, "WAW123RK", 2, 7.7, 10.67, 5.6));
        transportList.add(new Motocykl("Hyundai", 222, "Cruiser", "Electryczny", "Granatowy", 1, "SPI456TM", 220, 1.11, 3.43, 1.12));
        transportList.add(new SamochodMiejski("Mazda", 190, "Miejski", "Elektryczny", "Bialy", 4, "ERA75TM", "Letni", 1.76, 2.3, 2.3));
        //test
        // ---------------- Przedmioty -----------------------
        List<Objekt> przedmiotList = new ArrayList<>();
        przedmiotList.add(new Przedmiot("Sprzet sportowy", 3.4, 5.6, 5.0));
        przedmiotList.add(new Przedmiot("Hulajnoga", 0.23, 2.6, 1.0));
        przedmiotList.add(new Przedmiot("Rower", 0.23, 2.6, 1.0));
        przedmiotList.add(new Przedmiot("Opony", 0.4, 1.4, 1.4));
        przedmiotList.add(new Przedmiot("Alkohol", 3.1, 5.6, 5.0));
        przedmiotList.add(new Przedmiot("Rowery", 2.9, 5.6, 1.0));
        przedmiotList.add(new Przedmiot("Stary fortepian", 4.89, 5.6, 1.0));
        przedmiotList.add(new Przedmiot("Przedmioty z poprzedniego ", 7.7, 5.6, 5.0));
        przedmiotList.add(new Przedmiot("Namiot kempingowy", 1.07, 5.6, 5.0));
        przedmiotList.add(new Przedmiot("Sprzet", 2.25, 5.6, 5.0));
        // ------------------ OSIEDLE --------------------------
        List<Osiedla> osiedlaList = new ArrayList<>();
        osiedlaList.add(new Osiedla(blokList.size(), 1500, blokList));
        //-------------------------------------------------------
        meniu(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
    }

    // ------------------ MENU -----------------------------
    public static void meniu(List<Osoba> osobaList, List<Mieszkanie> mieszkanieList, List<Blok> blokList, List<Osiedla> osiedlaList, List<Objekt> przedmiotList, List<Osoba> listNajemca) {
        try {
            System.out.println("Meniu:");
            System.out.println("1.Zakończenia programu w dowolnym momencie.\n2.Wybrania którą jest osobą.\n3.Wypisania swoich danych łącznie z wynajętymi pomieszczeniami.\n4.Wyświetlenia wolnych pomieszczeń.\n5.Wynajęcia nowego pomieszczenia, po uprzednim jego wybraniu.\n6.Wybrania pomieszczenia które wynajmuje dana osoba oraz wyświetlenia zawartości pomieszczenia.\n7.Włożenia nowych pojazdów/przedmiotów pamiętając, aby nie przepełnić pomieszczenia.\n8.Wyjęcia przedmiotów lub pojazdów.\n9.Wykonania polecenia zapisującego aktualny stan osiedla do pliku.\n10.Zobaczнс aktualną datę i godzinę. ");
            System.out.println("Wprowadz numer punktu meniu:");
            Scanner sc = new Scanner(System.in);
            int idMeniu = sc.nextInt();
            System.out.println();
            if (idMeniu <= 10 && idMeniu > 0) {
                switch (idMeniu) {
                    case 1:
                        System.out.println("Program jest zakonczony.");
                        System.exit(0);
                        break;
                    case 2:
                        wprowadzeniePesel(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                    case 3:
                        Osoba account3 = wprowadzeniePesel(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        System.out.println(account3);
                        case3(account3);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                    case 4:
                        case4(mieszkanieList);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                    case 5:
                        System.out.println("Wolne mieszkania: ");
                        case4(mieszkanieList);
                        Osoba account5 = wprowadzeniePesel(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        System.out.println(account5);
                        case5(mieszkanieList, account5);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                    case 6:
                        Osoba account6 = wprowadzeniePesel(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        System.out.println(account6);
                        case6(account6);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                    case 7:
                        Osoba account7 = wprowadzeniePesel(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        System.out.println(account7);
                        case7(account7, osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                    case 8:

                        break;
                    case 9:
                        break;
                    case 10:
                        System.out.println(Zegar.data);
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                }
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception: Bledne dane \n");
            meniu(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
        } catch (AppartmentRentedException | AbsenceAppartmentException e) {
            e.printStackTrace();
        }
    }

    public static Osoba wprowadzeniePesel(List<Osoba> osobaList, List<Mieszkanie> mieszkanieList, List<Blok> blokList, List<Osiedla> osiedlaList, List<Objekt> przedmiotList, List<Osoba> listNajemca) {
        int numer = -1;
        try {
            System.out.println("Wprowadz PESEL:");
            Scanner sc = new Scanner(System.in);
            int wprPesel = sc.nextInt();
            for (int i = 0; i < osobaList.size(); i++) {
                if (osobaList.get(i).pesel == wprPesel) {
                    numer = i;
                    System.out.println("Pan/Pani na stronie danych: ");
                    System.out.println();
                    System.out.println(osobaList.get(i).imie + " " + osobaList.get(i).nazwisko);
                }
            }
            if (numer == -1) {
                throw new IndexOutOfBoundsException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception: Bledne dane!");
            meniu(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
            ;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Takiego czlowieka nie ma w bazie danych!");
            meniu(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
        }
        return osobaList.get(numer);
    }

    public static void wyjscie(List<Osoba> osobaList, List<Mieszkanie> mieszkanieList, List<Blok> blokList, List<Osiedla> osiedlaList, List<Objekt> przedmiotList, List<Osoba> listNajemca) {
        System.out.println("Wprowadz 0 jesli chcesz wrocic na poprzednia strone, lub dowolna liczbe zeby skonczyc program:");
        Scanner sc = new Scanner(System.in);
        int numer = sc.nextInt();
        if (numer == 0) {
            meniu(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
        } else {
            System.out.println("Program jest zakonczony.");
        }
    }

    public static void case3(Osoba account) {
        for (int i = 0; i < account.mieszkanieList.size(); i++) {
            System.out.println(account.mieszkanieList.get(i));
        }
    }

    public static void case4(List<Mieszkanie> mieszkanieList) {
        for (int i = 0; i < mieszkanieList.size(); i++) {
            if (mieszkanieList.get(i).najemca == null) {
                System.out.println(mieszkanieList.get(i));
            }
        }
    }

    public static void case5(List<Mieszkanie> mieszkanieList, Osoba account) throws AbsenceAppartmentException, AppartmentRentedException {
        try {
            boolean sprawdzenieMieszkania = false;
            boolean sprawdzanieNajemcy = false;
            int numerMieszkanie = -1;
            System.out.println("Numer indyfikacyjny meszkania: ");
            Scanner sc = new Scanner(System.in);
            int numerIndyfikacyjny = sc.nextInt();
            for (int i = 0; i < mieszkanieList.size(); i++) {
                if ((numerIndyfikacyjny == mieszkanieList.get(i).numerIndyfikacyjny) && (mieszkanieList.get(i).najemca == null)) {
                    sprawdzenieMieszkania = true;
                    sprawdzanieNajemcy = true;
                    numerMieszkanie = i;
                }
            }
            if (sprawdzenieMieszkania == false) {
                throw new AbsenceAppartmentException("Exception: Nie ma takiego mieszkania!");
            }
            if (sprawdzenieMieszkania == true && mieszkanieList.get(numerMieszkanie).najemca != null) {
                throw new AppartmentRentedException("Mieszkanie juz jest wynajmowane");
            }
            if (sprawdzanieNajemcy == true && sprawdzenieMieszkania == true) {
                mieszkanieList.get(numerMieszkanie).najemca = account;
                account.najemca = true;
                account.mieszkanieList.add(mieszkanieList.get(numerMieszkanie));
                mieszkanieList.get(numerMieszkanie).listOsobMieszkanie.add(account);
                System.out.println("Pan/Pani wynajmowal(a) mieszkanie na 1 miesiac");
            }
        } catch (AbsenceAppartmentException | AppartmentRentedException e) {
            System.out.println("Exception: Bledne dane!");
            case5(mieszkanieList, account);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Bledne dane!");
            case5(mieszkanieList, account);
        }
    }

    public static void case6(Osoba account) {
        for (int i = 0; i < account.mieszkanieList.size(); i++) {
            System.out.println(account.mieszkanieList.get(i));
        }
        System.out.println("Wprowadz numer indyfikacyjny meszkania: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < account.mieszkanieList.size(); i++) {
            if (account.mieszkanieList.get(i).numerIndyfikacyjny == id) {
                System.out.println(account.mieszkanieList.get(i));
            }
        }
    }

    public static void case7(Osoba account, List<Osoba> osobaList, List<Mieszkanie> mieszkanieList, List<Blok> blokList, List<Osiedla> osiedlaList, List<Objekt> przedmiotList, List<Osoba> listNajemca) {
        try {
            System.out.println("1. Wyjscie \n2. Dodac pojazd do parkingowego miejsca \n3. Dodac przedmiot do parkingowego miejsca \n4. Zobaczyc wszyskie swoje pojazdy \n 5. Zobaczyc wszyskie swoje przedmioty");
            Scanner sc = new Scanner(System.in);
            int idMeniu = sc.nextInt();
            if (idMeniu <= 3 && idMeniu >= 1) {
                switch (idMeniu) {
                    case 1:
                        wyjscie(osobaList, mieszkanieList, blokList, osiedlaList, przedmiotList, listNajemca);
                        break;
                    case 2:
                        dodanieTransportu(account);
                        break;
                    case 3:
                        dodaniePrzedmiotu(account);
                        break;
                    case 4:
                        wszystkieTransportyOsoby(account);
                        break;
                    case 5:
                        wszystkiePrzedmiotyOsoby(account);
                        break;
                }
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Exception: Bledne dane!");
        }
    }

    public static void dodanieTransportu(Osoba account) {

    }

    public static void dodaniePrzedmiotu(Osoba account) {

    }

    public static void wszystkieTransportyOsoby(Osoba account) {

    }

    public static void wszystkiePrzedmiotyOsoby(Osoba account) {

    }


}





