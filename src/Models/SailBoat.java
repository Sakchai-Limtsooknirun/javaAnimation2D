package Models;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class SailBoat extends Boat implements Animation{
    private String logo;
    private Color colorSail;
    private Color colorWindow = Color.web("#ffffff");
    private Color colorFont;

    public SailBoat(int x, int y,Color BodyColor ,String Logo,Color ColorText ,Color ColorSail) {
        super(x, y,BodyColor);
        this.logo = Logo;
        this.colorSail = ColorSail ;
        this.colorFont = ColorText ;
    }

    @Override
    public void draw() {
        drawSail();
        super.draw();
        drawWindow();
        drawLogo();

    }
    public void drawLogo() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(1);
        gc.setStroke(colorFont);
        gc.strokeText(logo, 140, 210);
    }

    public void drawSail() {
        GraphicsContext gc = getGraphicsContext2D();
        double[] listSailx1 = {140, 230, 140};
        double[] listSaily1 = {215, 215, 95};
        double[] listSailx2 = {50, 137, 137};
        double[] listSaily2 = {215, 215, 95};
        gc.setStroke(Color.BLACK);
        gc.setFill(colorSail);
        gc.setLineWidth(3);
        gc.strokePolygon(listSailx1, listSaily1, 3);
        gc.fillPolygon(listSailx1, listSaily1, 3);
        gc.strokePolygon(listSailx2, listSaily2, 3);
        gc.fillPolygon(listSailx2, listSaily2, 3);
        gc.strokeLine(138, 95, 138, 260);


    }

    public void drawWindow() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorWindow);
        gc.setLineWidth(2);
        gc.fillOval(110, 230, 17, 17);
        gc.fillOval(135, 230, 17, 17);
        gc.setStroke(Color.WHITE);
        gc.strokeLine(108,238,155,238);

    }


    @Override
    public void StartAnimation() {
        TranslateTransition ttx = new TranslateTransition(
                Duration.millis(9000), this);
        ttx.setFromX(this.getTranslateX());
        ttx.setToX(this.getTranslateX() + (550));
        ttx.setCycleCount(Timeline.INDEFINITE);
        ttx.setAutoReverse(true);
        ttx.play();


        RotateTransition rt = new RotateTransition(
                Duration.millis(3000), this);
        rt.setByAngle(2);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.setAutoReverse(true);
        rt.play();
    }

}
