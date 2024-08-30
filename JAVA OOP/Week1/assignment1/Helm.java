package assignment1;

public class Helm {
    private String brand;
    private String glass;
    private String size;

    public Helm(String brand, String glass, String size) {
        this.brand = brand;
        this.glass = glass;
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Glass: " + glass);
        System.out.println("Size: " + size);
    }

    public void adjustStrap() {
        System.out.println("Strap has been adjusted.");
    }

    public void cleanGlass() {
        System.out.println("Glass has been cleaned.");
    }

    public void putOn() {
        System.out.println("Helm is now on.");
    }
}
