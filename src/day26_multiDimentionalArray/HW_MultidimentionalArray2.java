package day26_multiDimentionalArray;

import java.util.Arrays;

public class HW_MultidimentionalArray2 {
    public static void main(String[] args) {
        /*Given a 2D int array merge the elements into one 1D array

Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]
         */

        int[][] nums = {{10, 20, 30}, {5, 10, 15}};

        String arr1D = "";//to store each element from two 1D arrays

        for (int i = 0; i < nums.length; i++) {//i: index of each 1D array
            for (int j = 0; j < nums[i].length; j++) {//j: index of each element

                int eachElement = nums[i][j];//each element in given array

                arr1D += eachElement + " ";
            }
        }
        String[] result = arr1D.split(" ");
        System.out.println(Arrays.toString(result));


        }
    }

