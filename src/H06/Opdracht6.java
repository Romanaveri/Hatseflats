package H06;

/**
 * Created by roman on 18-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Opdracht6 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 7;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}