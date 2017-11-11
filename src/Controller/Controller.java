package Controller;

import Models.*;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
    protected Boat_style1 boatStyle1;
    protected Boat_style2 boatStyle2;
    protected Background bg;
    protected CoconutTree coconutTree;
    protected Test test;
    protected TheSun theSun;
    protected Wave wave, wave2, wave3;
    @FXML
    Pane pane;


    public void initialize() {
        wave2 = new Wave(0, 140);
        wave3 = new Wave(0, 180);
        wave = new Wave(0, 160);
        boatStyle2 = new Boat_style2(550, 0);
        theSun = new TheSun(200, 30);
        test = new Test(200, 200);
        bg = new Background(0, 0);
        coconutTree = new CoconutTree(40, 300);
        boatStyle1 = new Boat_style1(0, 80, "สำราญ");


        display();




    }


    public void display() {
        pane.getChildren().clear();

        theSun.draw();
        wave.draw();
        wave2.draw();
        wave3.draw();

        //boatStyle1.setColor(Color.web("#ffff00"));
        boatStyle1.draw();
        bg.draw();
        boatStyle2.draw();

        //coconutTree.draw();
        test.draw();

        pane.getChildren().addAll(bg, theSun, wave, wave2, wave3, boatStyle2, boatStyle1,test);
    }

    @FXML
    public void Start(ActionEvent event) {

    }

}
