package euler.problem30;

public class EulerThirty {
    public static void main(String[] args) {
        System.out.println(calculateSum());
    }
    public static boolean canBeWritenAsTheSumOfDigits(int i,int pow){
        int sum=0;
        int current=i;
        while(i!=0){
            sum+=Math.pow(i%10,pow);
            i/=10;
        }
        return current==sum;
    }
    public static int calculateSum(){
        int sum=0;
        for(int i=2;i<1_000_000;i++){
            if(canBeWritenAsTheSumOfDigits(i,5)){
                sum+=i;
            }
        }
        return sum;
    }
}
