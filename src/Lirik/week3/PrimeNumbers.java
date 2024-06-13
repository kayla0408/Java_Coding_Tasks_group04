package Lirik.week3;

public class PrimeNumbers {
        public static void main(String[] args) {
            System.out.println(isPrime(28));
            System.out.println(isPrime(97));
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

