package euler.problem23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EulerTwentyThree {
    public static void main(String[] args) {
        List<Integer> listAbundant = new ArrayList<>();
        for (int i = 11; i <= 28123; i++) {
            if (isAbundant(i)) {
                listAbundant.add(i);
            }
        }
        boolean[] canBeWrittenAsAbundantSum = new boolean[28124];

        for (int i = 0; i < listAbundant.size(); i++) {
            for (int j = 0; j < listAbundant.size(); j++) {
                int abundantSum = listAbundant.get(i) + listAbundant.get(j);
                if (abundantSum <= 28123) {
                    canBeWrittenAsAbundantSum[abundantSum] = true;
                }
            }
        }

        long nonAbundantSum = 0;
        for (int i = 1; i <= 28123; i++) {
            if (!canBeWrittenAsAbundantSum[i]) {
                nonAbundantSum += i;
            }
        }
        System.out.println(nonAbundantSum);
    }

    public static boolean isAbundant(int j) {
        return j < sumDivisors(j);
    }

    public static int sumDivisors(int k) {
        int sum = 0;
        for (int i = 1; i <= k / 2 + 1; i++) {
            if (k % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
