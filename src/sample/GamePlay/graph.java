package sample.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class graph extends JPanel implements ActionListener {

    int x;

    Timer timer = new Timer(5, (ActionListener) this);


    ArrayList<Shot> shot = new ArrayList<Shot>();

    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    Rectangle e1 = new Rectangle(20, 75, 35, 35);


    public graph() {
        move();
    }

    public void move() {
        timer.start();
    }

    public void actionPerformed(ActionEvent ev) {
        if (x <= 100) {
            //shapeList.add(e1);
            x += 3;
            repaint();

        } else {


        }
    }


    public void paintComponent(Graphics g) {
        g.fillRect(x, 20, 10, 10);
        g.setColor(Color.black);
        g.clearRect(0,0,getWidth(),getHeight());
    }

    public void terminateBullte(){

    }
}