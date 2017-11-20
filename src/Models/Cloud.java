package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Cloud extends Super_draw {

    public Cloud(int x, int y) {
        super(x, y,300,300);
    }

    @Override
    public void draw() {
        drawCloud();
    }

    public void drawCloud(){
        drawCloudPart(0,45,Color.web("#00bfff"));
        drawCloudPart(40,45,Color.web("#00bfff"));
        drawCloudPart(80,45,Color.web("#00bfff"));



    }
    public void drawCloudPart(int x , int y,Color color){
        GraphicsContext gc = getGraphicsContext2D();;
        gc.setFill(color);
        gc.fillArc(x,y,50,20,0,180,ArcType.ROUND);
        gc.fillArc(x,y,50,20,180,180,ArcType.ROUND);
        gc.fillArc(x,y,50,20,0,180,ArcType.ROUND);
        gc.fillArc(x,y,50,20,180,180,ArcType.ROUND);

        gc.fillArc(x,y+5,50,20,0,180,ArcType.ROUND);
        gc.fillArc(x,y+5,50,20,180,180,ArcType.ROUND);
        gc.fillArc(x,y+5,50,20,0,180,ArcType.ROUND);
        gc.fillArc(x,y+5,50,20,180,180,ArcType.ROUND);


        gc.fillArc(x,y+15,50,20,0,180,ArcType.ROUND);
        gc.fillArc(x,y+15,50,20,180,180,ArcType.ROUND);
        gc.fillArc(x,y+15,50,20,0,180,ArcType.ROUND);
        gc.fillArc(x,y+15,50,20,180,180,ArcType.ROUND);
    }


}
