package Models;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

public class Cloud extends DrawsGraphic implements Animation {

    private Color cloudColor;
    private int heightCloud;
    private int wideCloud;

    public Cloud(int x, int y, Color CloudColor, int HeightCloud, int WeiCloud) {
        super(x, y, 300, 300);
        this.cloudColor = CloudColor;
        this.heightCloud = HeightCloud;
        this.wideCloud = WeiCloud;
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
        gc.setFill(cloudColor);
        gc.fillArc(x, y, wideCloud, heightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y, wideCloud, heightCloud, 180, 180, ArcType.ROUND);
        gc.fillArc(x, y, wideCloud, heightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y, wideCloud, heightCloud, 180, 180, ArcType.ROUND);

        gc.fillArc(x, y + 5, wideCloud, heightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 5, wideCloud, heightCloud, 180, 180, ArcType.ROUND);
        gc.fillArc(x, y + 5, wideCloud, heightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 5, wideCloud, heightCloud, 180, 180, ArcType.ROUND);


        gc.fillArc(x, y + 15, wideCloud, heightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 15, wideCloud, heightCloud, 180, 180, ArcType.ROUND);
        gc.fillArc(x, y + 15, wideCloud, heightCloud, 0, 180, ArcType.ROUND);
        gc.fillArc(x, y + 15, wideCloud, heightCloud, 180, 180, ArcType.ROUND);
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
