package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TheSea extends Background{

    private Color ColorWater ;

    public TheSea(int x, int y) {
        super(x, y);
        this.ColorWater = Color.web("#B6D7FA") ;

    }

    @Override
    public void draw() {
        drawTheSea();
    }

    public void drawTheSea(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorWater);
        gc.fillRect(0,200,900,200);
    }
}
