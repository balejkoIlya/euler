package euler.problem43;

import java.util.ArrayList;
import java.util.List;

public class EulerFortyThree {
    public static void main(String[] args) {
        long sum = 0;
        List<String> pandigitalNumbers = generatePandigitalPermutations();
        for (String numberStr : pandigitalNumbers) {
            if (checkDivisibilityProperties(numberStr)) {
                sum += Long.parseLong(numberStr);
            }
        }

        System.out.println(sum);
    }
    public static List<String> generatePandigitalPermutations() {
        List<String> permutations = new ArrayList<>();
        boolean[] used = new boolean[10];
        generatePermutations("", used, permutations);
        return permutations;
    }
    public static void generatePermutations(String current, boolean[] used, List<String> permutations) {
        if (current.length() == 10) {
            permutations.add(current);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!used[i]) {
                used[i] = true;
                generatePermutations(current + i, used, permutations);
                used[i] = false;
            }
        }
    }
    public static boolean checkDivisibilityProperties(String numberStr) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        for (int i = 1; i <= 7; i++) {
            int substr = Integer.parseInt(numberStr.substring(i, i + 3));
            if (substr % primes[i - 1] != 0) {
                return false;
            }
        }
        return true;
    }
}
