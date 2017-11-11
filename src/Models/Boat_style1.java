package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Boat_style1 extends Super_Boat {
    private String name ;
    public Color ColorFlag = Color.web("#ffff00");
    public Boat_style1(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public void draw() {
        drawFlag();
        super.draw();
        super.drawWindow();
        drawFont();

    }

    private void drawFont(){
        GraphicsContext gc = getGraphicsContext2D();

        gc.setLineWidth(1);

        gc.setStroke(Color.BLACK);
        gc.strokeText(name, 140, 270);
    }

    private void drawFlag(){
        GraphicsContext gc = getGraphicsContext2D();

        double[] lstx = {140,230,140};
        double[] lsty = {215,215,95};

        double[] lstx1 = {50,137,137};
        double[] lsty1 = {215,215,95};

        gc.setStroke(Color.BLACK);
        gc.setFill(ColorFlag);
        gc.setLineWidth(3);

        gc.strokePolygon(lstx,lsty,3);
        gc.fillPolygon(lstx,lsty,3);

        gc.strokePolygon(lstx1,lsty1,3);
        gc.fillPolygon(lstx1,lsty1,3);

        gc.strokeLine(138,95,138, 260);


    }



}
