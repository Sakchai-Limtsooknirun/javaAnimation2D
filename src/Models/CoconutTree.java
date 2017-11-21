package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CoconutTree extends Super_draw {

    private GraphicsContext gc = getGraphicsContext2D();

    public CoconutTree(int x, int y) {
       super(x,y,500,900);
    }

    public void draw() {
        drawBody();
        drawCoconut();

    }

    public void drawBody() {
        gc.setFill(Color.rgb(206, 142, 43));
        gc.strokeRoundRect(0, 170, 80, 20,90,90);
        gc.fillRoundRect(0, 170, 80, 20,90,90);
        int y = 150;
        gc.setFill(Color.rgb(206, 168, 23));
        for (int i = 0; i < 13; i++) {
            gc.setLineWidth(2);
            gc.strokeRect(25, y, 30, 20);
            gc.fillRect(25, y, 30, 20);
            y = y - 10;
        }
    }

    public void drawCoconut() {
        gc.setFill(Color.rgb(29, 220, 7));
        gc.strokeLine(5, 10, 5, 16);
        gc.strokeLine(7, 10, 7, 16);
        gc.strokeLine(10, 10, 10, 16);
        gc.strokeLine(13, 10, 13, 16);
        gc.fillOval(15, 10, 30, 30);
        gc.strokeOval(15, 10, 30, 30);

        gc.setFill(Color.rgb(213, 220, 3));
        gc.fillOval(29, 10, 35, 30);
        gc.strokeOval(29, 10, 35, 30);

        gc.setFill(Color.rgb(108, 220, 0));
        gc.strokeLine(50, 10, 50, 16);
        gc.strokeLine(48, 10, 48, 16);
        gc.strokeLine(45, 10, 45, 16);
        gc.strokeLine(43, 10, 45, 16);
        gc.fillOval(55, 10, 35, 30);
        gc.strokeOval(55, 10, 35, 30);

        gc.setFill(Color.rgb(29, 220, 7));
        gc.strokeLine(70, 10, 70, 16);
        gc.strokeLine(72, 10, 72, 16);
        gc.strokeLine(75, 10, 75, 16);
        gc.strokeLine(77, 10, 77, 16);
        gc.strokeLine(80, 10, 80, 16);

        gc.fillOval(0, 10, 35, 30);
        gc.strokeOval(0, 10, 35, 30);

    }



}
