package Kadriye.week05;

import java.util.HashSet;
import java.util.Set;

public class String_UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }

    public static String uniqueChars(String str){
        String checked = "";
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
           String eachLetter = str.substring(i, i+1);
            if (!checked.contains(eachLetter)){
                unique.add(eachLetter);
                checked += eachLetter;
            } else {
                unique.remove(eachLetter);
            }

       } return unique.toString();
    }
}
/* Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


 */