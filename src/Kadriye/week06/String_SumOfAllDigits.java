package Kadriye.week06;

public class String_SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsInString("12 java 5 apple 3"));
    }



    public static int sumOfDigitsInString(String str2) {
        String[] array1 = str2.split(" ");
        int sum = 0;

        for (String eachChar : array1) {
            if (isAllDigits(eachChar)) {
                sum += Integer.parseInt(eachChar);
            }
        }
        return sum;
    }
    private static boolean isAllDigits(String str1) {
        for (char each : str1.toCharArray()) {
            if (!Character.isDigit(each)) {
                return false;
            }
        }
        return true;

    }
}
/* Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20

 */