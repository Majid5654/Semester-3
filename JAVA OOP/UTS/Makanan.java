import java.util.List;
public class Makanan {
    private String name;
    private double price;
    private int timeCook;
    private List<String> ingredient;

    public Makanan(String name, double price, int timeCook, List<String> ingredient) {
        this.name = name;
        this.price = price;
        this.timeCook = timeCook;
        this.ingredient = ingredient;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTimeCook() {
        return timeCook;
    }

    public List<String> getIngredient() {
        return ingredient;
    }
    
}
