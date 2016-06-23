package sample.GamePlay;

import javafx.application.Platform;

import javax.swing.*;
import java.awt.*;

public class Bullet extends JPanel {

    int x;

    public Bullet(){
        move();
    }

    public void move() {
        Platform.runLater(()-> {
            x+=16;
            System.out.print(x+",");
            Bullet bul = new Bullet();
            bul.repaint();
        });
    }

    public void paintComponent(Graphics g){
            g.fillRect(x,23,x,x);
            g.setColor(Color.black);
    }
}