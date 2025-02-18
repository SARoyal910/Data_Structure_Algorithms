public class transpose {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int M = array.length;       // Number of rows
        int N = array[0].length;    // Number of columns

        System.out.println("Original Array:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Array:");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//1.1.13

