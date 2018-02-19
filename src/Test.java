public class Test {
    public static void main(String[] args) {
        double test;
        test = Probability.factorial(-2);
        System.out.println(test);
        test = Statistics.binompdf(11, 0.25, 8);
        System.out.println(test);
        test = Statistics.binomcdf(15, 0.95, 3, 14);
        System.out.println(test);
    }
}
