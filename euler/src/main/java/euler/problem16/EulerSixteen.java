package euler.problem16;

import java.util.Arrays;

public class EulerSixteen {
    public static void main(String[] args) {
       method(1000);
    }

    public static void method(int k) {
        int[] list=new int[350];
        list[0]=2;
        int counter=1;
        int number;
        int dNumber;
        int result;
        while(counter<1000) {
            dNumber=0;
            for (int i = 0; i < list.length; i++) {
                number = list[i];
                number*=2;
                number+=dNumber;
                list[i]=number%10;
                dNumber=number/10;
            }
            counter++;
        }
        result=Arrays.stream(list).reduce((a,b)->a+b).getAsInt();
        System.out.println(result);

    }
}
