package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class TheSun extends Super_draw {

    public TheSun(int x, int y) {
        super(x, y,900,300);
    }

    @Override
    public void draw() {
        DrawSun();
    }

    public void DrawSun() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.web("#ff8000"));
        //gc.strokeArc(100, 45, 300, 250, 0, 180, ArcType.OPEN);
        gc.fillArc(100, 45, 300, 250, 0, 180, ArcType.OPEN);
        //gc.strokeArc(170,120,150,100,0,180,ArcType.OPEN);
        gc.setFill(Color.web("#ffbf00"));
        gc.fillArc(170,120,150,100,0,180,ArcType.OPEN);
    }

}
