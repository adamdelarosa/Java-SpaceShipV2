package sample.GamePlay;


import javafx.scene.image.Image;
import sample.Etc.SpriteSheet;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;


public class Bullet {

    private double x;
    private double y;

    BufferedImage image;

    public Bullet(double x, double y, SpaceShip spaceShip) {
        this.x = x;
        this.y = y;

        //SpriteSheet ss = new Image();
        //image = ss.grabImage(1, 2, 32, 32);

    }

    public void tick() {
        y -= 10;
    }

    public void draw(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
