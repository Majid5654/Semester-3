public class Motor {
    public int speed = 0;
    public boolean motorOn=false;

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
