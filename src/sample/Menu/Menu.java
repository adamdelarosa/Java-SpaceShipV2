package sample.Menu;

import sample.GamePlay.GameStart;
import java.awt.*;

public class Menu {

    public void render(Graphics g){
        Font fnt0 = new Font("arial", Font.BOLD, 50);
        g.setFont(fnt0);
        g.setColor(Color.white);
        g.drawString("TeamShip",500,500);
    }

    public Menu(){
        System.out.println("Menu started.");
        mainMenu();
    }

    public void mainMenu(){
        //render();

        //startGame();
    }

    public void startGame(){
        new GameStart();
    }
}
