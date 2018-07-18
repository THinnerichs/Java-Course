import java.util.*;

public class Main {
    public static void main(String[] args) {

        AuthenticationSystem authenticationSystem = new AuthenticationSystem();
        authenticationSystem.load("test_set.txt");
        authenticationSystem.register("Andrea", "Meister");
        authenticationSystem.save("test_set2.txt");
        authenticationSystem.saveObjs("test_set.dat");

        //Employee9934170;5927181
        authenticationSystem = new AuthenticationSystem();

        authenticationSystem.loadObjs("test_set.dat", 10000);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            System.out.println("Test: " + input);
        }

    }
}
