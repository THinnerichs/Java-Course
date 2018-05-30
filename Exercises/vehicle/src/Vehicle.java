public class Vehicle {
    private Seat[] seats;
    private Wheel[] wheels;

    private int max_speed = 200;
    private double speed = 0.0;
    private int weight = 1300;

    public Vehicle(int wheels, int seats, int max_speed, int weight) {
        this.seats = new Seat[seats];
        this.wheels = new Wheel[wheels];
        this.max_speed = max_speed;
        this.weight = weight;

        for(int i = 0; i < wheels; i++){
            this.wheels[i] = new Wheel(20, 0,12, Wheel.COLOR_BLACK);
        }
        for(int i = 0; i < seats; i++){
            this.seats[i] = new Seat();
        }
    }

    public int getFreeSeats() {
        int free_seats = 0;
        for(int i = 0; i < seats.length; i++){
            if(!seats[i].isOccupied()) {
                free_seats++;
            }
        }
        return free_seats;
    }

    public boolean Enter() {
        for(int i = 0; i < seats.length; i++){
            Seat seat = seats[i];
            if(!seat.isOccupied()) {
                seats[i].Sit();
                return true;
            }
        }
        return false;
    }

    public boolean Leave() {
        for(int i = 0; i < seats.length; i++) {
            if(seats[i].isOccupied()) {
                seats[i].StandUp();
                return true;
            }
        }
        return false;
    }

    public void speedUp() {
        if(speed < max_speed) {
            speed++;
        }
    }

    public void Breake() {
        if(speed > 0) {
            speed--;
        }
    }

    public void inflateWheels() {
        for(int i = 0; i < wheels.length; i++){
            Wheel wheel = wheels[i];
            while (wheel.getPressure() < wheel.getMaxPressure()) {
                wheel.pumpUp();
            }
            wheels[i] = wheel;
        }
    }


    public int getMaxSpeed() {
        return max_speed;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }
}
