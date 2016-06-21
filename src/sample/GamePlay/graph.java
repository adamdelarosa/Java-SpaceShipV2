package sample.GamePlay;

import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import sample.Main;

import java.awt.*;

/**
 * Created by ROSA on 21/06/2016.
 */
public class graph {

    Main main;
    public HBox boxForShip = new HBox();
    private static String SPACESHIP = "sample/Asset/Image/lazerFire.png";
    private javafx.scene.image.Image spaceShipImage;
    ImageView nodeFirePower = new ImageView();

    public graph(){
        addToScreen();
        shipAnimated();
    }

    public void painter(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(25,25,25,25);
    }

    public void shipAnimated() {
        spaceShipImage = new Image(SPACESHIP);
        nodeFirePower.setImage(spaceShipImage);
    }


    public void addToScreen(){
        boxForShip.getChildren().addAll(nodeFirePower);
        main.getRoot().getChildren().add(boxForShip);
    }

}
