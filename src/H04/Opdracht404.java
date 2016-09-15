package H04;

import java.awt.*;
import java.applet.*;
/**
 * Created by roman on 15-9-2016.
 */
public class Opdracht404 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(60, 185, 35, 95);

        g.setColor(Color.black);
        g.drawString("Valerie", 55, 300 );

        g.setColor(Color.red);
        g.fillRect(100, 80, 35, 200);

        g.setColor(Color.black);
        g.drawString ("Jeroen", 100, 300);

        g.setColor(Color.yellow);
        g.fillRect(140, 110, 35, 170);

        g.setColor(Color.black);
        g.drawString("Hans", 145, 300);

        g.drawString("0", 40, 280);
        g.drawString("20", 35, 240);
        g.drawString("40", 35, 200);
        g.drawString("60", 35, 160);
        g.drawString("80", 35, 120);
        g.drawString("100", 35, 80);




    }
}