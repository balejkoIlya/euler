package euler.problem36;

public class EulerThirtySix {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(i, 10) && isPalindrome(i, 2)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPalindrome(int n, int base) {
        if (base == 2) {
            String binaryString = Integer.toBinaryString(n);
            return isPalindromeHelper(binaryString);
        } else {
            String decimalString = Integer.toString(n);
            return isPalindromeHelper(decimalString);
        }
    }
    public static boolean isPalindromeHelper(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
