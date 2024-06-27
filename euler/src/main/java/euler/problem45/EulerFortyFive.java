package euler.problem45;

public class EulerFortyFive {
    public static void main(String[] args) {
        long n = 286;
        long triangle;
        while (true) {
            triangle = n * (n + 1) / 2;
            if (isPentagonal(triangle) && isHexagonal(triangle)) {
                System.out.println(triangle);
                break;
            }
            n++;
        }
    }
    public static boolean isPentagonal(long x) {
        double n = (Math.sqrt(24 * x + 1) + 1) / 6;
        return n == (long) n;
    }
    public static boolean isHexagonal(long x) {
        double n = (Math.sqrt(8 * x + 1) + 1) / 4;
        return n == (long) n;
    }
}
