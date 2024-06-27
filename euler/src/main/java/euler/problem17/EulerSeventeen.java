package euler.problem17;

public class EulerSeventeen {
    static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {

        System.out.println(getWord().length());
    }

    public static String getWord() {
        String word = "";
        for (int i = 1; i <= 1000; i++) {
            word+=testWord(i);
        }
        return word;
    }

    public static String testWord(int i) {
        String word = "";
        if(i==1000) return "onethousand";
        if (i >= 100) {
            word += ones[i / 100] + "hundred";
            if (i % 100 != 0) {
                word += "and";

//                    + tens[i % 100 / 10 - 1] + ones[i % 10 - 1];
            }
            i = i % 100;
            if (i >= 20) {
                word += tens[i / 10];
                if (i % 10 != 0) {
                    word += ones[i % 10];
                }
                i = i * 100;
            } else {
                word += ones[i];
                i = i * 100;

            }

        }
        if (i < 100 && i >= 20) {
            word += tens[i / 10];
            if (i % 10 != 0) {
                word += ones[i % 10];
            }
        }
        if (i < 20) {
            word += ones[i];
        }
        return word;
    }
}

