package Kadriye.week05;

public class String_Reverse {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String str){

        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);

        } return reversed;

    }
}
/* Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA

 */