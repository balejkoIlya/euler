package euler.problem31;

public class EulerThirtyOne {
    public static void main(String[] args) {
        System.out.println(countWays());
    }

    public static int countWays() {
        int count = 0;
        int sum = 200;
        for (int a = 0; a <= sum / 200; a++) {
            for (int b = 0; b <= (sum - 200 * a) / 100; b++) {
                for (int c = 0; c <= (sum - 200 * a - 100 * b) / 50; c++) {
                    for (int d = 0; d <= (sum - 200 * a - 100 * b - 50 * c) / 20; d++) {
                        for (int e = 0; e <= (sum - 200 * a - 100 * b - 50 * c - 20 * d) / 10; e++) {
                            for (int f = 0; f <= (sum - 200 * a - 100 * b - 50 * c - 20 * d - 10 * e) / 5; f++) {
                                for (int g = 0; g <= (sum - 200 * a - 100 * b - 50 * c - 20 * d - 10 * e - 5 * f) / 2; g++) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}

