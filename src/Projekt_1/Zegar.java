package Projekt_1;

import java.time.LocalDate;
import java.util.TimerTask;

public class Zegar  extends TimerTask {
    public static LocalDate data = LocalDate.of(2020, 4, 17);
    @Override
    public void run() {
        data = data.plusDays(1);
        System.out.println("-------------- Date: " + data.toString());
    }
    public static LocalDate getCurrentDate() {
        return data;
    }
}
