package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Test Run"); // Stage is entire window which includes close button, maximize/minimize button, etc.
        button = new Button();
        button.setText("Boop");

        StackPane layout = new StackPane(); // layout is how you want stuff arranged on your screen.
        layout.getChildren().add(button); // what is getChildren?

        Scene scene = new Scene(layout, 300, 250); // Scene is the content inside the stage.
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    } // launch(args) is a method inside the Application class.
}
