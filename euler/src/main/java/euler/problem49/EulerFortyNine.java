package euler.problem49;

import java.util.ArrayList;
import java.util.Arrays;

public class EulerFortyNine {
    public static void main(String[] args) {
        int[] sequence = findPrimePermutationSequence();
        long concatenatedNumber = concatenateNumbers(sequence);
        System.out.println(concatenatedNumber);
    }

    public static int[] findPrimePermutationSequence() {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 1500; i < 10000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            int prime1 = primes.get(i);
            int prime2 = prime1 + 3330;
            int prime3 = prime2 + 3330;
            if (primes.contains(prime3) && primes.contains(prime2) &&
                    arePermutations(prime1, prime2) && arePermutations(prime1, prime3)) {
                int[] sequence = {prime1, prime2, prime3};
                return sequence;
            }
        }
        return new int[0];
    }

    public static long concatenateNumbers(int[] sequence) {
        long concatenatedNumber = 0;
        for (int num : sequence) {
            concatenatedNumber = concatenatedNumber * 10000 + num;
        }
        return concatenatedNumber;
    }

    public static boolean arePermutations(int num1, int num2) {
        char[] num1Array = String.valueOf(num1).toCharArray();
        char[] num2Array = String.valueOf(num2).toCharArray();
        Arrays.sort(num1Array);
        Arrays.sort(num2Array);
        return Arrays.equals(num1Array, num2Array);
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
