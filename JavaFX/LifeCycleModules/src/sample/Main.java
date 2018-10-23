package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    // Here we set up the different lifecycle steps that a JavaFX application goes through from we run it till we kill/stop it
    // i.e. the different methods that are called for each step (3 main methods; init, start and stop) - roadmap for the logic in the program

    @Override
    public void start(Stage primaryStage) throws Exception{

        System.out.println("Start begins");
        primaryStage.setTitle("Life cycle");
        FlowPane root = new FlowPane(Orientation.VERTICAL, 5, 5);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 700, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init begins");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop invoked");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
