package sample.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bullet extends JPanel implements ActionListener {

    int x;
    SpaceShip spaceShipClass;


    Timer timer=new Timer(5, (ActionListener) this);

    public Bullet(){
        move();
    }

    public void move() {
            timer.start();
    }

    public void actionPerformed(ActionEvent ev) {
        if (x!=1000) {
            x++;
            repaint();// this will call at every 1 second
        }else{

        }
    }


    public void paintComponent(Graphics g){
            g.fillRect(x,20,10,10);
            g.setColor(Color.black);
    }
}