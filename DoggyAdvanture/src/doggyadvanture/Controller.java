/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doggyadvanture;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class Controller implements Initializable {
    
    @FXML
    private ImageView Doggy_ImageView;
    @FXML
    private ImageView Korone_ori_ImageView;
    
    @FXML
    private DialogPane dialogPane;
    
    Doggy doggy = new Doggy();
    
    double curSpeed = 0;
    double limitSpeed = 20;
//    SpeedFade speedFade = new SpeedFade(this);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        doggy.init(Doggy_ImageView);
//        speedFade.start();
        dialogPane.getContent().setVisible(false);
    }    
    
    public void moveUp(){
//        double curY = Doggy_ImageView.getY();
//        Doggy_ImageView.setY(curY-this.limitSpeed);
        double curY = Doggy_ImageView.getLayoutY();
        Doggy_ImageView.setLayoutY(curY-this.limitSpeed);
    }
    
    // Use SpeedFade
//    public void moveUp(boolean keyReleased){
//        if(!keyReleased){
//            if(this.curSpeed < this.limitSpeed){
//                if(speedFade.waiting){
//                    speedFade.waiting = false;
//                }
//                
//                // need to move function of changing position to thread 
//                double curY = Doggy_ImageView.getY();
//                System.out.println(curY);
//                Doggy_ImageView.setY(curY-this.curSpeed);
//                System.out.println(curY);
//            }else{
//                speedFade.waiting = true;
//                
//                double curY = Doggy_ImageView.getY();
//                System.out.println(curY);
//                Doggy_ImageView.setY(curY-this.limitSpeed);
//                System.out.println(curY);
//            }
//        }else{
//            this.curSpeed = 0;
//            speedFade.waiting = true;
//        }
//    }
    
    public void moveDown(){
//        double curY = Doggy_ImageView.getY();
//        Doggy_ImageView.setY(curY+this.limitSpeed);
        double curY = Doggy_ImageView.getLayoutY();
        Doggy_ImageView.setLayoutY(curY+this.limitSpeed);
    }
    
        // Use SpeedFade
//    public void moveDown(boolean keyReleased){
//        if(!keyReleased){
//            if(this.curSpeed < this.limitSpeed){
//                if(speedFade.waiting){
//                    speedFade.waiting = false;
//                }
//                
//                
//                double curY = Doggy_ImageView.getY();
//                System.out.println(curY);
//                Doggy_ImageView.setY(curY+this.curSpeed);
//                System.out.println(curY);
//            }else{
//                speedFade.waiting = true;
//                
//                double curY = Doggy_ImageView.getY();
//                System.out.println(curY);
//                Doggy_ImageView.setY(curY+this.limitSpeed);
//                System.out.println(curY);
//            }
//        }else{
//            this.curSpeed = 0;
//            speedFade.waiting = true;
//        }
//    }
    
    public void moveLeft(){
//        double curX = Doggy_ImageView.getX();
//        Doggy_ImageView.setX(curX-10);
        double curX = Doggy_ImageView.getLayoutX();
        Doggy_ImageView.setLayoutX(curX-this.limitSpeed);
    }
    
    public void moveRight(){
//        double curX = Doggy_ImageView.getX();
//        Doggy_ImageView.setX(curX+10);
        double curX = Doggy_ImageView.getLayoutX();
        Doggy_ImageView.setLayoutX(curX+this.limitSpeed);
    }
    
    public void checkCollide(){
       if( Collide.AABB(Doggy_ImageView, Korone_ori_ImageView)){
           showDialog();
       }
    }
    
    public void showDialog(){
        dialogPane.getContent().setVisible(true);
        Dialog dialog = new Dialog();
    }
}
