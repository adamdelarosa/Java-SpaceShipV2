package sample.GamePlay;

import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.animation.AnimationTimer;
import sample.Main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BackGroundSlide extends JPanel {

    public Main main,sceneMain,globalPrimartStageMain;

    private static final int STAR_COUNT = 2000;
    private final Rectangle[] nodes = new Rectangle[STAR_COUNT];
    private final double[] angles = new double[STAR_COUNT];
    private final long[] start = new long[STAR_COUNT];
    private final Random random = new Random();

    public BackGroundSlide() {
        testArea();
        repaint();

    }

    public void testArea() {
        for (int i = 0; i < STAR_COUNT; i++) {
            nodes[i] = new Rectangle(1,1, Color.WHITE);
            angles[i] = 2.0 * Math.PI * random.nextDouble();
            start[i] = random.nextInt(2000000000);
        }

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                final double height = 0; //Stars start here
                final double radius = 1000; //Start end here
                for (int i = 0; i < STAR_COUNT; i++) {
                    final Node node = nodes[i];
                    final long t = (now - start[i]) % 2000000000;
                    final double d = t * radius / 2000000000.0;
                    node.setTranslateY(Math.sin(-400) * d + height);
                }
            }
        }.start();
        HBox backgroundBox = new HBox();
        backgroundBox.getChildren().addAll(nodes);
        main.getRoot().getChildren().add(backgroundBox);
    }

    public void paintComponent(Graphics g) {
        g.fillRect(20, 20, 20, 20);
        g.setColor(java.awt.Color.yellow);
    }
}

