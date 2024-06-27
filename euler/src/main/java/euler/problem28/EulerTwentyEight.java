package euler.problem28;

import java.util.Arrays;

public class EulerTwentyEight {
    public static void main(String[] args) {
        int[][] a = generateSpirale(1001,1001);
        int sum1=0;
        int sum2=0;
        int i=0;
        int j=0;
       while(i!=a.length){
           sum1+=a[i][j];
           i++;
           j++;
       }
       int l=0;
       int k=a[l].length-1;
       while(l!=a.length){
           sum2+=a[l][k];
           k--;
           l++;
       }
        System.out.println(sum1+sum2-1);

    }

    public static int[][] generateSpirale(int x, int y) {
        int[][] spirale = new int[x][y];
        int max = spirale.length * spirale[spirale.length - 1].length;
        int count = 0;
        int min_row = 0;
        int max_row = spirale.length - 1;
        int min_column = 0;
        int max_column = spirale[spirale.length - 1].length - 1;
        while (count < max) {
            for (int i = max_column; i >= min_column; i--) {
                spirale[min_row][i] = max - count;
                count++;
            }
            min_row += 1;
            for (int i = min_row; i <= max_row; i++) {
                spirale[i][min_column] = max - count;
                count++;
            }
            min_column += 1;
            for (int i = min_column; i <= max_column; i++) {
                spirale[max_row][i] = max - count;
                count++;
            }
            max_row -= 1;
            for (int i = max_row; i >= min_row; i--) {
                spirale[i][max_column] = max - count;
                count++;
            }
            max_column -= 1;
        }
        return spirale;
    }
}
//  [][][]
//  [][][]
//  [][][]