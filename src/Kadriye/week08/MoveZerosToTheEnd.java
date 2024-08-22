package Kadriye.week08;

public class MoveZerosToTheEnd {

    public static int[] moveZeroes(int[] nums){

        int[] moved = new int[nums.length];
        int index = 0;
        for (int each : nums) {
            if (each != 0){
                moved[index++] = each;
            }
        }

        return moved;
    }

}
/*Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

 */