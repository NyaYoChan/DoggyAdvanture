
package doggyadvanture;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

public class Dialog {
//    @FXML
//    private DialogPane dialogPane;
    
   
    
    public Dialog(){
        // something wrong
//        String filePath = "src\\doggyadvanture\\text.txt";
//        String filePath = getClass().getResource("text.txt").toString();
//        filePath = filePath.substring(10, filePath.length());
//        String filePath = "C:\\Users\\user\\Desktop\\DoggyAdvanture-main\\DoggyAdvanture\\src\\doggyadvanture\\text.txt";
//        URL is = getClass().getResource(filePath);
//        is.getFile();
//        File file = new File(filePath);
//        File file = new File("src\\doggyadvanture\\text.txt");
        
        
    }
    
    public String readfile(String filePath){
        try{
            File file = new File(filePath);
            FileReader reader = new FileReader(file);
            int ch = 0;
            String context = "";
            while((ch = reader.read()) != -1){
//                System.out.print((char)ch);
                context += (char)ch;
            }
            reader.close();
            return context;
        }catch(Exception e){
            System.out.println(e);
        }
        return "-1";
    }
    
    public void showDialog(TextArea dialogTextArea, String path){
        try{
            File file = new File(path);
            FileReader reader = new FileReader(file);
            int ch = 0;
            String context = "";
            final String context_copy;
            while((ch = reader.read()) != -1){
//                System.out.print((char)ch);
                context += (char)ch;
                
            }
            reader.close();
            
            context_copy = context;
            KeyFrame start = new KeyFrame(Duration.ZERO, new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    dialogTextArea.clear();
                }

            });
            
            KeyFrame end = new KeyFrame(Duration.millis(3000), new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    dialogTextArea.appendText(context_copy);
                }

            });

            Timeline t = new Timeline();
            t.getKeyFrames().addAll(start, end);
            t.setCycleCount(1);
            t.play();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
