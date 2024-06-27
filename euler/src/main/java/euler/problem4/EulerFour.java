package euler.problem4;

/*A palindromic number reads the same both ways. The largest palindrome made from the product
of two 2-digit numbers is 9009 = 91*99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

public class EulerFour {
    public static void main(String[] args) {
        System.out.println(largestPolindrom());
    }

    public static boolean isPolindrom(int a) {
        int reversed = 0;
        int b=a;
        while (b != 0) {
            reversed *= 10;
            reversed = reversed + b % 10;
            b/= 10;
        }
        return a == reversed;
    }
    public static int largestPolindrom(){
        int max=0;
        for(int i=999;i>99;i--){
            for(int j=999;j>99;j--){
                int temp=i*j;
                if(isPolindrom(temp)&&temp>max){
                    max=temp;
                }
            }
        }
        return max;
    }
}
