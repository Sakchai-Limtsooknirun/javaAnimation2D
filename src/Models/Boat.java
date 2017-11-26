package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Boat extends DrawsGraphic {
    private double speed = 1;
    private Color ColorBody ;
    private Color ColorRoof = Color.BLACK;

    public Boat(int x, int y,Color ColorBody) {
        super(x, y, 232, 300);
        this.ColorBody = ColorBody ;
    }

    @Override
    public void draw() {
        drawBodyBoat();

    }

    public void drawBodyBoat() {
        GraphicsContext gc = getGraphicsContext2D();
        double[] lstx = {100, 80, 200, 180};
        double[] lsty = {280, 250, 250, 280};
        gc.setFill(ColorRoof);
        gc.setLineWidth(2);
        gc.fillRoundRect(100, 225, 60, 30, 10, 10);
        gc.strokeRoundRect(100, 225, 60, 30, 10, 10);
        gc.setFill(ColorBody);
        gc.fillPolygon(lstx, lsty, 4);
        gc.strokePolygon(lstx, lsty, 4);
    }

    public void goRight() {
        setTranslateX(getTranslateX() + speed);

    }

    public void goLeft() {
        setTranslateX(getTranslateX() - speed);
    }

    public void goUp() {
        setTranslateY(getTranslateY() - speed);
    }

    public void goDown() {
        setTranslateY(getTranslateY() + speed);
    }

    public void speedUp() {
        speed += 0.1;
    }

    public void speedDown() {
        if (speed > 0) speed -= 0.1;
        else speed = 0;
        System.out.println(speed);
    }

    public boolean isClick(double x, double y) {
        if (x > getTranslateX() && x < getTranslateX() + getWidth() && y > getTranslateY() && y < getTranslateY() + getWidth())
            return true;
        return false;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
