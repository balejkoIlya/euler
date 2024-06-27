package euler.problem47;

public class EulerFortySeven {
    public static void main(String[] args) {
        System.out.println(findConsecutiveNumbers(4));
    }
    public static int distinctPrimeFactors(int n) {
        int count = 0;
        if (n % 2 == 0) {
            count++;
            while (n % 2 == 0) {
                n /= 2;
            }
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                count++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 2) {
            count++;
        }
        return count;
    }

    public static int findConsecutiveNumbers(int count) {
        int consecutiveCount = 0;
        int number = 2;
        while (consecutiveCount < count) {
            if (distinctPrimeFactors(number) == count) {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
            number++;
        }
        return number - count;
    }
}
