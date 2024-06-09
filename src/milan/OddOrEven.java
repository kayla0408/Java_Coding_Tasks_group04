package milan;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));

    }
    public static String identify(int num) {    // identify function
        if (num % 2 == 0){
            return "even";
        }
        else {
            return "odd";
        }
    }
}
/*
Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */
