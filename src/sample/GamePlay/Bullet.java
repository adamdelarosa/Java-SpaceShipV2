package sample.GamePlay;

import javafx.application.Platform;

import javax.swing.*;
import java.awt.*;

public class Bullet extends JPanel {

    int x=60;

    public Bullet(){
        move();
    }

    public void paintComponent(Graphics g){
        g.fillRect(x,23,23,23);
        g.setColor(Color.black);
    }
    public void move() {
        Platform.runLater(()-> x++);
    }

}