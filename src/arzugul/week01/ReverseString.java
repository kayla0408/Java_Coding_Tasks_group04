package arzugul.week01;

public class ReverseString {
    public static void main(String[] args){

 String str= "Hello Team";
 String reversedString ="";

 for(int i=str.length()-1; i>=0; i--){
     reversedString +=str.charAt(i);

     System.out.println("Reversed String = " + reversedString);
 }






    }

}
