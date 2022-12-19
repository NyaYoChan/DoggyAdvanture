package doggyadvanture;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    
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
