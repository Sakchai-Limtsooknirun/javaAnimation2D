package Models;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class FishingBoat extends Boat implements Animation{
    private double baseSpeeds;
    private Color colorLadder;
    private Color colorMast;
    private Color colorWindow;
    private String billBoardText;
    private Color colorBillBoardFish;


    public FishingBoat(int x, int y,Color bodyColor ,Color colorFish, String billBoardText) {
        super(x, y,bodyColor);
        this.colorBillBoardFish = colorFish;
        this.billBoardText = billBoardText;
        baseSpeeds = 1.0 ;
        colorLadder = Color.BLUEVIOLET;
        colorMast = Color.BLACK;
        colorWindow = Color.web("#ffffff");

    }

    @Override
    public void draw() {
        this.drawBodyBoat();
        this.drawWindow();
        this.drawLadder();
        this.drawMast();
        this.drawFishBillBoard();
    }


    public void drawWindow() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorWindow);
        gc.setLineWidth(2);
        gc.fillRoundRect(110, 230, 40, 15, 20, 20);
        gc.strokeRoundRect(110, 230, 40, 15, 20, 20);
        gc.strokeLine(130, 225, 130, 250);

    }

    public void drawLadder() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorLadder);
        gc.strokeLine(150, 250, 150, 280);
        gc.strokeLine(170, 250, 170, 280);
        gc.strokeLine(150, 260, 170, 260);
        gc.strokeLine(150, 270, 170, 270);

    }

    public void drawMast() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorMast);
        gc.strokeLine(95, 200, 95, 250);
        gc.strokeLine(170, 200, 170, 250);
        gc.strokeLine(190, 200, 75, 200);
        gc.strokeLine(190, 205, 75, 205);
        gc.strokeLine(75, 200, 75, 205);
        gc.strokeLine(190, 200, 190, 205);
        gc.setStroke(Color.RED);
        gc.setLineWidth(6);
        gc.strokeLine(190, 202, 75, 202);
    }


    public void drawFishBillBoard() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(colorBillBoardFish);
        gc.fillRoundRect(80, 160, 100, 40, 20, 20);
        double[] CoordinateXfin = {110, 130, 130};
        double[] CoordinateYfin = {180, 170, 190};
        gc.setLineWidth(1);
        gc.setFill(Color.GREEN);
        gc.fillPolygon(CoordinateXfin, CoordinateYfin, 3);
        double[] CoordinateXHead = {160, 210, 210};
        double[] CoordinateYHead = {180, 160, 200};
        gc.fillPolygon(CoordinateXHead, CoordinateYHead, 3);
        gc.setFill(Color.BLACK);
        gc.fillOval(90, 170, 10, 10);
        gc.strokeOval(90, 170, 10, 10);
        gc.setFill(Color.WHITE);
        gc.fillRect(90, 145, 80, 15);
        gc.strokeRect(90, 145, 80, 15);
        gc.strokeText(billBoardText, 95, 160);

    }

    @Override
    public void speedUp() {
        setSpeed(baseSpeeds);
    }

    @Override
    public void speedDown() {
        setSpeed(baseSpeeds);
    }

    @Override
    public void StartAnimation() {
        TranslateTransition ttx = new TranslateTransition(
                Duration.millis(9000), this);
        ttx.setFromX(this.getTranslateX());
        ttx.setToX(this.getTranslateX() + -550);
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
