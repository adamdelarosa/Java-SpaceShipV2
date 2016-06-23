package sample.Menu;

import sample.GamePlay.GameStart;

public class Menu {

    public Menu(){
        mainMenu();
    }

    public void mainMenu(){
        startGame();
    }

    public void startGame(){
        new GameStart();
    }
}
