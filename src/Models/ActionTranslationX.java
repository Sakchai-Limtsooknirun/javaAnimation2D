package Models;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class ActionTranslationX implements Animation {

    private double targetValue;
    private int time;
    private Super_draw super_draw;
    private TranslateTransition ttx ;

    public ActionTranslationX(double targetValue, int time, Super_draw obj) {
        this.targetValue = targetValue;
        this.time = time;
        this.super_draw = obj;
    }

    @Override
    public void Start() {
        ttx = new TranslateTransition(
                Duration.millis(time), super_draw);
        ttx.setFromX(super_draw.getTranslateX());
        ttx.setToX(super_draw.getTranslateX() + targetValue);
        ttx.setCycleCount(Timeline.INDEFINITE);
        ttx.setAutoReverse(true);
        ttx.play();
    }



}
