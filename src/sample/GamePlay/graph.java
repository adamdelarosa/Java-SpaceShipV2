package sample.GamePlay;

import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import sample.Main;
import java.awt.*;

public class graph {

    Main main;
    public HBox boxForWeapon = new HBox();
    private static String WEAPONOFCHOISE = "sample/Asset/Image/lazerFire.png";
    private javafx.scene.image.Image weaponChoiseImage;
    ImageView nodeFirePower = new ImageView();

    public graph(){
        addToScreenWeaponBox();
        weaponAnimated();
    }

    public void painter(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(25,25,25,25);
    }

    public void weaponAnimated() {
        weaponChoiseImage = new Image(WEAPONOFCHOISE);
        nodeFirePower.setImage(weaponChoiseImage);
        boxForWeapon.relocate(70,60);
    }

    public void addToScreenWeaponBox(){
        boxForWeapon.getChildren().addAll(nodeFirePower);
        main.getRoot().getChildren().add(boxForWeapon);
    }
}
