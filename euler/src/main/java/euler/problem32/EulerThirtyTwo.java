package euler.problem32;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class EulerThirtyTwo {
    public static void main(String[] args) {
        Set<Integer> pandigitals = new HashSet<>();

        for (int a = 1; a < 100; a++) {
            for (int b = a; b < 10000; b++) {
                int product = a * b;
                String str = "" + a + b + product;
                if (isPandigital(str)) {
                    pandigitals.add(product);
                }
            }
        }

        int sum = 0;
        for (int i : pandigitals) {
            sum += i;
        }

        System.out.println(sum);
    }

    private static boolean isPandigital(String str) {
        if (str.length() != 9) {
            return false;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars).equals("123456789");
    }
}

