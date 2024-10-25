public class Chef extends Employee {

    public Chef(String name, String task) {
        super(name, task);
    }

    @Override
    public void DoTask() {
        System.out.println("Chef " + getName() + " is cooking.");
    }

    public void cook(Makanan makanan) {
        System.out.println("Cooking " + makanan.getName() + ". It will take " + makanan.getTimeCook() + " units of time.");
    }
}    

