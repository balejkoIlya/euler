package euler.problem22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EulerTwentyTwo {
    public static void main(String[] args) {
        String filePath = "D:/names.txt";
        List<String> names = new ArrayList<>();
        String text = " ";
        long result = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                text = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        StringBuilder sb = new StringBuilder();
        text = text.replace("\"", "")
                .trim();
        String[] arr = text.split(",");
        names.addAll(Arrays.asList(arr));
//        char[] chars = text.toCharArray();
//        for (char c : chars) {
//            if (c != '\n') {
//                sb.append(c);
//                continue;
//            }
//            names.add(sb.toString());
//            sb.setLength(0);
//        }
//        names.add("ALONSO");
        Collections.sort(names);
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            int sum = 0;
            for (char c : names.get(i).toCharArray()) {
                sum += c - 64;
            }
            result += sum * (i + 1);
        }
        System.out.println(result);


    }

}
