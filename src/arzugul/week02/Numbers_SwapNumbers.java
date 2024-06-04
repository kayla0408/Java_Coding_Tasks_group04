package arzugul.week02;

public class Numbers_SwapNumbers {
    /*
    Swap two variable values without using a third variable
     */

    public static void main(String[] args) {

        int num1=20;
        int num2=10;

        num2=num2+num1;  //10+20=30; num2=30;
        num1=num2-num1;  //30-20=20; num1=10;
        num2=num2-num1;  //30-10=20; num2=20;

        System.out.println("num1= " + num1);
        System.out.println("num2= " + num2);
    }
}
