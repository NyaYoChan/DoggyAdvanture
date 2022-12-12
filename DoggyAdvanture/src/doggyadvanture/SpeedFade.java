package doggyadvanture;

public class SpeedFade extends Thread{
    static boolean running = true;
    boolean waiting;
    Controller controller;
    
    // close to 60fps
    final long timeInterval = 17;
    
    SpeedFade(Controller controller){
        this.controller = controller;
        this.setDaemon(true);
        this.waiting = true;
    }
    
    public static void terminate(){
        running = false;
    }
    
    public void run(){
        while(running){
            // if notthing to do seems doesn't work
            System.out.print("");
            if(!this.waiting){
                this.controller.curSpeed += 0.5;
                try{
                    Thread.sleep(this.timeInterval);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    
}
