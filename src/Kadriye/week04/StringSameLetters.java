package Kadriye.week04;

import java.util.Arrays;
import java.util.TreeSet;

public class StringSameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "acb"));
        System.out.println(sameLetters("abc", "abb"));
    }

    public static boolean sameLetters(String str1, String str2){
       str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
       str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
       return str1.equals(str2);
    }
}
/*Write a return method that checks if a string is built out of the same letters as another string.
Ex: same("abc", "cab"); ==> true
same("abc", "abb"); ==> false

 */