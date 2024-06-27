package euler.problem5;

/* 2520 is the smallest number that can be divided by each of the numbers
from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible
with no remainder by all of the numbers from 1 to 20?
*/

public class EulerFive {
    public static void main(String[] args) {
        System.out.println(smallestNumber());
    }

    public static int smallestNumber() {
        for (int i = 20; i < Integer.MAX_VALUE; i++) {
            if (divideFromOneToTwenty(i)){
                return i;
            }
        }
        return 0;
    }

    public static boolean divideFromOneToTwenty(int num) {
        for (int i = 11; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
