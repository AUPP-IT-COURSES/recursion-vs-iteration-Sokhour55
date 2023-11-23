public class recursion {

    public static void main(String[] args) {
        double x = 5.0;
        int n = 8;
        double result = power(x, n);
        System.out.println(result);
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

}
