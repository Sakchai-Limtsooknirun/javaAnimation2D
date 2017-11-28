package Models;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class SkyBG extends Background implements Animation{
    private Color colorSky;

    public SkyBG(int x, int y,Color colorSky) {
        super(x, y,Color.BLACK);
        this.colorSky = colorSky ;
    }

    @Override
    public void draw() {
        drawTheSky();
    }

    public void drawTheSky(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorSky);
        gc.fillRect(0,0,900,200);
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
    }
}
