package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class CrabStyle2 extends CrabStyle1 {
    public CrabStyle2(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        super.drawEye();
        drawArm();
        super.drawLeg();
        super.drawCrab();

    }

    @Override
    public void drawArm() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.ORANGE;
        gc.setFill(c);
        gc.setLineWidth(2);


        gc.strokeArc(90, 385, 30, 30, 180, 90, ArcType.OPEN);
        gc.strokeArc(140, 385, 30, 30, 270, 90, ArcType.OPEN);


        gc.fillArc(78, 375, 30, 30, 140, 300, ArcType.ROUND);
        gc.fillArc(165, 375, 30, 30, 100, 300, ArcType.ROUND);
        gc.strokeArc(78, 375, 30, 30, 140, 300, ArcType.ROUND);
        gc.strokeArc(165, 375, 30, 30, 100, 300, ArcType.ROUND);

    }
}
