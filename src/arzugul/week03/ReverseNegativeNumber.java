package arzugul.week03;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseInt(  - 35));
    }
    public static int reverseInt(int  N) {

        int rev = 0;
        while (- N > 0) {
            int lastDigit = N % 10;
            rev = rev * 10 + lastDigit;
            N /= 10;
        }
        return rev;

    }

    }

  /* public static int reversenegativeNumber(int N){
        // Convert the negative number to a string

        String numStr = String.valueOf(N);

        //Remove the negative sign if present and reverse the string

        String reversedStr = new StringBuilder(numStr.replace(" ","")).reverse().toString();

        // Convert the reversed string back to an integer

             int reversedNum = Integer.parseInt(reversedStr);

             //Apply the negative sign if the original number was negative

                if(N < 0){
                    reversedNum *= -1;
                }
                return  reversedNum;

   */

