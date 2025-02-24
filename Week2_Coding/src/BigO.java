import java.util.*;

public class BigO {
    public static void main(String[] args) {
        int n = 10;

        // Create a map associating Big-O notation with its computed value for input n.
        Map<String, Integer> map = new HashMap<>();
        map.put("O(1)", bigO_1(n));
        map.put("O(log n)", bigO_logN(n));
        map.put("O(n)", bigO_N(n));
        map.put("O(n log n)", bigO_nlog(n));
        map.put("O(n^2)", bigO_squared(n));
        map.put("O(2^n)", bigO_2_powered(n));
        map.put("O(n!)", bigO_factorial(n));

        // Sort the map entries by the computed value (ascending order).
        List<Map.Entry<String, Integer>> sortedMap = new ArrayList<>(map.entrySet());
        Collections.sort(sortedMap, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return Integer.compare(e1.getValue(), e2.getValue());
            }
        });

        System.out.println("Big O Values for n = " + n + ":");
        for (Map.Entry<String, Integer> entry : sortedMap) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static int bigO_1(int input) {
        return 1;
    }

    private static int bigO_logN(int input) {
        return (int) Math.log(input);
    }

    private static int bigO_N(int input) {
        return input;
    }

    private static int bigO_nlog(int input) {
        return (int) (input * Math.log(input));
    }

    private static int bigO_squared(int input) {
        return (int) input * input;
    }

    private static int bigO_2_powered(int input) {
        return (int) Math.pow(2, input);
    }

    private static int bigO_factorial(int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

