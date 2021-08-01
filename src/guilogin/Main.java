package guilogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @Author Youmeng Hin
 * @Version 1.0
 */
public class Main extends Application {

    public static void main(String[] args) {launch(args);}

    //Sets up the stage and scene
    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image("icon.jpg");

        stage.setScene(scene);
        stage.setTitle("Authorize");
        stage.getIcons().add(icon);
        stage.show();

    }
}
