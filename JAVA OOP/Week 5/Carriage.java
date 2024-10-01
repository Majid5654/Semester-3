public class Carriage {
    private String code;
    private Seat[] seats;
    
    private void initSeat() {
        for (int i = 0; i < seats.length; i++) {
            this.seats[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public Carriage(String code, int amount) {
        this.code = code;
        this.seats = new Seat[amount];
        this.initSeat();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setPassenger(Passenger passenger, int number) {
        if (seats[number - 1].getPassenger() == null) {  
            System.out.println("-----------------------------");
            this.seats[number - 1].setPassenger(passenger);
            System.out.println("Passenger " + passenger.getName() + " assigned to seat " + number);
            System.out.println("Succes");
            System.out.println("-----------------------------");
        } else {
            System.out.println("-----------------------------");
            System.out.println("Passenger " + passenger.getName() + " assigned to seat " + number);
            System.out.println("Sorry " +passenger.getName() +" ,Seat " + number + " is already occupied by " + seats[number - 1].getPassenger().getName());
            System.out.println("-----------------------------");
        }
    }

    public Seat[] getSeats() {
        return seats;
    }

    public String info() {
        System.out.println();
        System.out.println("-------Location seat----------");
        String info = "";
        info += String.format("Code: %s %n", code);
        for (Seat seat : seats) {
            info += seat.info();
        }
        return info;
    }
}
