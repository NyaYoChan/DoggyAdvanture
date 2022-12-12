package doggyadvanture;

import javafx.scene.image.ImageView;

public class Collide {
    public static boolean AABB(ImageView obj_1, ImageView obj_2){
        double maxX_1 = obj_1.getLayoutX() + obj_1.getFitWidth();
        double minX_1 = obj_1.getLayoutX();
        double maxX_2 = obj_2.getLayoutX() + obj_2.getFitWidth();
        double minX_2 = obj_2.getLayoutX();
        double maxY_1 = obj_1.getLayoutY() + obj_1.getFitHeight();
        double minY_1 = obj_1.getLayoutY();
        double maxY_2 = obj_2.getLayoutY() + obj_2.getFitHeight();
        double minY_2 = obj_2.getLayoutY();
        
        if(maxX_1 > minX_2 && maxX_2 > minX_1 && maxY_1 > minY_2 && maxY_2 > minY_1){
            
            return true;
        }
        return false;
    }
}
