package Models;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Fish extends Animals implements Animation{

    private Color finColor;
    private Color tailColor;

    public Fish(int x, int y, Color bodyFish,Color tailColor ,Color finColor) {
        super(x, y,bodyFish,Color.WHITE);
        this.finColor = finColor;
        this.tailColor = tailColor;
    }

    @Override
    public void draw() {
        drawBody();
        drawTail();
    }

    @Override
    public void drawBody() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorBody);
        gc.fillRoundRect(80, 160, 100, 40, 20, 20);
        gc.setFill(finColor);
        double[] CoordinateXfin = {110, 130, 130};
        double[] CoordinateYfin = {180, 170, 190};
        gc.setLineWidth(1);
        gc.fillPolygon(CoordinateXfin, CoordinateYfin, 3);
        gc.setFill(colorEye);
        gc.fillOval(90, 170, 10, 10);
        gc.strokeOval(90, 170, 10, 10);
    }



    public void drawTail(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(tailColor);
        double[] CoordinateXHead = {160, 210, 210};
        double[] CoordinateYHead = {180, 160, 200};
        gc.fillPolygon(CoordinateXHead, CoordinateYHead, 3);

    }

    @Override
    public void StartAnimation() {
        TranslateTransition ttx = new TranslateTransition(
                Duration.millis(3000), this);
        ttx.setFromX(this.getTranslateX());
        ttx.setToX(this.getTranslateX() + (-1500));
        ttx.setCycleCount(Timeline.INDEFINITE);
        ttx.play();
    }
}
