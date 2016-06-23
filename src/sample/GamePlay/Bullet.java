package sample.GamePlay;

import javax.swing.*;
import java.awt.*;

public class Bullet extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        g.setColor(Color.CYAN);
        g.fillRect(25,25,100,100);
        }


    public void paint(Graphics g){
        for(int i=0; i<100; i++) {
            g.fillRect(12, 12, 12, 12);
        }
    }
}