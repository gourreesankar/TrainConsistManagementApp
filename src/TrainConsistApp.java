import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2: ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("Passenger Bogies after addition: " + passengerBogies);
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger Bogies after removing AC Chair: " + passengerBogies);
        System.out.println("Contains Sleeper: " + passengerBogies.contains("Sleeper"));
        System.out.println("Final Bogie List: " + passengerBogies);

        // UC3: HashSet for unique bogie IDs
        System.out.println("\n--- UC3: Unique Bogie ID Enforcement ---");
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs including duplicates
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate - will be ignored
        bogieIds.add("BG102"); // duplicate - will be ignored

        // Display unique IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);
        System.out.println("Total unique bogies: " + bogieIds.size());

        System.out.println("Program continues...");
    }
}