package Almazbek.week01;

public class DivisionWithoutOperator {
    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert dividend and divisor to positive values
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize quotient
        int quotient = 0;

        // Subtract the divisor from the dividend until the dividend becomes less than the divisor
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        // Apply the sign to the quotient
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        int dividend1 = 10;
        int divisor1 = 2;
        System.out.println("divide(" + dividend1 + ", " + divisor1 + ") -> " + divide(dividend1, divisor1)); // Output: 5

        int dividend2 = 7;
        int divisor2 = -3;
        System.out.println("divide(" + dividend2 + ", " + divisor2 + ") -> " + divide(dividend2, divisor2)); // Output: -2

        int dividend3 = -15;
        int divisor3 = 3;
        System.out.println("divide(" + dividend3 + ", " + divisor3 + ") -> " + divide(dividend3, divisor3)); // Output: -5

        int dividend4 = -15;
        int divisor4 = -3;
        System.out.println("divide(" + dividend4 + ", " + divisor4 + ") -> " + divide(dividend4, divisor4)); // Output: 5
    }
}

