module sample.intro {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.intro to javafx.fxml;
    exports sample.intro;
}