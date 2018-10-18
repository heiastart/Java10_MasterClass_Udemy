package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application implements EventHandler {

    private Label title;
    private Label response;
    private Label selected;

    private CheckBox bananCB;
    private CheckBox mangoCB;
    private CheckBox papayaCB;
    private CheckBox grapefruktCB;

    private String fruits;  // Empty string that will (eventually) hold all of our fruits :)


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Favorite fruit");
        title = new Label("Hvilke frukter liker du?");
        response = new Label("");
        selected = new Label("");
        bananCB = new CheckBox("Banan");
        mangoCB = new CheckBox("Mango");
        papayaCB = new CheckBox("Papaya");
        grapefruktCB = new CheckBox("Grapefrukt");

        // Set up stage and scene
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPaneRoot.setAlignment(Pos.CENTER);

        // Adding all the controls/elements to the FlowPane (rememb., the xxPane object is the root that all the stuff is added to, via getChildren!
        flowPaneRoot.getChildren().add(title);
        flowPaneRoot.getChildren().addAll(bananCB, mangoCB, papayaCB, grapefruktCB, response, selected);

        // Attach eventListeners to the checkboxes
        // By create 6 ev.listener handle methods, one for each checkbox (much work - bad!) OR
        //    implement EventHandler for the Main class and make 1 eventListener method instead - good!!!
        bananCB.setOnAction(this::handle);
        mangoCB.setOnAction(this::handle);
        papayaCB.setOnAction(this::handle);
        grapefruktCB.setOnAction(this::handle);


        Scene scene = new Scene(flowPaneRoot, 400, 250,true);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();
    }

    void showAll(){ // Notice that not necessary to specify public (use the public keyword first :)
        fruits = "";
        if (bananCB.isSelected()) fruits = " Banan";
        if (mangoCB.isSelected()) fruits += " Mango";
        if (papayaCB.isSelected()) fruits += " Papaya";
        if (grapefruktCB.isSelected()) fruits += " Grapefrukt";

        selected.setText("Valgte frukter er: " + fruits);
    }

    @Override
    public void handle(Event event) {
        Object fruitChecked = event.getSource();    // The getSource() gives us the event (which ch.box that was clicked :)

        if (bananCB.equals(fruitChecked)){
            if (bananCB.isSelected()){
                response.setText("Banan er valgt!");
            }
            else response.setText("Banan er klarert!");
            showAll();
        }

        if (mangoCB.equals(fruitChecked)){
            if (mangoCB.isSelected()){
                response.setText("Mango er valgt!");
            }
            else response.setText("Mango er klarert!");
            showAll();
        }

        if (fruitChecked == papayaCB){
            if (papayaCB.isSelected()){
                response.setText("Papaya er valgt!");
            }
            else response.setText("Papaya er klarert!");
            showAll();
        }

        if (fruitChecked == grapefruktCB){
            if (grapefruktCB.isSelected()){
                response.setText("Grapefrukt er valgt!");
            }
            else response.setText("Grapefrukt er klarert!");
            showAll();
        }
    }



    // Have the main-method dead last!!!!!!!
    public static void main(String[] args) {

        launch(args);
    }
}
