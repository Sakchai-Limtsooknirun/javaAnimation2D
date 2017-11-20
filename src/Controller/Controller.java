package Controller;

import Models.*;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    protected Boat_style1 boatStyle1;
    protected Boat_style2 boatStyle2;
    protected Background bg;
    protected CoconutTree coconutTree;
    protected Test test;
    protected TheSun theSun;
    protected Wave wave, wave2, wave3;
    protected Buoy buoy ;
    private boolean statusOn;
    ArrayList<Super_draw> ListObj;
    private BoatKeyAction boatKeyAction ;
    @FXML
    Pane pane;


    public void initialize() {
        ListObj = new ArrayList<>();
        ListObj.add(wave2 = new Wave(0, 140));
        ListObj.add(wave3 = new Wave(0, 180));
        ListObj.add(wave = new Wave(0, 160));
        ListObj.add(boatStyle2 = new Boat_style2(550, 0));
        ListObj.add(theSun = new TheSun(200, 30));
        test = new Test(200, 200);
        ListObj.add(bg = new Background(0, 0));
        coconutTree = new CoconutTree(40, 300);
        ListObj.add(boatStyle1 = new Boat_style1(0, 80, "สำราญ"));
        ListObj.add(buoy = new Buoy(-160, -20));
        display();
        boatKeyAction = new BoatKeyAction(boatStyle1);
        pane.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch ((event.getCode())) {
                    case W:
                        boatKeyAction.setMoveUp(true);
                        break;
                    case S:
                        boatKeyAction.setMoveDown(true);
                        break;
                    case D:
                        boatKeyAction.setMoveRight(true);
                        break;
                    case A:
                        boatKeyAction.setMoveleft(true);
                        break;
                    case UP:
                        boatKeyAction.setSpeedUp(true);
                        break;
                    case DOWN:
                        boatKeyAction.setSpeedDown(true);
                        break;

                }
            }
        });
        pane.getParent().setOnKeyReleased((event -> {
            switch ((event.getCode())) {
                case W:
                    //boatStyle1.CheckLimit((int)bg.getTranslateX(),(int)bg.getTranslateY());
                    boatKeyAction.setMoveUp(false);
                    break;
                case S:
                    // boatStyle1.CheckLimit((int)bg.getTranslateX(),(int)bg.getTranslateY());
                    boatKeyAction.setMoveDown(false);
                    break;
                case D:
                    // boatStyle1.CheckLimit((int)bg.getTranslateX(),(int)bg.getTranslateY());
                    boatKeyAction.setMoveRight(false);
                    break;
                case A:
                    //boatStyle1.CheckLimit((int)bg.getTranslateX(),(int)bg.getTranslateY());
                    boatKeyAction.setMoveleft(false);
                    break;
                case UP:
                    //boatStyle1.CheckLimit((int)bg.getTranslateX(),(int)bg.getTranslateY());
                    boatKeyAction.setSpeedUp(false);
                    break;
                case DOWN:
                    //boatStyle1.CheckLimit((int)bg.getTranslateX(),(int)bg.getTranslateY());
                    boatKeyAction.setSpeedDown(false);
                    break;
            }
        }));

        pane.getParent().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                onClick(event.getX(), event.getY(), boatStyle1);
                onClick(event.getX(), event.getY(), boatStyle2);
            }

            public void onClick(double x, double y, Super_Boat boat) {
                if (boat.isClick(x, y)) {
                    System.out.println("OK");
                    boatKeyAction.setBoat(boat);
                }
            }
        });
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                boatKeyAction.action();
            }
        };
        animationTimer.start();




    }


    public void display() {
        pane.getChildren().clear();

        for (Super_draw obj : ListObj){
            obj.draw();
        }

        pane.getChildren().addAll(bg, theSun, wave, wave2, wave3, buoy ,boatStyle2, boatStyle1,test);
    }

    @FXML
    public void Start(ActionEvent event) {
        statusOn = true;
        theSun.StartAnimation(new ActionFade(9000, 1.0, 0, theSun));
        bg.StartAnimation(new ActionFade(9000, 1.0, 0.3, bg));
        boatStyle1.StartAnimation(new ActionTranslationX(550, 9000, boatStyle1));
        boatStyle2.StartAnimation(new ActionTranslationX(-550, 9000, boatStyle2));
        boatStyle1.StartAnimation(new ActionRotate(2, boatStyle1));
        boatStyle2.StartAnimation(new ActionRotate(2, boatStyle2));
        buoy.StartAnimation(new ActionRotate(4, buoy));
        wave.StartAnimation(new ActionTranslationY(200, 9000, wave));
        wave2.StartAnimation(new ActionTranslationY(200, 9000, wave2));
        wave3.StartAnimation(new ActionTranslationY(200, 9000, wave3));
        wave.StartAnimation(new ActionFade(3000, 1.0, 0, wave));
        wave2.StartAnimation(new ActionFade(2500, 1.0, 0, wave2));
        wave3.StartAnimation(new ActionFade(3000, 1.0, 0, wave3));

    }
    @FXML
    public void Stop(ActionEvent event) {
        if (statusOn) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/TheSea.fxml"));
            try {
                stage.setScene(new Scene(loader.load(), 800, 543));
                stage.setResizable(false);
                stage.show();
                statusOn = false;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

    }

    @FXML
    public void InfoBtn(ActionEvent event) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/Views/infoView.fxml"));
        NewStage(root, "Information");


    }

    @FXML
    public void HowtoBtn(ActionEvent event) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/Views/howtoView.fxml"));
        NewStage(root, "How to");

    }
    public void NewStage(FXMLLoader root, String title) throws IOException {
        Stage b = new Stage();
        b.setTitle(title);
        b.setScene(new Scene(root.load(), 388, 227));
        b.show();
    }

}
