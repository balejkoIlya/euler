package euler.problem33;

public class EulerThirtyThree {public static void main(String[] args) {
    int numeratorProduct = 1;
    int denominatorProduct = 1;

    for (int numerator = 10; numerator < 100; numerator++) {
        for (int denominator = numerator + 1; denominator < 100; denominator++) {
            if (isCuriousFraction(numerator, denominator)) {
                numeratorProduct *= numerator;
                denominatorProduct *= denominator;
            }
        }
    }
    int gcd = gcd(numeratorProduct, denominatorProduct);
    System.out.println(denominatorProduct / gcd);
}

    public static boolean isCuriousFraction(int num, int den) {
        int numTens = num / 10;
        int numOnes = num % 10;
        int denTens = den / 10;
        int denOnes = den % 10;

        if (numOnes == 0 && denOnes == 0) return false;
        double originalFraction = (double) num / den;

        if (numTens == denTens) {
            double newFraction = (double) numOnes / denOnes;
            if (originalFraction == newFraction) return true;
        }

        if (numTens == denOnes) {
            double newFraction = (double) numOnes / denTens;
            if (originalFraction == newFraction) return true;
        }

        if (numOnes == denTens) {
            double newFraction = (double) numTens / denOnes;
            if (originalFraction == newFraction) return true;
        }

        if (numOnes == denOnes) {
            double newFraction = (double) numTens / denTens;
            if (originalFraction == newFraction) return true;
        }

        return false;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

