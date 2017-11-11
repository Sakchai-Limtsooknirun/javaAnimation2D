package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Boat_style2 extends Super_Boat {

    public Boat_style2(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawWindow();
        this.drawLadder();
        this.drawMast();
    }

    @Override
    public void drawWindow() {
        GraphicsContext gc = getGraphicsContext2D();
        Color c = Color.WHITE;
        gc.setFill(c);
        gc.setLineWidth(2);
        gc.fillRoundRect(110,230,40,15,20,20);
        gc.strokeRoundRect(110,230,40,15,20,20);
        gc.strokeLine(130,225,130,250);

    }
    public void drawLadder(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.strokeLine(150,250,150,280);
        gc.strokeLine(170,250,170,280);
        gc.strokeLine(150,260,170,260);
        gc.strokeLine(150,270,170,270);

    }
    public void drawMast(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.BLACK);

        gc.strokeLine(95,200,95,250);
        gc.strokeLine(170,200,170,250);
        gc.strokeLine(190,200,75,200);
        gc.strokeLine(190,205,75,205);
        gc.strokeLine(75,200,75,205);
        gc.strokeLine(190,200,190,205);
        gc.setStroke(Color.RED);
        gc.setLineWidth(6);
        gc.strokeLine(190,202,75,202);
    }
}
