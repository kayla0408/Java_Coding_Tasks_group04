package Kadriye.week01;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        division(6, 2);
        division(7, 3);
    }

    public static void division(int num1, int num2){

        if (num2 == 0){
            System.err.println("Numbers cannot divide by zero");
            System.exit(1);
        }

        int count = 0;
        String result = num1 + " divides by " + num2 +" equals to ";
         while(num1 >= num2){
             num1 -= num2;
             count ++;
         }

        System.out.println( result + count );
    }


}

/*Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator

 */