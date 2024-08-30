package assignment1;

public class Demo {
    public static void main(String[] args) {
        TvLed led1 = new TvLed("Polytron", 43, "4K", "Android","4GB");
        TvTabung tabung1 = new TvTabung("Kaori", 12, "480", 81,2004);

        led1.displayInfo();
        led1.turnOn();
        led1.changeChannel(31);
        led1.adjustBrightness(20);
    

        System.out.println("----------------------------------");
        
        tabung1.displayInfo();
        tabung1.turnOn();
        tabung1.changeChannel(21);
        tabung1.adjustContrast(50);

        System.out.println("----------------------------------");

        //not inheritance

        SepedaMotor motor1 = new SepedaMotor("Yamaha", "150cc", 2, 2018);

        motor1.displayInfo();
        motor1.startEngine();
        motor1.accelerate();
        motor1.stopEngine();

        System.out.println("----------------------------------");

        Helm helm1 = new Helm("KYT", "clear", "L");
        helm1.displayInfo();
        helm1.putOn();
        helm1.adjustStrap();
        helm1.cleanGlass();


    }
}
