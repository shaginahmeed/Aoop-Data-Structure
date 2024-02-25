package sample.intro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class signupController implements Initializable {
    @FXML
    private ImageView icon;

    @FXML
    private BorderPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        transition.fadeInTransition(root);
        transition.swim(icon,10,10);
    }
}
