package day18_WhileLoop7_12;

import java.util.Scanner;

public class HW_WhileLoop5Numbers {
    public static void main(String[] args) {

     /*write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
      */

        Scanner scan = new Scanner(System.in);
        int countNumber = 1;
        int countNegative = 0;
        int countPositive = 0;
        while (countNumber <= 5){
            int a = scan.nextInt();
            countNumber++;
            if(a >= 0){
                countPositive++;
            }else{
                countNegative++;
            }
        }
        System.out.println("Positive number: " + countPositive);
        System.out.println("Negative number: " + countNegative);
    }
}
