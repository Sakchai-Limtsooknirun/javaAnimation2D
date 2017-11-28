package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Background extends DrawsGraphic {
    public Color colorBG;

    public Background(int x, int y,Color colorBG) {
        super(x, y,900,600);
        this.colorBG = colorBG ;
    }

    @Override
    public void draw() {
        drawBackground();

    }
    private void drawBackground(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorBG);
        gc.fillRect(0,0,900,600);

    }


}
