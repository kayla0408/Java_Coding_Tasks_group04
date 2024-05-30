package arzugul.week01;

public class ReverseString {
    public static void main(String[] args) {


        // 1. String reverse. Write a method that will take one string as an argument and
        //    return the reverse version of this string.
        String original = "Hello World";
        String newValue = reverseString(original);

        System.out.println(original);
        System.out.println(newValue);

    }
    public static String reverseString(String str){

        //empty string to store the reversed string
        String reversed = "";

        for (int i = str.length() -1 ; i >= 0 ; i--) {

            reversed += str.charAt(i);

        }

        return reversed;
    }

    }
     /*   String str = "Hello Team";
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);

            System.out.println("Reversed String = " + reversedString);

*/



