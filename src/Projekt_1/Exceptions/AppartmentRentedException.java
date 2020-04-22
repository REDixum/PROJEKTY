package Projekt_1.Exceptions;

public class AppartmentRentedException extends Exception{
    public String toString(){
        return "Exception: Mieszkanie juz jest wynajmowane!";
    }
}
