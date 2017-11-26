package Models;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

public class Cloud extends DrawsGraphic implements Animation{

    private Color CloudColor;
    private int HeightCloud;
    private int WideCloud;

    public Cloud(int x, int y, Color CloudColor, int HeightCloud, int WeiCloud) {
        super(x, y, 300, 300);
        this.CloudColor = CloudColor;
        this.HeightCloud = HeightCloud;
        this.WideCloud = WeiCloud;
    }

    @Override
    public void draw() {
        drawCloud();
    }

    public void drawCloud() {
        drawCloudPart(0, 45);
        drawCloudPart(40, 45);
        drawCloudPart(80, 45);


    }

    public void drawCloudPart(int x, int y) {
        GraphicsContext gc = getGraphicsContext2D();
        ;
        gc.setFill(CloudColor);
        gc.fillArc(x, y, WideCloud, HeightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y, WideCloud, HeightCloud, 180, 180, ArcType.ROUND);
        gc.fillArc(x, y, WideCloud, HeightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y, WideCloud, HeightCloud, 180, 180, ArcType.ROUND);

        gc.fillArc(x, y + 5, WideCloud, HeightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 5, WideCloud, HeightCloud, 180, 180, ArcType.ROUND);
        gc.fillArc(x, y + 5, WideCloud, HeightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 5, WideCloud, HeightCloud, 180, 180, ArcType.ROUND);


        gc.fillArc(x, y + 15, WideCloud, HeightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 15, WideCloud, HeightCloud, 180, 180, ArcType.ROUND);
        gc.fillArc(x, y + 15, WideCloud, HeightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 15, WideCloud, HeightCloud, 180, 180, ArcType.ROUND);
    }


    @Override
    public void StartAnimation() {
        FadeTransition ft = new FadeTransition(
                Duration.millis(9000), this
        );
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();

        TranslateTransition ttx = new TranslateTransition(
                Duration.millis(9000), this);
        ttx.setFromX(this.getTranslateX());
        ttx.setToX(this.getTranslateX() + (50));
        ttx.setCycleCount(Timeline.INDEFINITE);
        ttx.setAutoReverse(true);
        ttx.play();
    }
}
