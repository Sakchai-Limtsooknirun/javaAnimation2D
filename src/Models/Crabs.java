package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Crabs extends Animal {

    private Color colorArm;
    private Color colorLeg;

    public Crabs(int x, int y,Color colorBody , Color colorEye) {
        super(x, y,colorBody,colorEye);
        colorArm = Color.ORANGE;
        colorLeg = Color.BLACK;
    }

    @Override
    public void draw() {
        drawArm();
        drawLeg();
        EyePart();
        drawEye(118,380);
        drawEye(133,380);
        drawBody();

    }


    @Override
    public void drawBody() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(getColorBody());   //attributes ของ subclass
        gc.setLineWidth(2);
        gc.fillOval(100, 400, 60, 35);
        gc.strokeOval(100, 400, 60, 35);
    }
    protected void EyePart(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.BLACK);    //attributes ของ subclass
        gc.setLineWidth(2);
        gc.strokeLine(125, 385, 125, 405);
        gc.strokeLine(135, 385, 135, 405);
    }

    protected void drawLeg() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(2);
        gc.setStroke(colorLeg);
        gc.strokeArc(100, 410, 63, 60, 0, 180, ArcType.OPEN);
        gc.strokeArc(105, 415, 53, 50, 0, 180, ArcType.OPEN);
        gc.strokeArc(110, 420, 43, 40, 0, 180, ArcType.OPEN);

    }


    protected void drawArm() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorArm);
        gc.setLineWidth(2);
        gc.fillArc(73, 375, 30, 50, 140, 300, ArcType.ROUND);
        gc.fillArc(160, 375, 30, 50, 100, 300, ArcType.ROUND);
        gc.strokeArc(73, 375, 30, 50, 140, 300, ArcType.ROUND);
        gc.strokeArc(159, 375, 30, 50, 100, 300, ArcType.ROUND);

    }

}
