package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Background extends DrawsGraphic {
    public Color ColorBG ;

    public Background(int x, int y) {
        super(x, y,900,600);
        ColorBG = Color.BLACK ;
    }

    @Override
    public void draw() {
        drawBackground();

    }
    private void drawBackground(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorBG);
        gc.fillRect(0,0,900,600);

    }


}
