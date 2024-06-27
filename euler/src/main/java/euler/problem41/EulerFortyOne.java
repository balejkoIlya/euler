package euler.problem41;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EulerFortyOne {
    public static void main(String[] args) {
        System.out.println(findLargestPandigitalPrime());
    }
    public static int findLargestPandigitalPrime() {
        for (int n = 9; n >= 1; n--) {
            String digits = "";
            for (int i = 1; i <= n; i++) {
                digits += i;
            }

            List<String> permutations = generatePermutations(digits);
            permutations.sort(Comparator.reverseOrder());
            for (String perm : permutations) {
                int num = Integer.parseInt(perm);
                if (isPrime(num)) {
                    return num;
                }
            }
        }
        return -1;
    }
    public static List<String> generatePermutations(String str) {
        List<String> results = new ArrayList<>();
        permute("", str, results);
        return results;
    }

    private static void permute(String prefix, String str, List<String> results) {
        int n = str.length();
        if (n == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), results);
            }
        }
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
