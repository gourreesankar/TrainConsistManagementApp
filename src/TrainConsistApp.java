import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
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
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        System.out.println("Unique Bogie IDs: " + bogieIds);
        System.out.println("Total unique bogies: " + bogieIds.size());

        // UC4: LinkedList for ordered train consist
        System.out.println("\n--- UC4: Ordered Train Consist using LinkedList ---");
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial Train Consist: " + trainConsist);
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);
        trainConsist.removeFirst();
        System.out.println("After removing first bogie: " + trainConsist);
        trainConsist.removeLast();
        System.out.println("After removing last bogie: " + trainConsist);
        System.out.println("Final Train Consist: " + trainConsist);

        // UC5: LinkedHashSet for ordered unique train formation
        System.out.println("\n--- UC5: Ordered Unique Train Formation using LinkedHashSet ---");
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");
        System.out.println("Train Formation (insertion order preserved): " + trainFormation);
        System.out.println("Total bogies in formation: " + trainFormation.size());

        // UC6: HashMap for bogie-capacity mapping
        System.out.println("\n--- UC6: Bogie Capacity Mapping using HashMap ---");
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Map each bogie to its capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 64);
        bogieCapacity.put("First Class", 18);

        // Iterate and display
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("  Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }
        System.out.println("Total bogie types mapped: " + bogieCapacity.size());

        System.out.println("Program continues...");
    }
}