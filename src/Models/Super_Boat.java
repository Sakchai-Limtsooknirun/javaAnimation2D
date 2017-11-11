package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Super_Boat extends Super_draw {
    private double speed = 1;
    public Color ColorBody = Color.web("#ff00bf");
    public Color ColorRoof = Color.BLACK;
    public Color ColorWindow = Color.web("#ffffff");

    public Super_Boat(int x, int y) {
        super(x, y, 232, 300);
    }

    @Override
    public void draw() {
        System.out.println(this.getBoundsInParent());
        drawBodyBoat();
        drawWindow();
    }

    public void drawBodyBoat() {
        GraphicsContext gc = getGraphicsContext2D();

        double[] lstx = {100, 80, 200, 180};
        double[] lsty = {280, 250, 250, 280};


        gc.setFill(ColorRoof);
        gc.setLineWidth(2);
        gc.fillRoundRect(100, 225, 60, 30, 10, 10);
        gc.strokeRoundRect(100, 225, 60, 30, 10, 10);

        gc.setFill(ColorBody);
        gc.fillPolygon(lstx, lsty, 4);
        gc.strokePolygon(lstx, lsty, 4);


    }

    public void drawWindow() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorWindow);
        gc.setLineWidth(2);

        gc.fillOval(110, 230, 15, 15);
        gc.strokeOval(110, 230, 15, 15);

        gc.fillOval(135, 230, 15, 15);
        gc.strokeOval(135, 230, 15, 15);


    }






}
