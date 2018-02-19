public class Probability {
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static int npr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int ncr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
