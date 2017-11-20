package Models;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class ActionRotate implements Animation {
    private int angle;
    private Super_draw super_draw;
    private RotateTransition rt ;

    public ActionRotate(int angle, Super_draw obj) {
        this.angle = angle;
        this.super_draw = obj;
    }

    @Override
    public void Start() {
        rt = new RotateTransition(
                Duration.millis(3000), super_draw);
        rt.setByAngle(angle);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.setAutoReverse(true);
        rt.play();
    }

    @Override
    public void Stop() {
        rt.stop();
    }
}
