package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.GamePlay.GameStart;
import sample.Menu.Menu;

public class Main extends Application {

    public double windowHeight = 500;
    public double windowWeight = 800;
    public Scene scene = new Scene(root,windowHeight,windowWeight);
    public Stage globalPrimartStage;
    public static Group root = new Group();


    public static Group getRoot(){
        return root;
    }

    public Scene getScene (){
        return scene;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        scene.setFill(Color.BLACK);
        primaryStage.sizeToScene();
        primaryStage.setScene(scene);
        primaryStage.show();
        new Menu();
        globalPrimartStage = primaryStage;
    }


    //To be menu
    public void MainStarter() {
        new GameStart();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
