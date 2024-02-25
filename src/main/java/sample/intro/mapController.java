package sample.intro;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class mapController implements Initializable {

    @FXML
    private Label pressEnter;

    @FXML
    private Label lv1;

    @FXML
    private Label lv2;

    @FXML
    private Label lv3;

    @FXML
    private Label lv4;

    @FXML
    private Label lv5;

    @FXML
    private Label lv6;

    @FXML
    private ImageView dialouge;

    @FXML
    private TextArea dialougetext;

    @FXML
    private ImageView luffy;

    @FXML
    private ImageView ship1;

    @FXML
    private ImageView ship2;

    @FXML
    private ImageView ship3;

    @FXML
    private ImageView ship4;

    @FXML
    private ImageView ship5;

    @FXML
    private ImageView ship6;

    @FXML
    private AnchorPane root;

    private int enterPressedCount;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ship1.setOnMouseClicked(this::handleShip1Click);
        ship2.setOnMouseClicked(this::handleShip2Click);
        ship3.setOnMouseClicked(this::handleShip3Click);
        ship4.setOnMouseClicked(this::handleShip4Click);
        ship5.setOnMouseClicked(this::handleShip5Click);
        ship6.setOnMouseClicked(this::handleShip6Click);

        handleShip1Animation();
        handleShip2Animation();
        handleShip3Animation();
        handleShip4Animation();
        handleShip5Animation();
        handleShip6Animation();

        dialougetext.setFocusTraversable(true);
        transition.showMessage(luffy,300,300,dialouge,dialougetext,"Hello my name is Monkey D Luffy !!! Welcome, adventurer, to the boundless world of Data Seas: Quest for Knowledge");
        dialougetext.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode() == KeyCode.ENTER) {
                    enterPressedCount++;
                    if (enterPressedCount == 2) {
                        // Hide the dialogue elements
                        dialouge.setVisible(false);
                        dialougetext.setVisible(false);
                        luffy.setVisible(false);

                        // Show the rest of the map scene
                        showRestOfMapScene();
                    } else {
                        transition.showMessage(luffy,600,600,dialouge,dialougetext,"Lets Start Your Game");
                    }
                }
            }
        });

        transition.fadeInTransition(root);
        ship1.setStyle("-fx-opacity: 0.9;");
        ship2.setStyle("-fx-opacity: 0.6;");
        ship3.setStyle("-fx-opacity: 0.5;");
        ship4.setStyle("-fx-opacity: 0.4;");
        ship5.setStyle("-fx-opacity: 0.3;");
        ship6.setStyle("-fx-opacity: 0.2;");

        FadeTransition fade1 = new FadeTransition(Duration.millis(2000),lv1);
        fade1.setFromValue(1.0);
        fade1.setToValue(0.0);
        fade1.setCycleCount(TranslateTransition.INDEFINITE);
        fade1.setAutoReverse(true);
        fade1.play();

        FadeTransition fade2 = new FadeTransition(Duration.millis(1500),lv2);
        fade2.setFromValue(1.0);
        fade2.setToValue(0.0);
        fade2.setCycleCount(TranslateTransition.INDEFINITE);
        fade2.setAutoReverse(true);
        fade2.play();

        FadeTransition fade3 = new FadeTransition(Duration.millis(2000),lv3);
        fade3.setFromValue(1.0);
        fade3.setToValue(0.0);
        fade3.setCycleCount(TranslateTransition.INDEFINITE);
        fade3.setAutoReverse(true);
        fade3.play();

        FadeTransition fade4 = new FadeTransition(Duration.millis(1500),lv4);
        fade4.setFromValue(1.0);
        fade4.setToValue(0.0);
        fade4.setCycleCount(TranslateTransition.INDEFINITE);
        fade4.setAutoReverse(true);
        fade4.play();

        FadeTransition fade5 = new FadeTransition(Duration.millis(2000),lv5);
        fade5.setFromValue(1.0);
        fade5.setToValue(0.0);
        fade5.setCycleCount(TranslateTransition.INDEFINITE);
        fade5.setAutoReverse(true);
        fade5.play();

        FadeTransition fade6 = new FadeTransition(Duration.millis(1500),lv6);
        fade6.setFromValue(1.0);
        fade6.setToValue(0.0);
        fade6.setCycleCount(TranslateTransition.INDEFINITE);
        fade6.setAutoReverse(true);
        fade6.play();
    }


    private void showRestOfMapScene() {
        dialouge.setVisible(false);
        dialougetext.setVisible(false);
        luffy.setVisible(false);
        pressEnter.setVisible(false);

        lv2.setVisible(true);
        lv3.setVisible(true);
        lv4.setVisible(true);
        lv5.setVisible(true);
        lv6.setVisible(true);
        ship1.setVisible(true);
        ship2.setVisible(true);
        ship3.setVisible(true);
        ship4.setVisible(true);
        ship5.setVisible(true);
        ship6.setVisible(true);
    }

    public void handleShip1Click(MouseEvent event) {
        transition.handleShipClick(event, ship1,100,100, root, "level1.fxml");
    }

    public void handleShip2Click(MouseEvent event) {
        transition.handleShipClick(event, ship2,200,200,root, "level1.fxml");
    }

    public void handleShip3Click(MouseEvent event) {
        transition.handleShipClick(event, ship1,300,300, root, "level1.fxml");
    }

    public void handleShip4Click(MouseEvent event) {
        transition.handleShipClick(event, ship2,400,400, root, "level1.fxml");
    }

    public void handleShip5Click(MouseEvent event) {
        transition.handleShipClick(event, ship1,500,500, root, "level1.fxml");
    }

    public void handleShip6Click(MouseEvent event) {
        transition.handleShipClick(event, ship6, 600,600,root, "level1.fxml");
    }


    public void handleShip1Animation() {
        transition.addHoverAnimation(ship1);
    }

    public void handleShip2Animation() {
        transition.addHoverAnimation(ship2);
    }

    public void handleShip3Animation() {
        transition.addHoverAnimation(ship3);
    }

    public void handleShip4Animation() {
        transition.addHoverAnimation(ship4);
    }

    public void handleShip5Animation() {
        transition.addHoverAnimation(ship5);
    }

    public void handleShip6Animation() {
        transition.addHoverAnimation(ship6);
    }



}
