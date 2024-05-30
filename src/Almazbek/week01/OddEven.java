package Almazbek.week01;

public class OddEven {
           public static void main(String[] args) {
            int number = 101; //
            boolean isOddResult = isOdd(number);
            boolean isEvenResult = isEven(number);

            System.out.println("Is " + number + " odd? " + isOddResult);
            System.out.println("Is " + number + " even? " + isEvenResult);
        }

        public static boolean isOdd(int num) {
            return num % 2 != 0;
        }

        public static boolean isEven(int num) {
            return num % 2 == 0;
        }
    }


    

