package euler.problem6;

/*The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385.
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025.
Hence the difference between the sum of the squares of the first ten natural
numbers and the square of the sum is 3025 - 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers
and the square of the sum.*/

public class EulerSix {
    public static void main(String[] args) {
        System.out.println(sumSqrtDiff());
    }

    public static int sumSqrtDiff() {
        int sumOfTheSquares = 0;
        int squareOfTheSum = 0;
        for (int i = 1; i <= 100; i++) {
               sumOfTheSquares+=i*i;
               squareOfTheSum+=i;
        }
        return (int)Math.pow(squareOfTheSum,2)-sumOfTheSquares;
    }
}
