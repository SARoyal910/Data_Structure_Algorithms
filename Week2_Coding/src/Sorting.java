import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String[] books = {
                "The Great Gatsby",
                "1984",
                "To Kill a Mockingbird",
                "A Tale of Two Cities",
                "Moby Dick"
        };

        System.out.println("Original book titles: " + Arrays.toString(books));
        selectionSort(books);
        System.out.println("\nSorted book titles: " + Arrays.toString(books));
    }

    // Selection sort with debug output for sorting String arrays.
    private static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            // Swap arr[i] with arr[min]
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }
}

