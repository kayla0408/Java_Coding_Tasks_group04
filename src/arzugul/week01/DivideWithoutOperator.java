package arzugul.week01;

public class DivideWithoutOperator {

    public static int divideNumbers(int divident,int divisor){

        if (divisor==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        int sign=(divident < 0) || (divisor < 0)? -1:1;

        long absDividend=Math.abs((long)divident);
        long absDivisor=Math.abs((long)divisor);

        long quotient=0;
        while (absDividend>=absDivisor){
            absDividend-=absDivisor;
            quotient++;
        }
        return (int)(sign*quotient);

    }

    public static void main(String[] args) {

        int dividend=27;
        int divisor=3;
        int result=divideNumbers(dividend,divisor);
        System.out.println("Result of division: "+result);


    }
}
