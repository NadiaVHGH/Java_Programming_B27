package day22_ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class HW_TheDayOfTheWeek {
    /*Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday","Thuersday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter the day number 1-7");

        int num = input.nextInt();
        if(num >= 1 && num <= 7){

            System.out.println(days[num-1]);
        }else{
            System.out.println("Invalid day number");
        }
    }
}
