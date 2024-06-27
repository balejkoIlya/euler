package euler.problem20;

import java.util.Arrays;

public class EulerTwenty {
    public static void main(String[] args) {
        int[] result = factorial(100);
        int resultSum = sumNumbers(result);
        System.out.println(resultSum);

    }

    public static int multiply(int k, int[] arr, int size) {
        int remaind = 0;
        for (int i = 0; i < size; i++) {
            int temp = arr[i] * k + remaind;
            arr[i] = temp % 10;
            remaind = temp / 10;
        }
        while (remaind > 0) {
            arr[size] = remaind % 10;
            remaind /= 10;
            size++;
        }
        return size;
    }

    public static int[] factorial(int k) {
        int[] result = new int[400];
        result[0] = 1;
        int resultSize = 1;
        for (int i = 2; i <= k; i++) {
            resultSize = multiply(i, result, resultSize);
        }
        return result;

    }

    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
