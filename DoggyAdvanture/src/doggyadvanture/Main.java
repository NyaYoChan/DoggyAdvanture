package doggyadvanture;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {
    final long timeInterval = 17;
    
    @Override
    public void start(Stage stage) throws Exception {
        GameScene gameScene = new GameScene();
        gameScene.scene_menu(stage);
        stage.setTitle("DoggyAdvanture");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
