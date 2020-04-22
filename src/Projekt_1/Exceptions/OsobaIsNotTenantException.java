package Projekt_1.Exceptions;

public class OsobaIsNotTenantException extends Exception {
    public String toString(){
        return "Exception: Osoba nie jest najemca";
    }
}
