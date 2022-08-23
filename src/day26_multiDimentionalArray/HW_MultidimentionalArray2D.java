package day26_multiDimentionalArray;

import java.util.Arrays;

public class HW_MultidimentionalArray2D {
    public static void main(String[] args) {
      /*Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
       */
        int[][] nums = {
                {78, 5, 2, 89},
                {-12, 41, -58, -2},
                {1, 5, 1, 5}
        };

        int max = nums[0][0];
        int min = nums[0][0];

        for (int[] eachInner : nums) {
            for (int each : eachInner) {
                if (max < each) {
                    max = each;
                } else if (min > each) {
                    min = each;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
