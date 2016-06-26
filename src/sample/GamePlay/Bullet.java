package sample.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bullet extends JPanel implements ActionListener {

    private int x = 400;
    private Timer timer = new Timer(5, (ActionListener) this);


    public Bullet() {
        timer.start();
    }


    public void actionPerformed(ActionEvent ev) {
        if (x >= 0) {
            x -= 5;
            repaint();
            System.out.println(x);
        }else {
            System.out.println("Done");
            timer.stop();
        }
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(20, x, 20, 20);
    }
    public int getX(){
        return x;
    }
}