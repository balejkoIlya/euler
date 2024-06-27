package euler.problem50;

import java.util.ArrayList;
import java.util.List;

public class EulerFifteen {
    public static void main(String[] args) {
        List<Integer> primes=generatePrimes();
        int maxTerms = 0;
        int resultPrime = 0;
        for (int start = 0; start < primes.size(); start++) {
            int sum = 0;
            for (int end = start; end < primes.size(); end++) {
                sum += primes.get(end);
                if (sum >= 1000000) {
                    break;
                }
                int numberOfTerms = end - start + 1;
                if (numberOfTerms > maxTerms && isPrime(sum)) {
                    maxTerms = numberOfTerms;
                    resultPrime = sum;
                }
            }
        }
        System.out.println(resultPrime);
    }
    public static ArrayList<Integer> generatePrimes(){
        ArrayList<Integer> primes=new ArrayList<>();
        primes.add(2);
        for(int i=3;i<1_000_000;i+=2){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
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
