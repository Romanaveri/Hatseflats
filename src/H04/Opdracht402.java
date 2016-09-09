package H04;

/**
 * Created by roman on 9-9-2016.
 */


import java.awt.*;
import java.applet.*;

public class Opdracht402 extends Applet {
    public void paint(Graphics g) {
        g.drawLine(20, 100, 100, 20);
        g.drawLine(100, 20, 180, 100);
        g.drawLine(20, 100, 180, 100);
        g.drawLine(20, 100, 20, 200);
        g.drawRect(20, 100, 160, 160);
        g.drawRect(50, 130, 40, 40);
        g.drawRect(50, 130, 15, 15);
        g.drawRect(50, 155, 15, 15);
        g.drawRect(75, 155, 15, 15);
        g.drawRect(75, 130, 15, 15);
        g.drawRect(125, 200, 30, 60);
        g.drawRect(132, 210, 15, 10);

    }
}
