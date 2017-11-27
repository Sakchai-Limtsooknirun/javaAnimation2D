package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GroundBG extends Background {

    private Color ColorGround;

    public GroundBG(int x, int y) {
        super(x, y);
        ColorGround = Color.web("#c2b280");
    }

    @Override
    public void draw() {
        drawGround();
    }
    public void drawGround(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorGround);
        gc.fillRect(0,400,900,200);
    }
}
