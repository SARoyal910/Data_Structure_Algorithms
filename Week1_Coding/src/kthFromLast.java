import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kthFromLast {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer k on command-line.");
            return;
        }

        int k = Integer.parseInt(args[0]);
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings (press Ctrl+D to end input):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            queue.add(input);

            // Keep the queue size at k by removing the front element if it exceeds
            if (queue.size() > k) {
                queue.remove();
            }
        }
        
        if (queue.size() < k) {
            System.out.println("Not enough strings entered.");
        } else {
            System.out.println("The " + k + "th from the last string is: " + queue.remove());
        }
    }
}
//1.3.15

