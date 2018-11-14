package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // MVC model -> Model View Controller, separates the code like this;
    // Model;       what we are modelling our data to be, i.e the classes models the physical objects
    // View;        the GUI, what the users are seeing
    // Controller;  connects the view and the model and "knows" everything about these two

    @FXML
    private Button clickMeButton;

    @FXML
    private Label labelId;

    @FXML
    private CheckBox myCheckBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello app!!");
                labelId.setText("Du trykket på knappen...bra jobba!");
                myCheckBox.fire();
            }
        });

    }
}
