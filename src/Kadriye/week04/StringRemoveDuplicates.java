package Kadriye.week04;

import java.util.Scanner;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            String eachLetter = str.substring(i, i+1);
            if (!unique.contains(eachLetter)){
                unique += eachLetter;
            }
        }
        return unique;
    }

}

/*Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC

 */