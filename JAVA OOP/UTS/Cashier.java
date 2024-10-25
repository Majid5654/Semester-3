public class Cashier extends Employee {
    
    public Cashier(String name, String task) {
        super(name, task);
    }

    @Override
    public void DoTask() {
        System.out.println("Cashier " + getName() + " is handling payment.");
    }

    public void processPayment(double amount) {
        System.out.println("Payment processed for amount: " + amount);
    }
}
