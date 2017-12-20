package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class AllBG {
    private Color colorBg;
    private int x1,y1,h1,w1 ;
    private GraphicsContext gc ;

    public AllBG(Color colorBg, int x1, int y1, int h1, int w1) {
        this.colorBg = colorBg ;
        this.x1 = x1 ;
        this.y1 = y1 ;
        this.h1 = h1 ;
        this.w1 = w1 ;

    }

    protected void setGc(GraphicsContext gc) {
        this.gc = gc;
    }

    public void drawBG(){
        gc.setFill(colorBg);
        gc.fillRect(x1,y1,h1,w1);

    }
}
