package euler.problem35;

public class EulerThirtyFive {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 3; i < 1_000_000; i+=2) {
            if (isCircularPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isCircularPrime(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (!isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i)))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(long k) {
        if (k < 2) return false;
        if (k == 2) return true;
        if (k % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(k); i += 2) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
