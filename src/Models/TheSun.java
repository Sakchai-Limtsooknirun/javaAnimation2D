package Models;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class TheSun extends DrawsGraphic implements Animation{
    private Color lightColor;
    private Color centerColor;

    public TheSun(int x, int y,Color lightColor,Color centerColor) {
        super(x, y,900,300);
        this.lightColor = lightColor;
        this.centerColor = centerColor ;
    }

    @Override
    public void draw() {
        DrawSun();
    }

    protected void DrawSun() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(lightColor);
        gc.fillOval(100,45,300,250);
        gc.setFill(centerColor);
        gc.fillOval(170,120,150,100);

    }

    @Override
    public void StartAnimation() {
        FadeTransition ft = new FadeTransition(
                Duration.millis(9000), this
        );
        ft.setFromValue(1.0);
        ft.setToValue(0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        ScaleTransition st = new ScaleTransition(
                Duration.millis(9000), this
        );
        st.setToX(0.3);
        st.setToY(0.3);
        st.setCycleCount(Timeline.INDEFINITE);
        st.setAutoReverse(true);
        st.play();
    }
}
