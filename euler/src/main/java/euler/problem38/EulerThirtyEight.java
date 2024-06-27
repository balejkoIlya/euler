package euler.problem38;

import java.util.Arrays;

public class EulerThirtyEight {
    public static void main(String[] args) {
        System.out.println(findMaxProduct());
    }

    private static boolean isPandigital(String str) {
        if (str.length() != 9) {
            return false;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars).equals("123456789");
    }
    public static int findMaxProduct(){
        int maxProduct = 0;

        for (int n = 2; n <= 9; n++) {
            for (int i = 1; i <= 9999; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j <= n; j++) {
                    sb.append(i * j);
                }
                String product = sb.toString();
                if (isPandigital(product) && Integer.parseInt(product) > maxProduct) {
                    maxProduct = Integer.parseInt(product);
                }
            }
        }
        return maxProduct;
    }
}
