package Kadriye.week08;

import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {

        public static void main(String[] args) {
        int N = 4; // Example input
        int[] result = generateUniqueSumToZero(N);
        System.out.println(Arrays.toString(result));
    }


        public static int[] generateUniqueSumToZero(int N) {
            // Check for valid input
            if (N <= 1 || N >= 100) {
                throw new IllegalArgumentException("N must be between 1 and 100 (exclusive).");
            }

            int[] result = new int[N];
            int sum = 0;

            // Fill the array with unique integers
            for (int i = 0; i < N - 1; i++) {
                result[i] = i + 1; // Fill with positive integers
                sum += result[i]; // Keep track of the sum
            }

            // The last element is the negative of the sum of the previous elements
            result[N - 1] = -sum;

            return result;
        }


    }

/*Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).

 */