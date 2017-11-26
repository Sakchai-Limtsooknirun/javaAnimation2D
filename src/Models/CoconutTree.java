package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CoconutTree extends DrawsGraphic {

    private int TreeHeight ;
    private int yHeight = 150;

    public CoconutTree(int x, int y,int TreeHeight) {
       super(x,y,500,900);

       if (TreeHeight>16) {
           TreeHeight = 16;
           this.TreeHeight = TreeHeight;
       }
       else if (TreeHeight<7) {
           TreeHeight = 7;
           this.TreeHeight = TreeHeight;
       }
       else this.TreeHeight = TreeHeight;
    }

    public void draw() {
        drawBody();
        drawCoconut();

    }

    public void drawBody() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.rgb(206, 142, 43));
        gc.strokeRoundRect(0, 170, 80, 20,90,90);
        gc.fillRoundRect(0, 170, 80, 20,90,90);
        gc.setFill(Color.rgb(206, 168, 23));
        for (int i = 0; i < TreeHeight; i++) {
            gc.setLineWidth(2);
            gc.strokeRect(25, yHeight, 30, 20);
            gc.fillRect(25, yHeight, 30, 20);
            yHeight = yHeight - 10;
        }
    }

    public void drawCoconut() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.rgb(29, 220, 7));

        gc.fillOval(15, 10+yHeight, 30, 30);
        gc.strokeOval(15, 10+yHeight, 30, 30);

        gc.setFill(Color.rgb(213, 220, 3));
        gc.fillOval(29, 10+yHeight, 35, 30);
        gc.strokeOval(29, 10+yHeight, 35, 30);

        gc.setFill(Color.rgb(108, 220, 0));

        gc.fillOval(55, 10+yHeight, 35, 30);
        gc.strokeOval(55, 10+yHeight, 35, 30);

        gc.setFill(Color.rgb(29, 220, 7));

        gc.fillOval(0, 10+yHeight, 35, 30);
        gc.strokeOval(0, 10+yHeight, 35, 30);

    }



}
