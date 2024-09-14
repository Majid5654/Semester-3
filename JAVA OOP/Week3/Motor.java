public class Motor {
    private int speed = 0;
    private boolean motorOn=false;
    private int MaxSpeed=100;

    public void startEngine(){
        motorOn=true;
    }

    public void turnOffEngine(){
        motorOn=false;
        speed=0;
    }

    public void increaseEngine(){
        if (motorOn ==true) {
            if (speed + 5 <= MaxSpeed) {
                speed += 5;
            } else {
                speed = MaxSpeed;
                System.out.println("Speed is at maximum limit: " + MaxSpeed);
        }
    }
        
        else{
            System.out.println("speed cant increas because motor off");
        }
    }
    
    
    public void reduceEngine(){
        if (motorOn == true) {
            speed-=5;
        }
        else{
            System.out.println("Motor cycle off");
        }
        
    }
    
    
    public void statusPrint(){
        if (motorOn==true) {
            System.out.println("Motor cycle on");
        }
    
        else{
            System.out.println("Motor cycle off");
        }
        System.out.println("Speed: " +speed+"\n");
    }
}
