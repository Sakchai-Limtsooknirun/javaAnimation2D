package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CoconutTree extends DrawsGraphic {

    private int treeHeight;
    private int yHeight = 150;

    public CoconutTree(int x, int y, int treeHeight) {
        super(x, y, 500, 900);

        if (treeHeight > 16) {
            treeHeight = 16;
            this.treeHeight = treeHeight;
        } else if (treeHeight < 7) {
            treeHeight = 7;
            this.treeHeight = treeHeight;
        } else this.treeHeight = treeHeight;
    }

    public void draw() {
        drawBody();
        drawCoconut();

    }

    protected void drawBody() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.rgb(206, 142, 43));
        gc.strokeRoundRect(0, 170, 80, 20, 90, 90);
        gc.fillRoundRect(0, 170, 80, 20, 90, 90);
        gc.setFill(Color.rgb(206, 168, 23));
        for (int i = 0; i < treeHeight; i++) {
            gc.setLineWidth(2);
            gc.strokeRect(25, yHeight, 30, 20);
            gc.fillRect(25, yHeight, 30, 20);
            yHeight = yHeight - 10;
        }
    }

    protected void drawCoconut() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.rgb(29, 220, 7));

        gc.fillOval(15, 10 + yHeight, 30, 30);
        gc.strokeOval(15, 10 + yHeight, 30, 30);

        gc.setFill(Color.rgb(213, 220, 3));
        gc.fillOval(29, 10 + yHeight, 35, 30);
        gc.strokeOval(29, 10 + yHeight, 35, 30);

        gc.setFill(Color.rgb(108, 220, 0));

        gc.fillOval(55, 10 + yHeight, 35, 30);
        gc.strokeOval(55, 10 + yHeight, 35, 30);

        gc.setFill(Color.rgb(29, 220, 7));

        gc.fillOval(0, 10 + yHeight, 35, 30);
        gc.strokeOval(0, 10 + yHeight, 35, 30);

    }


}
