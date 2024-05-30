package hasan.week01;

public class OddOrEven {
    public static void main(String[] args) {
        identify(5.0);
        identify(6.0);
    }

    public static void identify(double a) {
        if (a % 2.0 == 0.0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
