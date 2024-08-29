package Kadriye.week09;

import java.util.Arrays;

public class Array_concat2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};
        int[] arr2 = {7, 8, 9, 10};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }


    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0, y = 0; i < merged.length; i++) {

            if (i< arr1.length ){
                merged[i] = arr1[i];
            }else {
                merged[i] = arr2[y++];
            }
        }
        return merged;
    }
}
/*Write a return method that can concatenate two arrays

 */