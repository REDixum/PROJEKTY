package Projekt_1.Exceptions;

public class TooManyThingsException extends Exception{
    public String toString(){
        return "Exception: Remove some old items to insert a new item";
    }
}
