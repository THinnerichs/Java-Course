public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle Class Test");
        Vehicle vehicle = new Vehicle(4, 1, 10, 500);
        vehicle.inflateWheels();
        vehicle.Enter();
        vehicle.speedUp();
        vehicle.Breake();
        vehicle.Leave();
    }
}
