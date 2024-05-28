package milan;


    public class DivideWithoutOperator {
        public static void main(String[] args) {
            System.out.println(divide(10, 2)); // Output: 5
            System.out.println(divide(20, 3)); // Output: 6
        }

        public static int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }

            int quotient = 0;
            int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;

            long dividendL = Math.abs((long) dividend);
            long divisorL = Math.abs((long) divisor);

            while (dividendL >= divisorL) {
                dividendL -= divisorL;
                quotient++;
            }

            return sign * quotient;
        }
    }


/*
Divide without / operator:
Write a method that can divide two numbers without using division operator
 */
