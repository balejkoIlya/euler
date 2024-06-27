package euler.problem29;

import java.util.HashSet;
import java.util.Set;

public class EulerTwentyNine {
    public static void main(String[] args) {
        System.out.println(countDigits());
    }
    public static int countDigits(){
        Set<Double> set=new HashSet<>(10000);
        for(int a=2;a<=100;a++){
            for(int b=2;b<=100;b++){
                set.add(Math.pow(a,b));
            }
        }
        return set.size();
    }
}
