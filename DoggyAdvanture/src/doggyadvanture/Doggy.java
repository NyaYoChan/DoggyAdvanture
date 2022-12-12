package doggyadvanture;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Doggy {
    Image doggy_image = new Image(getClass().getResourceAsStream("/Asset/images/Korone.png"));
    
    double width = 140;
    double height = 150;
    
    public void init(ImageView Doggy_ImageView){
        Doggy_ImageView.setPreserveRatio(false);
        Doggy_ImageView.setImage(this.doggy_image);
        Doggy_ImageView.setFitWidth(this.width);
        Doggy_ImageView.setFitHeight(this.height);
    }
}
