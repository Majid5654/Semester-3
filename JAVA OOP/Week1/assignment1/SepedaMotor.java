package assignment1;

public class SepedaMotor {
        private String brand;
        private String machine;
        private int silinder;
        private int productionYear;
    
        public SepedaMotor(String brand, String machine, int silinder, int productionYear) {
            this.brand = brand;
            this.machine = machine;
            this.silinder = silinder;
            this.productionYear = productionYear;
        }
    
        public void startEngine() {
            System.out.println("Engine is starting...");
        }
    
        public void stopEngine() {
            System.out.println("Engine is stopping...");
        }
    
        public void accelerate() {
            System.out.println("Accelerating...");
        }
    
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Machine: " + machine);
            System.out.println("Silinder: " + silinder);
            System.out.println("Production Year: " + productionYear);
        }
    }
    

