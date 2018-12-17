package sample.controller;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class DetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsAgeId;

    @FXML
    private Label detailsProfession;

    @FXML
    private Hyperlink detailsWebURL;

    @FXML
    private Hyperlink detailsTwitterURL;

    @FXML
    void initialize() {
        detailsWebURL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("http://www.buildappswithpaulo.com"));
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        detailsTwitterURL.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.twitter.com/buildappswithme"));
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }

    void setName(String name, String profession, int age){
        detailsAgeId.setText("Alder: " + String.valueOf(age));
        detailsProfession.setText("Profesjon: " + profession);
        detailsWelcomeLabel.setText("Velkommen " + name);
        detailsName.setText("Navn: " + name);

    }
}
