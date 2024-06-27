package euler.problem48;

import java.math.BigInteger;

public class EulerFortyEight {
    public static void main(String[] args) {
        int limit = 1000;
        BigInteger mod = BigInteger.valueOf(10).pow(10);
        BigInteger sum = BigInteger.valueOf(0);
        for (int k = 1; k <= limit; k++) {
            BigInteger temp = BigInteger.valueOf(k).modPow(BigInteger.valueOf(k), mod);
            sum = sum.add(temp).mod(mod);
        }
        System.out.println(sum);
    }
}
