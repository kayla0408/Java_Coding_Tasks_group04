package Kadriye.week04;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }


    public static String frequencyOfChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char originalChar = str.charAt(i);
            if (!result.contains("" + originalChar)) {
                for (int j = i; j < str.length(); j++) {
                    if (originalChar == str.charAt(j)) {
                        count++;
                    }
                }
                result += "" + originalChar + count;
            }
        }
        return result;
    }
}
/*Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */

