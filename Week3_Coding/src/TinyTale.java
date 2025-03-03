import java.util.Map;
import java.util.TreeMap;

public class TinyTale {
    public static void main(String[] args) {

        String text =
                "it was the best of times\n" +
                        "it was the worst of times\n" +
                        "it was the age of wisdom\n" +
                        "it was the age of foolishness\n" +
                        "it was the epoch of belief\n" +
                        "it was the epoch of incredulity\n" +
                        "it was the season of light\n" +
                        "it was the season of darkness\n" +
                        "it was the spring of hope\n" +
                        "it was the winter of despair";

        // Use a TreeMap to store (word -> frequency), sorted by word
        Map<String, Integer> freqMap = new TreeMap<>();

        // Split text on any non-alphabetic characters
        String[] words = text.split("[^a-zA-Z]+");

        // Fill map
        for (String w : words) {
            if (!w.isEmpty()) {
                // Convert to lowercase for counting
                w = w.toLowerCase();
                freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
            }
        }
        // Print each word with its frequency, left-aligned in a 15-char field
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.printf("%-15s %d%n", entry.getKey(), entry.getValue());
        }
    }
}

