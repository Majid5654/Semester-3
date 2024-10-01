public class MainQuestion3 {
    public static void main(String[] args) {
        
        Employee machinist = new Employee("1234", "Spongebob squarepants");
        Railway railway = new Railway("gaya baru", "Bisnis", machinist);
        System.out.println(railway.info());
        
    }
}
