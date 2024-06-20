package Kadriye.week04;

import java.util.Scanner;

public class StringFrequencyOfCharacters {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            System.out.println(frequencyOfChars(str));
        }

    public static String frequencyOfChars(String str){
       String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char originalChar = str.charAt(i);
            if (!result.contains("" + originalChar)){
                for (int j = i; j < str.length(); j++) {
                    if (originalChar == str.charAt(j)){
                        count++;
                    }
                } result += "" + count + originalChar;

            }

        }return result;

    }

}



/*Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */