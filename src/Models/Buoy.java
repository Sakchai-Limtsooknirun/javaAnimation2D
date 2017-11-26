package Models;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

public class Buoy extends DrawsGraphic implements Animation{

    public Buoy(int x, int y) {
        super(x, y, 300, 300);
    }
    @Override
    public void draw() {
        drawWave();
        drawBuoy();
        drawFlag();
    }

    public void drawBuoy() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.YELLOW;
        gc.setLineWidth(3);
        gc.setFill(c);
        gc.setStroke(Color.BLACK);
        gc.strokeArc(208, 235, 63, 40, 0, 180, ArcType.OPEN);
        gc.fillArc(208, 235, 63, 40, 0, 180, ArcType.OPEN);

    }

    public void drawFlag() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.RED;
        double[] lstx = {170, 234, 234};
        double[] lsty = {170, 170, 130};
        gc.setStroke(Color.BLACK);
        gc.setFill(c);
        gc.setLineWidth(4);
        gc.strokePolygon(lstx, lsty, 3);
        gc.fillPolygon(lstx, lsty, 3);
        gc.strokeLine(235, 120, 235, 235);
    }

    public void drawWave() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(3);
        gc.setStroke(Color.web("#00bfff"));
        gc.strokeArc(210, 235, 55, 35, 180, 180, ArcType.OPEN);
        gc.strokeArc(213, 232, 50, 30, 180, 180, ArcType.OPEN);
        gc.strokeArc(216, 229, 47, 27, 180, 180, ArcType.OPEN);
    }


    @Override
    public void StartAnimation() {
        RotateTransition rt = new RotateTransition(
                Duration.millis(3000), this);
        rt.setByAngle(4);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.setAutoReverse(true);
        rt.play();
    }
}
