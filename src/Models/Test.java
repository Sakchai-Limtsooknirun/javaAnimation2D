package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Test extends Super_draw {

    public Test(int x, int y) {
        super(x, y,300,300);
    }

    @Override
    public void draw() {
        //Test_draw();
    }

    public void Test_draw(){
        GraphicsContext gc = getGraphicsContext2D();
        //gc.strokeLine(200,140,300,140);
        gc.setFill(Color.web("#ff8000"));
        gc.strokeArc(100,45,300,250,0,180, ArcType.OPEN);
        gc.fillArc(100,45,300,250,0,180,ArcType.OPEN);
        //gc.strokeArc(105,200,53,50,0,180, ArcType.OPEN);
        //gc.strokeArc(90,385,30,30,180,90, ArcType.OPEN);

    }
}
