public class EggInflation {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec"};


        double[] prices = {3.68, 4.11, 4.13, 4.65, 4.69, 4.77, 4.80, 4.95, 4.89, 5.49, 6.88};

        System.out.println("Monthly Inflation Rates:");

        for (int i = 1; i < prices.length; i++) {
            double inflation = ((prices[i] - prices[i - 1]) / prices[i - 1]) * 100;
            System.out.printf("Inflation from %s to %s: %.2f%%\n", months[i - 1], months[i], inflation);
        }
    }
}

