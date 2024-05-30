package Almazbek.week01;

public class OddEvenMethod {
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 6;

        System.out.println("identify(" + number1 + "); -> \"" + identify(number1) + "\"");
        System.out.println("identify(" + number2 + "); -> \"" + identify(number2) + "\"");
    }
}