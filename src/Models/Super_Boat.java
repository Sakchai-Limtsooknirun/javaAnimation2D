package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Super_Boat extends Super_draw {
    private double speed = 1;
    public Color ColorBody = Color.web("#ff00bf");
    public Color ColorRoof = Color.BLACK;
    public Color ColorWindow = Color.web("#ffffff");

    public Super_Boat(int x, int y) {
        super(x, y, 232, 300);
    }

    @Override
    public void draw() {
        drawBodyBoat();
        drawWindow();
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

    public void drawWindow() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorWindow);
        gc.setLineWidth(2);

        gc.fillOval(110, 230, 15, 15);
        gc.strokeOval(110, 230, 15, 15);

        gc.fillOval(135, 230, 15, 15);
        gc.strokeOval(135, 230, 15, 15);


    }
    public void setColor(Color color) {
        this.ColorBody = color;
    }
    public boolean CheckLimit() {
        System.out.println(getTranslateX() + "  " + getTranslateY() + "  ");
        if (true) {
            return true;
        }
        return false;
    }


    public void goRight() {
        if (CheckLimit()) {
            setTranslateX(getTranslateX() + speed);
        } else setTranslateX(getTranslateX() - 1);
        System.out.println("Right OK");

    }

    public void goLeft() {

        if (CheckLimit()) {
            setTranslateX(getTranslateX() - speed);
        } else {
            setTranslateX(getTranslateX() + 1);
            System.out.println("Left OK");

        }
    }

    public void goUp() {
        if (CheckLimit())
            setTranslateY(getTranslateY() - speed);
        else {
            setTranslateY(getTranslateY() + 1);
            System.out.println("Up  OK");
        }
    }

    public void goDown() {
        if (CheckLimit())
            setTranslateY(getTranslateY() + speed);
        else {
            setTranslateY(getTranslateY() - 1);
            System.out.println("Down OK");
        }
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






}
