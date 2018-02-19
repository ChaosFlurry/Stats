public class Math {
    public static double power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static double power(double x, double n) {
        return java.lang.Math.pow(x, n);
    }
}
