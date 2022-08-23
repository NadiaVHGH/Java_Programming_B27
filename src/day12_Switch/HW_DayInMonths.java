package day12_Switch;

import java.util.Scanner;

public class HW_DayInMonths {
    public static void main(String[] args) {
        /*
        Days In Month (slightly different version than before)
Write a program that will accept a month name and outputs how many days are in that month
data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Which month?");
        String month = input.next();
        switch (month){
            case "January":
            case "March":
            case "July":
            case "August":
            case "October":
            case "December":
            case "May":
                System.out.println("There are 31 days in " + month);
                break;

            case "February":
                System.out.println("There are 28 days in " + month);
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("There are 30 days in " + month);
                break;
        }

















    }
}
