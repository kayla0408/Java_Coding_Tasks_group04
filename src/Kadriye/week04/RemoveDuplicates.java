package Kadriye.week04;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCC"));
    }


    public static String uniqueChars(String str){
        String unique = "";
        for (int i = 0; i < str.length() ; i++) {
            String eachLetter = "" + str.charAt(i);
            if (!unique.contains(eachLetter)){
                unique += eachLetter;
            }

    } return unique;
}}
/*Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC

 */