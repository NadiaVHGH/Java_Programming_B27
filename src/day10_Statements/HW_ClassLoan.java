package day10_Statements;

import java.util.Scanner;

public class HW_ClassLoan {

    public static void main(String[] args) {
        /*
       declare and assign a credit score variable
try to use ternary to determine of you are eligible for a loan
you are eligible if you have a credit score of 700 or above

if you are eligible print "loan approved"
otherwise print "loan rejected. Sign up for our credit program"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your credit score");
        int input = scan.nextInt();

        String loan = input >= 700 ? "loan approved" : "loan rejected";
        System.out.println(loan);



    }
}
