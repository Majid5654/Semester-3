public class Car {
    private String brand;
    private int cost;

    public Car (){

    }

    public Car(String brand,int cost){
        this.brand = brand;
        this.cost = cost;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public int carCostCalculation(int days){
        return cost * days;
    }

    


}
