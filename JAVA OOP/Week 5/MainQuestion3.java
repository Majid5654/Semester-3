public class MainQuestion3 {
    public static void main(String[] args) {
        
        Employee machinist = new Employee("1234", "Spongebob squarepants");
        Employee assistant = new Employee("4567", "Patrick Star");
        Railway railway = new Railway("gaya baru", "Bisnis", machinist,assistant);
        
        System.out.println(railway.info());
        
    }
}
