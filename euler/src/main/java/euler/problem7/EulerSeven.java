package euler.problem7;

public class EulerSeven {
    public static void main(String[] args) {
        //System.out.println(countPrimes());
        System.out.println(countPrimes());
    }
    public static boolean isPrime(long k){
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(){
        int currentPrime=1;
        int count=0;
        while(count!=10001){
            if(isPrime(currentPrime)){
                count++;
            }
            currentPrime+=2;
        }
return currentPrime-2;
    }
}
