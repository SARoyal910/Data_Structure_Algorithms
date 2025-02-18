public class numToBinary {
    public static void main(String[] args) {
        String s = "";
        int N = 9;
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
    }
}
//1.1.9