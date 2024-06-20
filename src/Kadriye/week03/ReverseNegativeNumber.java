package Kadriye.week03;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(-35));
    }

public static int reverseNegativeNum(int n ){
    int reversed = 0;

    while(n < 0){
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        n /= 10;
    }
    return reversed;
}
}
/* Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53

 */