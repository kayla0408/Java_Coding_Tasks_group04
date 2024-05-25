package Kadriye.week01;

public class ReverseString {
    public static void main(String[] args){

 String str= "Hello";

        String original = "Hello World";
        String newValue = reverseString(original);

        System.out.println(original);
        System.out.println(newValue);

    }

    public static String reverseString(String str){


        String reversed = "";


        for (int i = str.length() -1 ; i >= 0 ; i--) {

            reversed += str.charAt(i);

        }

        return reversed;



    }

}
