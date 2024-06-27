package euler.problem9;

public class EulerNine {
    public static void main(String[] args) {
        System.out.println(pythagor());
    }

    public static int pythagor() {
        for (int b = 6; b < 1000; b++) {
            for (int a = 5; a < 1000; a++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                   return  a * b * c;
                }
            }
        }
        return 0;
    }
}
