package euler.problem27;

public class EulerTwentySeven {
    public static void main(String[] args) {
        findNumber();


    }

    public static void findNumber() {
        int max = 0;
        int max_a = 0;
        int max_b = 0;
        for (int a = -999; a < 1000; a++) {
            for (int b = -1000; b <= 1000; b++) {
                int n = 0;
                while (isPrime(func(n, a, b))) {
                    n++;
                }
                if (n > max) {
                    max = n;
                    max_a = a;
                    max_b = b;
                }
                n = 0;
            }
        }
        System.out.println(max_a * max_b);
    }

    public static int func(int n, int a, int b) {
        return n * n + a * n + b;
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
