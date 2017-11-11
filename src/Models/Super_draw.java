package Models;


import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.util.Duration;

public abstract class Super_draw extends Canvas {

    public Super_draw(int x, int y , int w ,int h) {
        setTranslateX(x);
        setTranslateY(y);
        setWidth(w); //900
        setHeight(h); //600
    }

    public abstract void draw();




}
