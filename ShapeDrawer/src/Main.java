import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));

        Scene scene = new Scene(root, 300,275);

        stage.setTitle("witam");
        stage.setScene(scene);
        stage.show();

    }
}
