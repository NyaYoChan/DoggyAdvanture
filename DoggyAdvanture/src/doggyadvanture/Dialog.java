
package doggyadvanture;

import java.io.File;
import java.io.FileReader;
import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;

public class Dialog {
    @FXML
    private DialogPane dialogPane;
    
    @FXML
    private Label dialogTextLabel;
    
    public Dialog(){
        // something wrong
//        String filePath = getClass().getResource("text.txt").toString();
//        filePath = filePath.substring(10, filePath.length());
        String filePath = "C:\\Users\\user\\Desktop\\DoggyAdvanture\\src\\doggyadvanture\\text.txt";
        File file = new File(filePath);
        try{
            FileReader reader = new FileReader(file);
            int ch = 0;
            while((ch = reader.read()) != -1){
//                System.out.print((char)ch);
                dialogTextLabel.setText("" + (char)ch);
            }
            reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
