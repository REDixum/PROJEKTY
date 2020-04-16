package Projekt_1;

import Projekt_1.Objekty.Objekt;
import Projekt_1.Objekty.Transport;
import java.util.ArrayList;
import java.util.List;

public class Parking extends WynajmMieszkanie{
    int poleParking = 10; // w metrach kwadratnych
    int wolneMiejsceParking;
    int zajenteMiejsce;
    List<Transport> transportList;
    List<Objekt> przedmiotList;

    public Parking( double objetosc) {
        super(objetosc);
        this.transportList = new ArrayList<>();
        this.przedmiotList = new ArrayList<>();
    }
}
