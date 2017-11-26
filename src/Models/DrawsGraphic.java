package Models;
import javafx.scene.canvas.Canvas;


public abstract class DrawsGraphic extends Canvas {


    public DrawsGraphic(int x, int y , int w , int h) {
        setTranslateX(x);
        setTranslateY(y);
        setWidth(w); //900
        setHeight(h); //600
    }

    public abstract void draw();







}
