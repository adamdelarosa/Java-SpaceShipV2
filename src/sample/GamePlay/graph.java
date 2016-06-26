package sample.GamePlay;

import javafx.embed.swing.SwingNode;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import sample.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class graph implements ActionListener {

    int x;
    private Main main;
    public HBox boxForShip = new HBox();
    private static double W = 500, H = 800;
    private static String SPACESHIP = "sample/Asset/Image/lazerFire.png";
    private Image spaceShipImage;
    boolean running, goNorth, goSouth, goEast, goWest;
    public ArrayList<Bullet> bullets = new ArrayList<>();
    public ImageView nodeSpaceShip = new ImageView();
    public SwingNode swingNode = new SwingNode();

    SpaceShip spaceShipClass;

    Timer timer = new Timer(5, (ActionListener) this);

    double cx =100;

    public graph() {
        timer.start();
        addToScreen();
        System.out.println(spaceShipClass.getShipX());

    }


    public void actionPerformed(ActionEvent ev) {


        spaceShipImage = new Image(SPACESHIP);
        nodeSpaceShip.setImage(spaceShipImage);
        //boxForShip.relocate();

        if (x <= 100) {
            //shapeList.add(e1);
            x += 3;

        } else {


        }
    }
    public void addToScreen() {
        boxForShip.getChildren().addAll(nodeSpaceShip, swingNode);
        main.getRoot().getChildren().add(boxForShip);
    }
}