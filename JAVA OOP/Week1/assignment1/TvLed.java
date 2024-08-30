package assignment1;

public class TvLed extends Tv {
    private String operatingSystem;
    private String Memory;
    


    public TvLed(String brand, int screenSize, String resolution,String operatingSystem,String Memory) {
        super(brand, screenSize, resolution);
        this.operatingSystem = operatingSystem;
        this.Memory = Memory;
    }

    public void adjustBrightness(int level) {
        System.out.println("Adjusting brightness to " + level + ".");
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Memory : "+Memory);
        
    }
}


