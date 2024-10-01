public class MainExperiment2 {
    public static void main(String[] args) {
       
        Car c = new Car();
        c.setBrand("Avanza");
        c.setCost(350000);

        
        Driver d = new Driver();
        d.setName("John Doe");
        d.setCost(200000);

       
        Customer cust = new Customer();
        cust.setName("Jane Doe");
        cust.setCar(c);
        cust.setDriver(d);
        cust.setDay(2);

        System.out.println("List payment travel: ");
        System.out.println("Customer Name: " + cust.getName());
        System.out.println("Brand: " +cust.getCar().getBrand());
        System.out.println("Price car " +c.getCost());
        System.out.println("Price for car for " + cust.getDay() + " days: " + c.carCostCalculation(cust.getDay()));
        
        System.out.println("Price for driver "+d.driverCostCalculation(2));
        System.out.println("--------------------------");
        System.out.println("Total cost = " + cust.totalCostCalculation());
    }
}
