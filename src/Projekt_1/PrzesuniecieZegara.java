package Projekt_1;

import java.time.LocalDate;
import java.util.TimerTask;

public class PrzesuniecieZegara  extends TimerTask {
    public static LocalDate data = LocalDate.of(2020, 4, 17);
    @Override
    public void run() {
        data = data.plusDays(1);
    }
    public static LocalDate getCurrentDate() {
        return data;
    }
}
