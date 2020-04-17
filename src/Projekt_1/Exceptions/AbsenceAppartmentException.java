package Projekt_1.Exceptions;

public class AbsenceAppartmentException extends Exception{
    String message;
    public AbsenceAppartmentException(String message){
        this.message = message;
    }
    public String toString(){
        return "Exception: Nie ma takiego mieszkania!";
    }
}
