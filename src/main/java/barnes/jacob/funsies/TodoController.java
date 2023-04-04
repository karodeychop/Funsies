package barnes.jacob.funsies;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TodoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}