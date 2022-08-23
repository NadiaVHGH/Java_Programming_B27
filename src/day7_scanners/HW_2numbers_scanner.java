package day7_scanners;
import java.util.Scanner;
public class HW_2numbers_scanner {

    public static void main(String[] args) {

        //Create a program that will ask the user to enter two numbers. Add the numbers and print the result

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        System.out.println("Please enter a number:");
        int number2 = input.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Number2 " + number2);

    }


}
