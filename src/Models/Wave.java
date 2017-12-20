package Models;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

public class Wave extends DrawsGraphic implements Animation{

    private Color colorStrokeWave ;
    private int waveWidth ;
    public Wave(int x, int y,Color colorStrokeWave , int waveWidth) {
        super(x, y,900,600);
        this.colorStrokeWave = colorStrokeWave ;
        this.waveWidth = waveWidth ;
    }

    @Override
    public void draw() {
        drawWave();
    }

    protected void drawWave() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(waveWidth);
        gc.setStroke(colorStrokeWave);
        int count = 0;
        for (int i = 0; i < 800; i += 60) {
            if (count % 2 == 0) {
                gc.strokeArc(i, 60, 60, 20, 0, 180, ArcType.OPEN);
                count++;
            } else {
                gc.strokeArc(i, 60, 60, 20, 180, 180, ArcType.OPEN);
                count++;
            }
        }
    }


    @Override
    public void StartAnimation() {
        TranslateTransition tty = new TranslateTransition(
                Duration.millis(9000), this);
        tty.setFromY(this.getTranslateY());
        tty.setToY(this.getTranslateY() + 200);
        tty.setCycleCount(Timeline.INDEFINITE);
        tty.setAutoReverse(true);
        tty.play();

        FadeTransition ft = new FadeTransition(
                Duration.millis(3000), this
        );
        ft.setFromValue(1.0);
        ft.setToValue(0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

    }
}
