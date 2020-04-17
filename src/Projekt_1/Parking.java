package Projekt_1;

import Projekt_1.Objekty.Objekt;
import Projekt_1.Objekty.Transport;
import java.util.ArrayList;
import java.util.List;

public class Parking{
    double wolneMiejsceParking;
    double zajenteMiejsce;
    List<Transport> transportList;
    List<Objekt> przedmiotList;
    double objetosc;

    public Parking(double objetosc) {
        this.objetosc = objetosc;
        this.transportList = new ArrayList<>();
        this.przedmiotList = new ArrayList<>();
        this.wolneMiejsceParking = objetosc;
    }
}
