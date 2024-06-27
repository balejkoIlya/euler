package euler.problem37;

import java.util.ArrayList;
import java.util.List;

public class EulerThirtySeven {
    public static void main(String[] args) {
        List<Integer> truncatablePrimes = findTruncatablePrimes();
        System.out.println(calculateSum(truncatablePrimes));
    }

    public static List<Integer> findTruncatablePrimes() {
        List<Integer> truncatablePrimes = new ArrayList<>();
        int num = 11;
        while (truncatablePrimes.size() < 11) {
            if (isPrime(num) && isTruncatablePrime(num)) {
                truncatablePrimes.add(num);
            }
            num++;
        }

        return truncatablePrimes;
    }

    public static boolean isTruncatablePrime(int num) {
        String str = String.valueOf(num);
        for (int i = 1; i < str.length(); i++) {
            if (!isPrime(Integer.parseInt(str.substring(i)))) {
                return false;
            }
        }
        for (int i = 1; i < str.length(); i++) {
            if (!isPrime(Integer.parseInt(str.substring(0, str.length() - i)))) {
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

    public static int calculateSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
