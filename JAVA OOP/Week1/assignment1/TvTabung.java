package assignment1;

public class TvTabung extends Tv{
    private int tubeDiameter;
    private int ProductionYear;

    public TvTabung(String brand,int screenSize,String resolution,int tubeDiameter,int ProductionYear){
        super(brand,screenSize,resolution);
        this.tubeDiameter = tubeDiameter;
        this.ProductionYear=ProductionYear;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tube Diameter: " + tubeDiameter + " inches");
        System.out.println("Production Year : "+ProductionYear);
        
    }

    public void adjustContrast(int level) {
        System.out.println("Adjusting contrast to " + level + ".");
    }
}
