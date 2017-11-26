package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TheSea extends DrawsGraphic{

    private Color ColorWater ;

    public TheSea(int x, int y,Color ColorWater) {
        super(x, y, 900,600);
        this.ColorWater = ColorWater ;

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
