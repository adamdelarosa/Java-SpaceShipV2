package sample.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Bullet extends JPanel implements ActionListener {

    int x;
    SpaceShip spaceShipClass;


    Timer timer=new Timer(5, (ActionListener) this);

    ArrayList<Shape> shapeList = new ArrayList<Shape>();
    Rectangle e1 = new Rectangle(20,75,35,35);



    public Bullet(){
        move();
    }

    public void move() {
            timer.start();
    }

    public void actionPerformed(ActionEvent ev) {
        if (x!=1000) {
            int d =1;
            shapeList.add(e1);

            //x++;
            repaint();// this will call at every 1 second
        }else{

        }
    }


    public void paintComponent(Graphics g){
            e1.add(g.getClipBounds());
            g.fillRect(x,20,10,10);
            g.setColor(Color.black);
    }
}