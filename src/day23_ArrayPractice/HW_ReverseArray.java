package day23_ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class HW_ReverseArray {
    public static void main(String[] args) {
        /*Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
         */


        Scanner input = new Scanner (System.in);
        System.out.println("Enter your Array size");
        int size = input.nextInt();
        int[] nums = new int[size];
        for (int j = 0; j < nums.length; j++){
            System.out.println();System.out.println("Enter number");
            nums[j] = input.nextInt();
        }
        int[] numsreverse = new int[nums.length];
        int j = 0;
        for (int i = nums.length-1; i >= 0 ; i--) {
            numsreverse[j++] = nums[i];

        }
        System.out.print(Arrays.toString(numsreverse));
    }
}
