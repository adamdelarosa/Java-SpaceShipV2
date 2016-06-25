package sample.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Bullet extends JPanel implements ActionListener {

    int x;

    Timer timer = new Timer(5, (ActionListener) this);

    ArrayList<Shot> shot = new ArrayList<Shot>();

    Rectangle e1 = new Rectangle(20, 75, 35, 35);


    public Bullet() {
        move();
    }

    public void move() {
        timer.start();
    }

    public void actionPerformed(ActionEvent ev) {
        for (int i = 0; i < shot.size(); i++) {
            System.out.println("pwq");
        }



        if (x <= 100) {
            //shapeList.add(e1);
            x += 3;
            repaint();
        }
    }


    public void paintComponent(Graphics g) {
        g.fillRect(x, 20, 10, 10);
        g.setColor(Color.black);
    }

    public void terminateBullte(){

    }
}







