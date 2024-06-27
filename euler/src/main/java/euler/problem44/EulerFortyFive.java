package euler.problem44;

import java.util.HashSet;
import java.util.Set;

public class EulerFortyFive {
    public static void main(String[] args) {
        int minD = Integer.MAX_VALUE;
        Set<Integer> pentagonalsSet = new HashSet<>();
        for (int n = 1; n <= 10000; n++) {
            int pentagonal = n * (3 * n - 1) / 2;
            pentagonalsSet.add(pentagonal);
        }
        for (int k = 2; k <= 10000; k++) {
            int Pk = k * (3 * k - 1) / 2;
            for (int j = k - 1; j >= 1; j--) {
                int Pj = j * (3 * j - 1) / 2;
                int sum = Pj + Pk;
                int diff = Pk - Pj;
                if (pentagonalsSet.contains(sum) && pentagonalsSet.contains(diff)) {
                    if (diff < minD) {
                        minD = diff;
                    }
                }
            }
        }
        System.out.println(minD);
    }
}
