package Projekt_1.Exceptions;

public class AppartmentRentedException extends Exception{
    String message;
    public AppartmentRentedException(String message){
        this.message = message;;
    }

    public String toString(){
        return "Exception: Takie mieszkanie juz jest wynajmowane!";
    }
}
