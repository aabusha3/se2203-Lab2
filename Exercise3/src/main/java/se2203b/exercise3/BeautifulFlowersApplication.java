package se2203b.exercise3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class BeautifulFlowersApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BeautifulFlowersApplication.class.getResource("BeautifulFlowers-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Beautiful Flowers");
        stage.getIcons().add(new Image("file:src/main/resources/se2203b/exercise3/WesternLogo.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}