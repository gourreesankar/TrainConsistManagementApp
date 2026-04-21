import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Display welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize an empty List using ArrayList to store bogies dynamically
        List<String> bogies = new ArrayList<>();

        // Display the initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Current bogie count: " + bogies.size());

        System.out.println("Program continues...");
    }
}
