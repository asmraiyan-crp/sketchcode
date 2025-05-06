import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TextArea editor = new TextArea("Welcome to the Collaborative IDE");
        BorderPane root = new BorderPane(editor);
        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Collaborative IDE - Python & C++");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
