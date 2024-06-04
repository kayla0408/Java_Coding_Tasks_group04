package arzugul.week02;

public class Print_Consecutive_Numbers {

    public static void main(String[] args) {
        consecutiveNumbers(16);
    }
    public static void consecutiveNumbers(int N){

        for (int i = 1; i <= N ; i++) {
            String result="";
            if (i % 2 ==0){
                result+="Codility";
            }
            if (i % 3 ==0){
                result+="Test";
            }
            if(i % 5 == 0){
                result+= "Coders";
            }
            System.out.println(result.isEmpty() ? i : result);

        }
    }
}



