import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger Bogies after removing AC Chair: " + passengerBogies);

        // Check existence
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));

        // Final state
        System.out.println("Final Bogie List: " + passengerBogies);

        System.out.println("Program continues...");
    }
}