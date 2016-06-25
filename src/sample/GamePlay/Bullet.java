package sample.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Bullet extends JPanel implements ActionListener {

    int x;

    Timer timer = new Timer(5, (ActionListener) this);


    public Bullet() {
        move();
    }

    public void move() {
        timer.start();
    }

    public void actionPerformed(ActionEvent ev) {
        if (x <= 100) {
            x += 3;
            repaint();
        }
    }


    public void paintComponent(Graphics g) {
        g.fillRect(x, 20, 20, 20);
        g.setColor(Color.black);
    }


}







