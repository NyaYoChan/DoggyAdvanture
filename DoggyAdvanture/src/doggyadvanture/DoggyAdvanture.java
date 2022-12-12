package doggyadvanture;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class DoggyAdvanture extends Application {
    final long timeInterval = 17;
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_1.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        
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
                try{
                 Thread.sleep(timeInterval);
                }catch(Exception e){
                    e.printStackTrace();
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
        stage.setTitle("DoggyAdvanture");
        stage.setScene(scene);
        stage.show();
        
//        stage.setOnCloseRequest(new EventHandler<WindowEvent>(){
//            @Override
//            public void handle(WindowEvent event){
////                timer.terminate();
//                
//            }
//    
//        });
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    
}
