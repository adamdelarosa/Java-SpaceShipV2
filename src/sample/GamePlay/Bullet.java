package sample.GamePlay;


import javafx.scene.image.Image;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

public class Bullet {

    private double x;
    private double y;

    private Image firePowerImage;

    SpaceShip ss;


    private static String FirePower = "sample/Asset/Image/lazerFire.png";


    BufferedImage image;
//    public Bullet(double x, double y, SpaceShip spaceShip) {

    public Bullet(double x, double y) {
        this.x = x;
        this.y = y;
        shipAnimated();
    }

    public void shipAnimated() {
        firePowerImage = new Image(FirePower);
        //SpaceShip ss = new SpaceShip();
        //ss.nodeFirePower.setImage(firePowerImage);
        //ss.
    }

    public void tick() {
        y -= 10;
    }

    public void draw(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
