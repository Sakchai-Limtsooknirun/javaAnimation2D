package Models;

import javafx.scene.paint.Color;

public abstract class Animals extends DrawsGraphic {
    public Color colorBody;
    public Color colorEye;

    public Animals(int x, int y, Color colorBody, Color colorEye) {
        super(x, y, 900, 600);
        this.colorBody = colorBody;
        this.colorEye = colorEye;
    }

    @Override
    public void draw() {


    }

    abstract public void drawBody();

}
