package euler.problem19;

public class EulerNineteen {
    public static void main(String[] args) {
        System.out.println(countSundays());
    }

    public static int countSundays() {
        int counter=0;
        int dayOfTheWeek = 2;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int year = 1901; year <=2000; year++) {
            for (int month = 0; month < 12; month++) {
                if (month == 1 && year % 4 == 0) {
                    dayOfTheWeek++;
                }
                dayOfTheWeek = (dayOfTheWeek + months[month]) % 7;
                if(dayOfTheWeek==0) counter++;
            }
        }
        return counter;
    }
}
