package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {

    private Button rotateButton;
    private Button blurButton;
    private Button scaleButton;
    private Rotate rotate;
    private Scale scale;
    private double scaleFactor;
    private Label reflect;
    private double angle;
    private double blurVal;
    private BoxBlur blur;
    private Reflection reflection;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Life Cycle");

        scaleFactor = 1.0;
        angle = 0.0;
        blurVal = 1.0;
        blur = new BoxBlur(1.0, 1.0, 1);
        rotateButton = new Button("Rotate");
        blurButton = new Button("Blur off");
        scaleButton = new Button("Scale");
        rotate = new Rotate();
        scale = new Scale(scaleFactor, scaleFactor);
        reflect = new Label("Reflection that adds visual sparkle");
        reflection = new Reflection();

        FlowPane root = new FlowPane(15, 15);
        Scene scene = new Scene(root, 300, 175);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(rotateButton, blurButton, scaleButton, reflect);

        // Adding the EventHandler override to the buttons
        rotateButton.setOnAction(this::handle);
        blurButton.setOnAction(this::handle);
        scaleButton.setOnAction(this::handle);

        primaryStage.setScene(scene);
        primaryStage.show();

        // Set up the transformations
        rotateButton.getTransforms().add(rotate);
        scaleButton.getTransforms().add(scale);
        reflection.setTopOpacity(0.2);
        reflection.setBottomOpacity(0.8);

        // Use the label and apply the reflection effect
        reflect.setEffect(reflection);
    }

    @Override
    public void handle(Event event) {

        if (event.getSource().equals(rotateButton)){
            angle += 15.0;
            rotate.setAngle(angle);
            rotate.setPivotX(rotateButton.getWidth() / 2);
            rotate.setPivotY(rotateButton.getHeight() / 2);
        }

        if (event.getSource().equals(blurButton)){
            if (blurVal == 10.0){
                blurVal = 1.0;
                blurButton.setEffect(null);
                blurButton.setText("Blur off");
            }
            else {
                blurVal++;
                blurButton.setEffect(blur);
                blurButton.setText("Blur on");
            }
            blur.setWidth(blurVal);
            blur.setHeight(blurVal);
        }

        if (event.getSource().equals(scaleButton)){
            scaleFactor += 0.1;
                if (scaleFactor > 2.0) scaleFactor = 1.0;
            scale.setX(scaleFactor);
            scale.setY(scaleFactor);
            //scale.setPivotX(scaleFactor);
            //scale.setPivotY(scaleFactor);

        }
    }


    public static void main(String[] args) {

        launch(args);
    }

}
