package euler.problem34;

public class EulerThirtyFour {
    public static void main(String[] args) {
        System.out.println(calculateSum());
    }
    public static int factorial(int i){
        if(i==1) return 1;
        if(i==0) return 1;
        return factorial(i-1)*i;
    }
    public static boolean canBeWritenAsTheSumOfFactorials(int i){
        int sum=0;
        int current=i;
        while(i!=0){
            sum+=factorial(i%10);
            i/=10;
        }
        return current==sum;
    }
    public static int calculateSum(){
        int sum=0;
        for(int i=3;i<100_000;i++){
            if(canBeWritenAsTheSumOfFactorials(i)){
                sum+=i;
            }
        }
        return sum;

    }
}
