package Models;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

public class Wave extends Super_draw {
    public Wave(int x, int y) {
        super(x, y,900,600);
    }

    @Override
    public void draw() {
        drawWave();
    }

    public void drawWave() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(3);
        gc.setStroke(Color.web("#00bfff"));
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





}
