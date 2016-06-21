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
    public HBox boxForWeapon = new HBox();
    private static String WEAPONOFCHOISE = "sample/Asset/Image/lazerFire.png";
    private javafx.scene.image.Image weaponChoiseImage;
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
        weaponChoiseImage = new Image(WEAPONOFCHOISE);
        nodeFirePower.setImage(weaponChoiseImage);
    }


    public void addToScreen(){
        boxForWeapon.getChildren().addAll(nodeFirePower);
        boxForWeapon.relocate(12,12);
        main.getRoot().getChildren().add(boxForWeapon);
    }

}
