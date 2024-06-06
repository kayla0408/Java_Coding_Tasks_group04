package Lirik.week2;

public class SwapNumbers {

    public static void main(String[] args) {
        //Swap two variable values without using a third variable

        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);



    }
}
