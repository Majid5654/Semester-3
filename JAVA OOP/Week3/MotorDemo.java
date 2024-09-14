public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.statusPrint();
        motor.increaseEngine();

        motor.startEngine();
        motor.statusPrint();

        for (int i = 0; i < 21; i++) {
            motor.increaseEngine();
            motor.statusPrint();
        }
        
        

        motor.turnOffEngine();
        motor.statusPrint();

    }
}
