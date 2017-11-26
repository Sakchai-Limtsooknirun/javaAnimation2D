package Models;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

public class TheSun extends DrawsGraphic implements Animation{
    private Color lightColor;
    private Color CenterColor;

    public TheSun(int x, int y) {
        super(x, y,900,300);
        lightColor = Color.web("#ff8000");
        CenterColor = Color.web("#ffbf00") ;
    }

    @Override
    public void draw() {
        DrawSun();
    }

    public void DrawSun() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(lightColor);
        gc.fillOval(100,45,300,250);
        //gc.fillArc(100, 45, 300, 250, 0, 180, ArcType.OPEN);
        gc.setFill(CenterColor);
        gc.fillOval(170,120,150,100);
        //gc.fillArc(170,120,150,100,0,180,ArcType.OPEN);
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
        st.setToX(0);
        st.setToY(0);
        st.setCycleCount(Timeline.INDEFINITE);
        st.setAutoReverse(true);
        st.play();
    }
}
