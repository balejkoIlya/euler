package euler.problem14;

public class EulerFourteen {
    public static void main(String[] args) {
        System.out.println(searchElement());
    }

    public static int searchElement() {
        int maxLength = 0;
        int temp = 0;
        int result = 0;
        for (int i = 3; i <= 1_000_000; i++) {
            temp = getLength(i);
            if (temp > maxLength) {
                maxLength = temp;
                result = i;
            }
        }
        return result;
    }

    public static int getLength(long k) {
        int length = 1;
        while (k > 1) {
            length++;
            k = k % 2 == 0 ? k / 2 : 3 * k + 1;
        }
        return length;
    }
}
