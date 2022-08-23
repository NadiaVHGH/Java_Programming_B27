package day9_Statements;

import java.util.Scanner;

public class HW_StatementPractice {
    public static void main(String[] args) {
        /*
        Create two number variables
        Find and print which number is bigger between the two
	    ex:
		50
		45
		output:
		50 is bigger
         */
        Scanner input = new Scanner(System.in);
/*
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is bigger");

        }
        if (num1 < num2) {
            System.out.println(num2 + " is bigger ");
        }
        */


        int num1 = 50;
        int num2 = 45;
        System.out.println("Number is \n" + num1 + "\n" + num2);
        if (num1 > num2){
            System.out.println(num1 + "is bigger");
        }else{
            System.out.println(num2 + "is bigger");
        }

        /*
        int first = 13;
        int second = 33;
        int third = 50;
        int biggest;
        // you don't need both options
        if(first > second && first > third){
           // System.out.println(first + " is the biggest");
            biggest = first;
        } else if(second > first && second > third){
            //System.out.println(second + " is the biggest");
            biggest = second;
        } else {
            //System.out.println(third + " is the biggest");
            biggest = third;
        }

        System.out.println(biggest + " is the biggest");
         */






    }
}
