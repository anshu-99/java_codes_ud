package StringFunction;
public class ReverseWord{
    public static void main(String[] args) {
        String input = "i love you";
        String output = reverseWords(input);
        System.out.println(output);
    }

    static String reverseWords(String input) {
        // Split the input string into an array of words
        String[] words = input.split(" ");

        // Create an array to store the reversed words
        String[] reversedWords = new String[words.length];

        // Reverse the order of words
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - 1 - i];
        }

        // Join the reversed words into a single string using a dot as a delimiter
        String result = String.join(" ", reversedWords);

        return result;
    }
}
