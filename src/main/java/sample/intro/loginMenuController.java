package sample.intro;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginMenuController implements Initializable {

    @FXML
    private ImageView icon;

    @FXML
    private BorderPane rootPane;

    @FXML
    private Text text = new Text();




    private Stage stage;
    private Scene scene;
    @FXML
    private TextField username;


    @FXML
    private PasswordField password;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        transition.fadeInTransition(rootPane);
        transition.swim(icon,10,10);
        FadeTransition fade = new FadeTransition(Duration.millis(1000),text);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();



        text.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("intro.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage = new Stage();
                scene = new Scene(root);
                stage.setScene(scene);
                rootPane.getScene().getWindow().hide();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();


            }
        });





    }


    @FXML
    void login(ActionEvent event) {
        if(username.getText().equals("username") && password.getText().equals("password"))
                {
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stage = new Stage();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    rootPane.getScene().getWindow().hide();
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.show();
                }

    }
}
