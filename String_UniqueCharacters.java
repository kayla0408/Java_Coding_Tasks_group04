package Almazbek.week05;

public class String_UniqueCharacters {
    public static String unique(String input) {


        StringBuilder result = new StringBuilder();
        int[] count = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch]++;
        }

        // Append characters that appear only once to the result
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (count[ch] == 1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String input = "AAABBBCCCDEFHADFZXMNO";
        System.out.println("Unique characters: " + unique(input)); // Output: DEF
    }
}


