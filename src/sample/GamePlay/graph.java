package sample.GamePlay;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import sample.Main;

public class graph {

    Main main;
    public HBox boxForWeapon = new HBox();
    private static String WEAPONOFCHOISE = "sample/Asset/Image/lazerFire.png";
    private javafx.scene.image.Image weaponChoiseImage;
    ImageView nodeFirePower = new ImageView();

    public graph(double X,double Y){
        addToScreenWeaponBox();
        weaponAnimated(X, Y);

        System.out.println("Fire: X: " + X + " Y: " + Y);
    }

    public void weaponAnimated(double xFire,double yFire) {
        weaponChoiseImage = new Image(WEAPONOFCHOISE);
        nodeFirePower.setImage(weaponChoiseImage);
        boxForWeapon.relocate(xFire,yFire);
        while (10>0){
            System.out.println("10");
        }
    }

    public void addToScreenWeaponBox(){
        boxForWeapon.getChildren().addAll(nodeFirePower);
        main.getRoot().getChildren().add(boxForWeapon);
    }
}
