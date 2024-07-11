package Almazbek.week05;

public class StringReverse {
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverse(String input) {


        StringBuilder reversed = new StringBuilder();

        // Iterate over the input string from end to beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String input = "ABCDXYZ";
        System.out.println("Reversed string: " + reverse(input)); // Output: DCBA
    }
}


