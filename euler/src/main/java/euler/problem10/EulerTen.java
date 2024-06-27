package euler.problem10;

public class EulerTen {
    public static void main(String[] args) {
        System.out.println(sumOfPrimes(2_000_000));

    }
    public static boolean isPrime(long k){
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
    public static long sumOfPrimes(int k){
        long sum=0;
        for(int i=2;i<=k;i++){
            if(isPrime(i)){
                sum+=i;
            }

        }
        return sum;
    }
}
