package euler.problem15;

public class EulerFifteen {
    public static void main(String[] args) {
        System.out.println(combination(40,20));
    }
    public static double factorial(int i){
        if(i==0) return 1;
        //if(i==1) return 1;
        return factorial(i-1)*i;
    }
    public static long combination(int n,int k){
        return (long)(factorial(n)/(factorial(k)*factorial(n-k)));
    }
}
