package H05;

/**
 * Created by roman on 18-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint (Graphics g) {

        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, 160, 10);

        g.drawRect(10, 30, 150, 70);

        g.setColor(Color.magenta);

        g.drawOval(200, 120, 150, 70);
        g.fillOval(200, 120, 150, 70);

        g.fillRect(200, 30, 150, 70);

        g.fillArc(370, 30, 150, 70, 0, 45);

        g.setColor(Color.black);

        g.drawOval(200, 30, 150, 70);

        g.drawRoundRect(10, 120, 150, 70, 10, 10);

        g.drawOval(390, 110, 100, 100);

        g.drawOval(370, 30, 150, 70);

        g.fillArc(370, 30, 150, 70, 0, 45);
        setBackground(Color.WHITE);

    }
}