package CodingCom;

import java.util.*;

public class PhoneNum {
    public static String convertToDigits(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        int repeat = 1;

        String[] wordToDigitMap = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        for (String word : words) {
            if (word.equals("double")) {
                repeat = 2;
            } else if (word.equals("triple")) {
                repeat = 3;
            } else {
                int digit = -1;
                for (int i = 0; i < wordToDigitMap.length; i++) {
                    if (wordToDigitMap[i].equals(word)) {
                        digit = i;
                        break;
                    }
                }

                if (digit >= 0) {
                    result.append(String.valueOf(digit).repeat(repeat));
                }

                repeat = 1;
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(convertToDigits(str));
    }
}
