package euler.problem12;

public class EulerTwelve {
    public static void main(String[] args) {

        System.out.println(resultNumber());
    }

    public static int countFactors(int k) {
        int count = 0;
        for (int j = 1; j < Math.sqrt(k) + 1; j++) {
            if (k % j == 0) count += 2;
        }
        return count;
    }

    public static int resultNumber() {

        int j = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            j += i;
            if (countFactors(j) > 500) {
                return j;
            }
        }
        return 0;
    }
}
