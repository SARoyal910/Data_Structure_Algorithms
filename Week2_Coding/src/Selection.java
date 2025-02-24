public class Selection {

    public static void main(String[] args) {

        char[] a = {'A', 'Q', 'b', 'Z', 'i', 'O', 'L', 'A', 'R', 'x', 'a'};
        sort(a);
        System.out.println("Sorted array: " + String.valueOf(a));
    }
    // Sorts the array into ascending order and prints debug output
    public static void sort(char[] a) {
        int N = a.length;
        System.out.println("Initial array: " + String.valueOf(a));


        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
            System.out.println("After pass " + i + ": " + String.valueOf(a));
        }
    }

    private static boolean less(char v, char w) {
        return v < w;
    }

    private static void exch(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}

