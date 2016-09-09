import java.awt.*;
import java.applet.*;

public class Opdracht403 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(40, 100, 5, 200);
        g.setColor (Color.red);
        g.fillRect(45, 100, 280, 50);
        g.setColor (Color.white);
        g.fillRect (45, 150, 280, 50);
        g.setColor (Color.blue);
        g.fillRect (45, 200, 280, 50);
        g.setColor (Color.black);
        g.drawRect(45, 100, 280, 150);

    }
}