package euler.problem24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EulerTwentyFour {
    public static void main(String[] args) {
        System.out.println(findMillionthPermutation());
    }
    public static String findMillionthPermutation() {
        // Инициализируем список цифр от 0 до 9
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            digits.add(i);
        }

        int position = 1000000 - 1; // Позиция с учетом нумерации с нуля
        StringBuilder permutation = new StringBuilder();


        for (int i = 9; i >= 0; i--) {
            int fact = factorial(i);
            int index = position / fact;
            permutation.append(digits.remove(index));
            position %= fact;
        }

        return permutation.toString();
    }


    public static int factorial(int i){
        if(i==0||i==1)return 1;
        return factorial(i-1)*i;
    }
//    public static void swap(char[] arr,int a,int b){
//        char temp=arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;
//    }
}
//1 2 3 4              3 1 2 4
//1 2 4 3              3 1 4 2
//1 3 2 4              3 2 1 4
//1 3 4 2              3 2 4 1
//1 4 2 3              3 4 1 2
//1 4 3 2              3 4 2 1
//2 1 3 4              4 1 2 3
//2 1 4 3              4 1 3 2
//2 3 1 4              4 2 1 3
//2 3 4 1              4 2 3 1
//2 4 1 3              4 3 1 2
//2 4 3 1              4 3 2 1
