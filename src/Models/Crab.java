package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Crab extends Super_draw {
    public Crab(int x, int y) {
        super(x, y, 900, 600);
    }

    @Override
    public void draw() {
        drawEye();
        drawArm();
        drawLeg();
        drawCrab();
    }


    private void drawCrab() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.ORANGE;
        gc.setFill(c);
        gc.setLineWidth(2);

        //ตัว
        gc.fillOval(100, 400, 60, 35);
        gc.strokeOval(100, 400, 60, 35);


    }

    private void drawLeg() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(2);

        //ขา
        gc.strokeArc(100, 410, 63, 60, 0, 180, ArcType.OPEN);
        gc.strokeArc(105, 415, 53, 50, 0, 180, ArcType.OPEN);
    }

    private void drawEye() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);

        //เส้นตา
        gc.strokeLine(125, 385, 125, 405);
        gc.strokeLine(135, 385, 135, 405);

        //ตา
        gc.fillOval(122, 380, 5, 5);
        gc.fillOval(133, 380, 5, 5);
    }

    private void drawArm() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.ORANGE;
        gc.setFill(c);
        gc.setLineWidth(2);

        //แขน
        gc.strokeArc(90, 385, 30, 30, 180, 90, ArcType.OPEN);
        gc.strokeArc(140, 385, 30, 30, 270, 90, ArcType.OPEN);

        //กล้ามปู
        gc.fillArc(73, 375, 30, 30, 140, 300, ArcType.ROUND);
        gc.fillArc(160, 375, 30, 30, 100, 300, ArcType.ROUND);
        gc.strokeArc(73, 375, 30, 30, 140, 300, ArcType.ROUND);
        gc.strokeArc(160, 375, 30, 30, 100, 300, ArcType.ROUND);

    }

}
