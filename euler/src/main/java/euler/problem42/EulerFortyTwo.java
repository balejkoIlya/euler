package euler.problem42;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EulerFortyTwo {
    public static void main(String[] args) {
        Set<Integer> triangleNumbers = generateTriangleNumbers();
        int triangleWordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String line = br.readLine();
            String[] words = line.split(",");
            for (String word : words) {
                word = word.replace("\"", "");
                int wordValue = calculateWordValue(word);
                if (triangleNumbers.contains(wordValue)) {
                    triangleWordCount++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(triangleWordCount);
    }

    private static int calculateWordValue(String word) {
        int value = 0;
        for (char c : word.toCharArray()) {
            value += (c - 64);
        }
        return value;
    }

    private static Set<Integer> generateTriangleNumbers() {
        Set<Integer> triangleNumbers = new HashSet<>();
        for (int n = 1; n <= 100; n++) {
            int triangleNumber = n * (n + 1) / 2;
            triangleNumbers.add(triangleNumber);
        }
        return triangleNumbers;
    }
}
