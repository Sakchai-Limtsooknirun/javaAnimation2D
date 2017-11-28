package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GroundBG extends Background {

    private Color colorGround;

    public GroundBG(int x, int y,Color colorGround) {
        super(x, y,Color.BLACK);
        this.colorGround = colorGround;
    }

    @Override
    public void draw() {
        drawGround();
    }
    public void drawGround(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorGround);
        gc.fillRect(0,400,900,200);
    }
}
