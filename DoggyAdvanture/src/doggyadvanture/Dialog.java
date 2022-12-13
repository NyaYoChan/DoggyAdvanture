
package doggyadvanture;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;

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
}
