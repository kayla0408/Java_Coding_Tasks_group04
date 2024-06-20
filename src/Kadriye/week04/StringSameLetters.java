package Kadriye.week04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringSameLetters {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));

    }


    public static boolean sameLetters(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();

          Arrays.sort(arr1);
          Arrays.sort(arr2);


         return Arrays.equals(arr1,arr2);
    }

}
/*Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false

 */