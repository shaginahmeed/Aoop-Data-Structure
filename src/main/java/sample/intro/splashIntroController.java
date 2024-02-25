package sample.intro;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class splashIntroController implements Initializable {

    @FXML
    private BorderPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        new SplashScreen().start();
    }


    class SplashScreen extends Thread
    {

        @Override
        public void run()
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Platform.runLater(new Runnable() {
                @Override
                public void run() {



                    Parent rootlogin = null;
                            try {
                                rootlogin = FXMLLoader.load(getClass().getResource("loginMenu.fxml"));
                            } catch (IOException e) {

                                throw new RuntimeException(e);
                            }

                            Scene scene = new Scene(rootlogin);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.initStyle(StageStyle.UNDECORATED);

                            root.getScene().getWindow().hide();
                            stage.show();

                }
            });

        }
    }
}
