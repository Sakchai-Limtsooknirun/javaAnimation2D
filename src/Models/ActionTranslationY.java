package Models;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class ActionTranslationY implements Animation {
    private double targetValue;
    private int time;
    private Super_draw obj;
    private TranslateTransition tty;
    public ActionTranslationY(double targetValue, int time, Super_draw obj) {
        this.targetValue = targetValue;
        this.time = time;
        this.obj = obj;
    }

    @Override
    public void Start() {
         tty = new TranslateTransition(
                Duration.millis(time), obj);
        tty.setFromY(obj.getTranslateY());
        tty.setToY(obj.getTranslateY() + targetValue);
        tty.setCycleCount(Timeline.INDEFINITE);
        tty.setAutoReverse(true);
        tty.play();
    }

    @Override
    public void Stop() {
        tty.stop();
    }
}
