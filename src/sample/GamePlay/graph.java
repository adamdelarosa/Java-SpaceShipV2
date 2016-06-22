package sample.GamePlay;

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
    double xUpper;


    public graph(double X,double Y){

        xUpper = X;
        System.out.println("Fire: X: " + X + " Y: " + Y);
        setPosition();
    }

    public void setPosition(){
        for(int position=0;position<100;position++){

        xUpper++;
        weaponAnimated(xUpper,xUpper);

        }
    }

    public void weaponAnimated(double xFire,double yFire) {
        weaponChoiseImage = new Image(WEAPONOFCHOISE);
        boxForWeapon.relocate(xFire,yFire);
        nodeFirePower.setImage(weaponChoiseImage);
    }
}
