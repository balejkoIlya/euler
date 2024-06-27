package euler.problem25;


import java.math.BigInteger;

public class EulerTwentyFive {
    public static void main(String[] args) {
        System.out.println(searchIndexByLength(1000));
    }

    public static int searchIndexByLength(int length) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        int i = 2;

        while (b.toString().length() < length) {
            BigInteger temp = b;
            b = b.add(a);
            a = temp;
            i++;
        }

        return i;
    }


}
