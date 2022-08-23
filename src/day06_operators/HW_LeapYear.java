package day06_operators;

public class HW_LeapYear {

    public static void main(String[] args) {

        //declare and assign a year variable
        //    check if the year is a leap year, a year will be a leap year if it is divisible by 4

        int year = 2022;
        boolean yearIsLeap = year % 4 == 0;
        System.out.println("This is leap year:  " + yearIsLeap);

        /*
        int year = 2024;
        boolean isLeapYear = year % 4  == 0;
        System.out.println(isLeapYear);
         */

    }
}
