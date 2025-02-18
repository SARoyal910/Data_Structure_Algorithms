public class boolArray2D {
    public static void main(String[] args) {

        boolean[][] array = {
                {true, false, true},
                {false, true, false},
                {true, true, true}
        };

        int rows = array.length;
        int cols = array[0].length;

        // Print column numbers
        System.out.print("    ");
        for (int j = 0; j < cols; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Print array contents
        for (int i = 0; i < rows; i++) {
            System.out.print(i + "   "); // Print row number
            for (int j = 0; j < cols; j++) {
                if (array[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
//1.1.11
