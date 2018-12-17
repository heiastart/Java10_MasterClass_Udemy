package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {

        loginUsername.setStyle("-fx-text-inner-color: #fafafa");
        //loginPassword.setStyle("-fx-text-inner-color: #a0a2ab");

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               System.out.println("Login clicked");
               loginUser();
           }
        });

    }

    private void loginUser(){

        // Get the main window, then HIDE it!!
        loginButton.getScene().getWindow().hide();

        if (!loginUsername.getText().toString().trim().equals("") && !loginPassword.getText().toString().trim().equals("")){
            // If true -> user has entered something in both username AND password field. Thus, we are ready to go through with the login procedure!
            // That is to show the user the next screen, which is the details.fxml page :)
            // When showing the next window (details.fxml), we want to hide the current login-page...

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/details.fxml"));
            try {
                loader.load();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setTitle("Details window");
            stage.setScene(new Scene(root));

            DetailsController detailsController = loader.getController();
            detailsController.setName(loginUsername.getText(), "IT consultant and electrician", 38);

            stage.show();

        }
    }
}

