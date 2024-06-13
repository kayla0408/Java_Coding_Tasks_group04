package arzugul.week03;

public class PrimeOrNot {

    public static void main(String[] args) {

        System.out.println(isPrime(8));
        System.out.println(isPrime(13));

    }
    public static boolean isPrime(int N){

        for (int i = 2; i < N; i++) {
            if(N % i ==0){
                return false;
            }

        }
        return true;

    }

}
