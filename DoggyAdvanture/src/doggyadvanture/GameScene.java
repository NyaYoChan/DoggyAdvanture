package doggyadvanture;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class GameScene {
    public void scene_menu(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Path.SCENE_MENU));
        Parent root = loader.load();
        javafx.scene.Scene scene = new javafx.scene.Scene(root);

        scene.setOnMouseClicked(new EventHandler <MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                try {
                    scene_1(stage);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        scene.setOnKeyPressed(new EventHandler <KeyEvent>(){
            @Override
            public void handle(KeyEvent event){
                try {
                    scene_1(stage);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        stage.setScene(scene);
    }
    
    public void scene_1(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Path.SCENE_1));
        Parent root = loader.load();
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        
        Controller controller = loader.getController();
        scene.setOnKeyPressed(new EventHandler <KeyEvent>(){
            @Override
            public void handle(KeyEvent event){
                controller.checkCollide();
                switch(event.getCode()){
                    case UP:
//                        controller.moveUp(false);
                        controller.moveUp();
                        break;
                    case DOWN:
//                        controller.moveDown(false);
                        controller.moveDown();
                        break;
                    case LEFT:
                        controller.moveLeft();
                        break;    
                    case RIGHT:
                        controller.moveRight();
                        break;    
                    
                }
            }
            
        });
        
//        scene.setOnKeyReleased(new EventHandler <KeyEvent>(){
//            @Override
//            public void handle(KeyEvent event){
//                switch(event.getCode()){
//                    case UP:
////                        controller.moveUp(true);
//                        break;
//                    case DOWN:
////                        controller.moveDown(true);
//                        break;
////                    case LEFT:
////                        controller.moveLeft();
////                        break;    
////                    case RIGHT:
////                        controller.moveRight();
////                        break;    
//                    
//                }
//            }
//            
//        });
        stage.setScene(scene);
    }
}
