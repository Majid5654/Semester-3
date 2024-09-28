public class MainExperiment1 {
    public static void main(String[] args) {
        
        Processor p = new Processor("Intel i5", 3);
        Computer L = new Computer("Thinkpad", p);
        
        L.info();

        Processor p1 = new Processor();
        p1.setBrand("Intel i5");
        p1.setCache(4);

        Computer c1 = new Computer();
        c1.setBrand("Thinkpad");
        c1.setProc(p1); 
        c1.info();
        
        
        
        
    }
}
