package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Animal extends DrawsGraphic {
    private Color colorBody;
    private Color colorEye;

    public Animal(int x, int y, Color colorBody, Color colorEye) {
        super(x, y, 900, 600);
        this.colorBody = colorBody;
        this.colorEye = colorEye;
    }


    abstract public void drawBody();

    protected void drawEye(int x , int y) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorEye);
        gc.fillOval(x, y, 10, 10);

    }

    protected Color getColorBody() {
        return colorBody;
    }

    protected Color getColorEye() {
        return colorEye;
    }
}
