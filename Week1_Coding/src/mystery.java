public class mystery {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println("Product: " + mystery(a, b));
        System.out.println("Quotient: " + mystery2(a, b));

    }
        public static int mystery ( int a, int b)
        {
            if (b == 0) return 0;
            if (b % 2 == 0) return mystery(a + a, b / 2);
            return mystery(a + a, b / 2) + a;
        } //returns a * b

        public static int mystery2(int a, int b) {
            if (b == 0) return 1;
            if (b % 2 == 0) return mystery2(a*a, b/2);
            return mystery2(a*a, b/2) * a;
        } //returns a^b
}
