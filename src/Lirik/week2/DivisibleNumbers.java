package Lirik.week2;

public class DivisibleNumbers {
    public static void main(String[] args) {
        // DivisibleBy15, DivisibleBy5, and DivisibleBy3 sections
        System.out.print("Divisible By 15: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Divisible By 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Divisible By 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

