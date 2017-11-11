package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Background extends Super_draw {

    public Background(int x, int y) {
        super(x, y,900,600);
    }

    @Override
    public void draw() {
        drawBackground();

    }
    private void drawBackground(){
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.web("#B6D7FA");
        gc.setFill(c);
        gc.fillRect(0,200,900,200);
        gc.setFill(Color.web("#faf2b3"));
        gc.fillRect(0,0,900,200);
        gc.setFill(Color.web("#c2b280"));
        gc.fillRect(0,400,900,200);


    }


}
