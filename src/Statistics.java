public class Statistics {
    public static double binompdf(int n, double p, int x) {
        return Probability.ncr(n, x) * Math.power(p, x) * Math.power((1 - p), (n - x));
    }

    public static double binomcdf(int n, double p, int l, int u) {
        return binompdf(n, p, u) - binompdf(n, p, l);
    }
}
