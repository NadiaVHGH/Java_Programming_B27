package day10_Statements;

import java.util.Scanner;

public class HW_ClassDrive {
    public static void main(String[] args) {
        /*
        You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the oxygen level");
        int input = scan.nextInt();

        String oxygenLevel = input >= 90 ? "Your tank is full" : input < 90 && input >= 80 ? "Still okay" : input < 80 && input >= 70 ? "Dont go too far" : input < 70 && input >= 60 ? "Start to head back" : input < 60 && input > 50 ? "Be careful now you at at 50%" : "Invalid number or R.I.P. :)";
        System.out.println(oxygenLevel);








    }
}
