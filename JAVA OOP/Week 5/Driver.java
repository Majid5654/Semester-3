public class Driver {
    private String name;
    private int cost;

    public Driver() {
        
    }

    public Driver(String name,int cost){
        this.name = name;
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    
    public int driverCostCalculation(int days) {
        return cost * days;

        
    }
    
}
