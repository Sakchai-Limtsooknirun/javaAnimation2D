package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SeaBG extends Background{

    private Color colorWater;

    public SeaBG(int x, int y,Color colorSea) {
        super(x, y,Color.BLACK);
        this.colorWater = colorSea ;

    }

    @Override
    public void draw() {
        drawTheSea();
    }

    public void drawTheSea(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorWater);
        gc.fillRect(0,200,900,200);
    }
}
