package sample.GamePlay;

public class GameStart {

    private static double W = 500, H = 800;


    public GameStart() {

        //BackGroundClass:
        BackGroundSlide backGroundSlideClass = new BackGroundSlide();
        backGroundSlideClass.testArea();

        //SpaceShipClass:
        SpaceShip spaceShipClass = new SpaceShip();
        spaceShipClass.shipAnimated();
        spaceShipClass.shipMovment();
        spaceShipClass.addToScreen();
        spaceShipClass.setSpaceShipPosition(W / 2, H / 2);

        //SoundFXClass:
        SoundFX soundFXClass = new SoundFX();
        //soundFXClass.whilePlayGameMusic();

    }
}
