package euler.problem39;

import java.util.HashMap;
import java.util.Map;

public class EulerThirtyNine {
    public static void main(String[] args) {
        System.out.println(findMaxSolution(countSolutions()));
    }

    public static int findMaxSolution(Map<Integer, Integer> solutionCount) {
        int maxSolution = 0;
        int maxSolutionPerimeter = 0;
        for (Map.Entry<Integer, Integer> entry : solutionCount.entrySet()) {
            if (entry.getValue() > maxSolution) {
                maxSolution = entry.getValue();
                maxSolutionPerimeter = entry.getKey();
            }
        }
        return maxSolutionPerimeter;
    }
    public static Map<Integer,Integer> countSolutions(){
        Map<Integer, Integer> solutionCount = new HashMap<>();
        for (int p = 3; p <= 1000; p++) {
            int counter = 0;
            for (int a = 1; a < p / 3; a++) {
                for (int b = a; b < (p - a) / 2; b++) {
                    int c = p - a - b;
                    if (a * a + b * b == c * c) {
                        counter++;
                    }
                }
            }
            solutionCount.put(p, counter);
        }
        return solutionCount;
    }
}
