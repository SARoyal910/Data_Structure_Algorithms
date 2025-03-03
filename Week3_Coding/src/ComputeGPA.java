import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ComputeGPA {
    public static void main(String[] args) {
        // Create a symbol table (Map) from letter grades to numeric scores
        Map<String, Double> gradeToGPA = new HashMap<>();
        gradeToGPA.put("A",  4.00);
        gradeToGPA.put("B",  3.00);
        gradeToGPA.put("C",  2.00);
        gradeToGPA.put("D",  1.00);
        gradeToGPA.put("F",  0.00);

        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;

        System.out.println("Type 'q' or press Enter on an empty line to finish.");

        while (true) {
            System.out.print("Enter grade: ");
            String input = scanner.nextLine().trim();

            // Exit loop if user types 'q' or leaves input empty
            if (input.equalsIgnoreCase("q") || input.isEmpty()) {
                break;
            }

            String grade = input.toUpperCase();

            // Process the grade if it's valid
            if (gradeToGPA.containsKey(grade)) {
                sum += gradeToGPA.get(grade);
                count++;
            } else {
                System.out.println("Invalid grade: " + grade);
            }
        }
        scanner.close();

        // Compute and print the GPA if any valid grades were entered
        if (count == 0) {
            System.out.println("No valid grades were entered.");
        } else {
            double gpa = sum / count;
            System.out.printf("GPA: %.2f%n", gpa);
        }
    }
}


