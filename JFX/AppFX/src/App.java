import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Button btn = new Button();
        // btn.setText("Say 'Hello World'");
        // btn.setOnAction(event -> System.out.println("Hello World!"));

        // StackPane root = new StackPane();
        // root.getChildren().add(btn);
        // Scene scene = new Scene(root, 300, 250);

        try {
            Parent root = FXMLLoader.load(getClass().getResource("FxmlScene.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
