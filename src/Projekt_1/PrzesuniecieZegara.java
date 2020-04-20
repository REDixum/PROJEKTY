package Projekt_1;

import java.util.TimerTask;

public class PrzesuniecieZegara  extends TimerTask {
    @Override
    public void run() {
        Zegar.data = Zegar.data.plusDays(1);
    }
}
