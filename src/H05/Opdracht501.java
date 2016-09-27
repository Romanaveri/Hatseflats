package H05;

/**
 * Created by roman on 27-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class Opdracht501 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int lengte;

    public void init () {

        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        lengte = 100;
    }

    public void paint (Graphics g){
        g.drawLine(100,50,300,50);
        g.drawRect(100,100,breedte,lengte);
        g.drawRoundRect(100,250,breedte,lengte,30,30);
        g.setColor(opvulkleur);
        g.fillRect(400,100,breedte,lengte);
        g.fillOval(400,250,breedte,lengte);
        g.fillArc(700,100,breedte,lengte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(400,100,breedte,lengte);
        g.drawOval(699,100,breedte,lengte);
        g.drawArc(750,250,100,100,0,360);
        g.drawString("Lijn",160,70);
        g.drawString("Rechthoek",140,220);
        g.drawString("Gevulde rechthoek met ovaal",410,220);
        g.drawString("Taatpunt met ovaal eromheen",710,220);
        g.drawString("Afgeronde rechthoek",120,370);
        g.drawString("Gevulde ovaal",430,370);
        g.drawString("Cirkel",740,370);
    }
}