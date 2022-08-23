package day23_ArrayPractice;

import java.sql.Array;
import java.util.Arrays;

public class HW_ArrayNumber {
    public static void main(String[] args) {
        /*
100 number array

	1. Create an int array called numbers that has length of 100
	2. Assign 1-100 to each index of the array. Then print your number array
         */
        int [] numbers = new int [100];
       // System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
            //System.out.print(numbers[i] + " ");
            System.out.println(Arrays.toString(numbers));
        }
    }
}
