package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Boat extends DrawsGraphic {
    private double speed = 1;
    private Color colorBody;
    private Color colorRoof ;
    private Color colorWindow ;

    public Boat(int x, int y, Color colorBody , Color colorRoof ,Color colorWindow) {
        super(x, y, 232, 350);
        this.colorBody = colorBody;
        this.colorRoof =colorRoof ;
        this.colorWindow = colorWindow ;
    }

    @Override
    public void draw() {
        drawBodyBoat();

    }

    protected Color getColorWindow() {
        return colorWindow;
    }

    protected Color getColorRoof() {
        return colorRoof;
    }

    protected Color getColorBody() {
        return colorBody;
    }

    protected void drawBodyBoat() {
        GraphicsContext gc = getGraphicsContext2D();
        double[] x = {100, 80, 200, 180};
        double[] y = {280, 250, 250, 280};

        gc.setFill(colorBody);
        gc.fillPolygon(x, y, 4);
        gc.strokePolygon(x, y, 4);
        double[] xLine = {90, 93, 190, 192};
        double[] yLine = {260, 265, 265, 260};
        gc.setFill(Color.WHITE);
        gc.strokePolygon(xLine, yLine, 4);
        gc.fillPolygon(xLine, yLine, 4);
    }
    protected void drawWindow(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorWindow);
        gc.setLineWidth(2);
        gc.fillOval(122, 230, 17, 17);
    }
    protected void drawRoof(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorRoof);
        gc.setLineWidth(2);
        gc.fillRoundRect(100, 225, 60, 30, 10, 10);
        gc.strokeRoundRect(100, 225, 60, 30, 10, 10);
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
