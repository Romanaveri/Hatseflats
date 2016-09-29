package H08;

/**
 * Created by roman on 27-9-2016.
 */


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht8 extends Applet {
    Button knop;
    Button knop2;
    TextField tekstvak;
    String s;

    public void init() {
        knop2 = new Button("RESET");

        knop2.addActionListener(new KnopReset());
        add(knop2);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        knop = new Button("OK");
     knop.addActionListener(new KnopOke());
        add(knop);

    }

    public void paint(Graphics g) {
      g.drawString(s, 50, 100);
    }

    class KnopReset implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
tekstvak.setText(" ");
            repaint();
        }
    }

    class KnopOke implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           s=tekstvak.getText();
            repaint();
        }
    }

}