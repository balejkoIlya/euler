package euler.problem26;

public class EulerTwentyTwo {
    public static void main(String[] args) {
        int limit = 1000;
        int maxCycleLength = 0;
        int numberWithMaxCycle = 0;
        for (int d = 2; d < limit; d++) {
            if (d % 2 == 0 || d % 5 == 0) {
                continue;
            }
            int cycleLength = getRecurringCycleLength(d);
            if (cycleLength > maxCycleLength) {
                maxCycleLength = cycleLength;
                numberWithMaxCycle = d;
            }
        }

        System.out.println("Число с самым длинным периодом: " + numberWithMaxCycle);
    }

    private static int getRecurringCycleLength(int d) {
        int remainder = 1;
        int position = 0;
        int[] remainders = new int[d];

        while (remainders[remainder] == 0 && remainder != 0) {
            remainders[remainder] = position;
            remainder = (remainder * 10) % d;
            position++;
        }
        if (remainder == 0) {
            return 0;
        } else {
            return position - remainders[remainder];
        }
    }
}
