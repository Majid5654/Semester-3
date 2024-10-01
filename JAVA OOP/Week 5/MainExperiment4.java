public class MainExperiment4 {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("12345", "Mr. Krab");
        Passenger p2 = new Passenger("125", "Budi");
        Passenger p3 = new Passenger("456", "Majid");
        Carriage carriage = new Carriage("A", 10);
        carriage.setPassenger(p1, 1);
        carriage.setPassenger(p2, 1);
        carriage.setPassenger(p3, 2);
        System.out.println(carriage.info());
        
        
    }
}
