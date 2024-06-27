package euler.problem3;

/*The prime factors of 13195 are 5, 7, 13 and 29.</p>
What is the largest prime factor of the number 600851475143?*/

public class EulerThree {
    public static void main(String[] args) {
        long number=600851475143L;
        System.out.println(isLagrestPrime(number));
    }
    public static boolean isPrime(long k){
        for(long i=2;i<Math.sqrt(k)+1;i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }

    public static long isLagrestPrime(long a){
        int max=0;
        for(int i=2;i<=Math.sqrt(a)+1;i++){
            if(a%i==0&&isPrime(i)){
                max=i;
            }
        }
        return max;
    }
}
