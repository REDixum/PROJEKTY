package Projekt_1;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class Zegar {
    public static LocalDateTime data = LocalDateTime.of(2020, 4, 17, 20, 46);

    public static void zegar() {
        System.out.println(data);
    }
}

