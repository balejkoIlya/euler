package euler.problem40;

public class EulerForty {
    public static void main(String[] args) {
        char[] result=generateNumber(1_000_000);
        int product=(result[0]-48)*(result[9]-48)*(result[99]-48)
                *(result[999]-48)*(result[9999]-48)*(result[99999]-48)*(result[999999]-48);
        System.out.println(product);
    }

    public static char[] generateNumber(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }

        String allNumbers = sb.toString();
        char[] digitsArray = allNumbers.toCharArray();
        return digitsArray;
    }
}
