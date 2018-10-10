package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    // Application is the barebone app class for JavaFX, with lots of good stuff :)
    // The Stage class is the window (top class in hierarchy) in JavaFX envir.
    //              ||
    //          Scene class
    //              ||
    //      StackPane (or other Pane) - the root...
    //              ||
    // Finally, within the (Stack)Pane, we put the objects such as buttons, textfields etc.
    private Label myLabel;
    private Label myLabel2;
    private TextField nameTextField;

    @Override
    public void start(Stage primaryStage) throws Exception{     // Kinda like the old main, in std Java...

        primaryStage.setTitle("Hello JavaFX");
        Button button = new Button();
        button.setText("Trykk meg");
        myLabel = new Label("Awesome!!!!!!!!!!!");
        myLabel2 = new Label();
        nameTextField = new TextField();
        //nameTextField.setText("Test...");
        nameTextField.setPromptText("Enter your name");  // The text that shows inside the field, that tell the user what it is that we want them to enter (e.g if they are to enter some information).

        // Here we see the hierarchy;
        // Stage comes with the start method -> created a scene and stackpane object ->
        // scene takes in the stackpane root object and root adds the button (+ can have several children objects)
        // Finally, the primaryStage takes in the scene object with setScene and we let the stage be visible with show!!

        // StackPane root = new StackPane(); -> with StackPane, everything is put on top of (stacked) eachother...bad :(
        FlowPane root = new FlowPane(15,15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(button);
        root.getChildren().add(myLabel);
        root.getChildren().add(myLabel2);
        root.getChildren().add(nameTextField);
        Scene scene = new Scene(root, 250, 200);
        primaryStage.setScene(scene);
        primaryStage.show(); // Instead of setVisible(true)
        // No need to specify DefaultCloseOperation :D

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                myLabel2.setText("Trykket du på knappen??? Bra jobba :)");

                // To collect what the user types in the nameTextField when he clicks the button;
                String name = nameTextField.getText().trim();

                myLabel.setText(name);
            }
        });
    }


    public static void main(String[] args) {

        launch(args);
    }
}
