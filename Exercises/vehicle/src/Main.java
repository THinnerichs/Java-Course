public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle Class Test");
        Vehicle vehicle = new Vehicle(4, 1, 10, 500);
        vehicle.inflateWheels();
        vehicle.Enter();
        vehicle.speedUp();
        vehicle.Breake();
        vehicle.Leave();

        String test = "Datum";
        switch (test) {
            case "Datum": test = "19.2";
                break;
            default:
                test = "2";
        }
        System.out.println(test);
    }
}
