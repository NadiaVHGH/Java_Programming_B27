package day10_Statements;

import java.util.Scanner;

public class HW_Retake {
    public static void main(String[] args) {
        /*
        declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade
         */
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your grade");
            int grade = 0;
            grade = scan.nextInt();

            System.out.println("Enter your attempt number");
            int attempt = scan.nextInt();

            if (attempt == 1){
                grade -= grade / 100 * 10;
            } else if (attempt == 2){
                grade -= grade / 100 * 20;
            } else if (attempt == 3){
                grade -= grade / 100 * 35;
            }else{
                System.out.println("Problem, Invalid Attempt Number");
            }

            System.out.println(grade);
    }
}
