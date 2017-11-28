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
    protected SailBoat sailBoat;
    protected FishingBoat fishingBoat;
    protected Background bg;
    protected SkyBG skyBG;
    protected GroundBG groundBG;
    protected CoconutTree coconutTree, coconutTree2, coconutTree3;
    protected Cloud cloud, cloud2, cloud3, cloud4;
    protected TheSun theSun;
    protected Wave wave, wave2, wave3;
    protected Buoy buoy;
    protected Crabs bigCrabs, bigCrabs2;
    protected Fish fishes, fishesTuna, fishesSalmon;
    protected SeaBG seaBG;
    private boolean statusOn = false;
    private ArrayList<DrawsGraphic> ListObj;
    private BoatKeyAction boatKeyAction;
    @FXML
    Pane pane;


    public void initialize() {
        ListObj = new ArrayList<DrawsGraphic>();
        ListObj.add(bg = new Background(0, 0,Color.BLACK));
        ListObj.add(skyBG = new SkyBG(0, 0,Color.web("#faf2b3")));
        ListObj.add(groundBG = new GroundBG(0, 0,Color.web("#c2b280")));
        ListObj.add(theSun = new TheSun(200, 30,Color.web("#ff8000"),Color.web("#ffbf00")));
        ListObj.add(seaBG = new SeaBG(0, 0,Color.web("#B6D7FA")));
        ListObj.add(bigCrabs = new Crabs(0, 0,Color.ORANGE,Color.RED));
        ListObj.add(bigCrabs = new Crabs(-35, 65,Color.ORANGE,Color.RED));
        ListObj.add(bigCrabs2 = new Crabs(200, 90,Color.web("#ff8000"),Color.WHITE));
        ListObj.add(bigCrabs2 = new Crabs(250, 23,Color.web("#ff8000"),Color.WHITE));
        ListObj.add(fishes = new Fish(800, 100, Color.ORANGE,Color.web("#00bfff"),Color.AQUA));
        ListObj.add(fishesTuna = new Fish(800, 150, Color.web("#808080"),Color.BROWN,Color.WHITE));
        ListObj.add(fishesSalmon = new Fish(920, 125, Color.web("#ff00bf"),Color.GREEN,Color.PINK));
        ListObj.add(wave = new Wave(0, 160,Color.web("#00bfff"),3));
        ListObj.add(wave2 = new Wave(0, 140,Color.web("#00bfff"),3));
        ListObj.add(wave3 = new Wave(0, 180,Color.web("#00bfff"),3));
        ListObj.add(buoy = new Buoy(-160, -20,Color.YELLOW ,Color.RED ,Color.web("#00bfff")));
        ListObj.add(fishingBoat = new FishingBoat(550, 0,Color.GOLD, Color.web("#0080ff"), "จับปลา24ช.ม"));
        ListObj.add(sailBoat = new SailBoat(0, 80, Color.web("#ff00bf"),"ไทยประกันชีวิต", Color.BLACK, Color.web("#ffff00")));
        ListObj.add(coconutTree3 = new CoconutTree(620, 290, 13));
        ListObj.add(coconutTree = new CoconutTree(720, 290, 15));
        ListObj.add(coconutTree2 = new CoconutTree(670, 340, 10));
        ListObj.add(cloud = new Cloud(10, 0, Color.web("#00bfff"), 50, 50));
        ListObj.add(cloud2 = new Cloud(190, 0, Color.web("#0080ff"), 20, 50));
        ListObj.add(cloud3 = new Cloud(400, 0, Color.web("#00bfff"), 30, 50));
        ListObj.add(cloud4 = new Cloud(600, 0, Color.web("#0080ff"), 20, 50));

        display();

        boatKeyAction = new BoatKeyAction(sailBoat);
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
                onClick(event.getX(), event.getY(), sailBoat);
                onClick(event.getX(), event.getY(), fishingBoat);
            }

            public void onClick(double x, double y, Boat boat) {
                if (boat.isClick(x, y)) {
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
        for (DrawsGraphic obj : ListObj) {
            obj.draw();
        }
        pane.getChildren().addAll(ListObj);
    }


    @FXML
    public void Start(ActionEvent event) {
        if (!statusOn) {
            statusOn = true;
            for (DrawsGraphic obj : ListObj) {
                if (obj instanceof Animation)
                    ((Animation) obj).StartAnimation();
            }
        }
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
        FXMLLoader root = new FXMLLoader(getClass().getResource("/Views/InfoView.fxml"));
        NewStage(root, "Information");

    }

    @FXML
    public void HowtoBtn(ActionEvent event) throws IOException {
        FXMLLoader root = new FXMLLoader(getClass().getResource("/Views/HowtoView.fxml"));
        NewStage(root, "How to");
    }

    public void NewStage(FXMLLoader root, String title) throws IOException {
        Stage b = new Stage();
        b.setTitle(title);
        b.setScene(new Scene(root.load(), 388, 227));
        b.show();
    }

}
