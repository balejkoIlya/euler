package euler.problem21;

import java.util.ArrayList;

public class EulerTwentyOne {
    public static void main(String[] args) {
        System.out.println(countSumOfPairs());
    }

    public static int countSumOfPairs() {
        int sum=0;
        int[] sumOfDivisors=new int[10000];
        for(int i=1;i<sumOfDivisors.length;i++){
           sumOfDivisors[i]=sumDivisors(i);
            if(sumOfDivisors[i]<sumOfDivisors.length&&
                    sumOfDivisors[sumOfDivisors[i]]==i&&sumOfDivisors[i]!=i){
                sum+=i;
                sum+=sumOfDivisors[i];
            }
        }
        return sum;

    }

    public static int sumDivisors(int k) {
        int sum = 0;
        for (int i = 1; i<Math.sqrt(k)+1; i++) {
            if (k % i == 0) {
                sum += i;
                sum+=k/i;
            }
        }
        return sum-k;
    }
}
