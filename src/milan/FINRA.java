package milan;

public class FINRA {

    public static void main(String[] args) {

        int num= 30;

        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        if (by3 && by5){
            System.out.println("FINRA");
        }else if (by3){
            System.out.println("FIN");
        } else if (by5) {
            System.out.println("RA");
        }else {
            System.out.println(num);
        }
        }
    }




/*
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
