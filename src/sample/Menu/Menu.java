package sample.Menu;

import sample.GamePlay.GameStart;

public class Menu {

    public Menu(){
        System.out.println("Menu started.");
        mainMenu();
    }

    public void mainMenu(){
        //Option one:
        startGame();
    }

    public void startGame(){
        new GameStart();
    }

}
