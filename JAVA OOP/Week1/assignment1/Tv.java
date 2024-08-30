package assignment1;

public class Tv {
    private String brand;
    private int screenSize;
    private String resolution;

    public Tv (String brand,int screenSize,String resolution){
        this.brand = brand;
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public void turnOn(){
        System.out.println("TV is now on");
    }
    public void turnOff(){
        System.out.println("TV is now off");
    }
    public void changeChannel(int chanel){
    System.out.println("Channel changed to "+chanel);
    
    }
    public void adjustVolume(int volume){
        System.out.println("Setting volume to" +volume);   
    }
    public void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Screen size: "+screenSize+" inches");
        System.out.println("Resolution: "+resolution);
    }

}
