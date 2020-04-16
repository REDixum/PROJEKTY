package Projekt_1;

import Projekt_1.Transport.Objekt;
import Projekt_1.Transport.Transport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Parking extends WynajmMieszkanie{
    int poleParking = 10; // w metrach kwadratnych
    int wolneMiejsceParking;
    int zajenteMiejsce;
    List<Parking> parkingList;
    List<Transport> transportList;
    List<Objekt> przedmiotList;

    public Parking( double objetosc) {
        super(objetosc);
        this.parkingList = new ArrayList<>();
        this.transportList = new ArrayList<>();
        this.przedmiotList = new ArrayList<>();
    }
}
