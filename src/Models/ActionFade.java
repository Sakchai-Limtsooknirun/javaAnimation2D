package Models;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class ActionFade implements Animation {

    private int time;
    private double fromValue;
    private double toValue;
    private Super_draw obj;
    private FadeTransition ft ;

    public ActionFade(int time, double fromValue, double toValue, Super_draw obj) {
        this.time = time;
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.obj = obj;
    }

    @Override
    public void Start() {
        ft = new FadeTransition(
                Duration.millis(time), obj
        );
        ft.setFromValue(fromValue);
        ft.setToValue(toValue);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

    }



}
