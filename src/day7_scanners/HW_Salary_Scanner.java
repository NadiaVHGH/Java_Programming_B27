package day7_scanners;
import java.util.Scanner;
public class HW_Salary_Scanner {
    public static void main(String[] args) {

        //Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
        //    hourly rate = salary / (hours weekly * 52)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a salary: ");
        double salary = input.nextDouble();
        System.out.println("Please enter hours: ");
        int hours = input.nextInt();
        double hourlyRate = salary / (hours * 52);
        System.out.println("Your hourly rate: " + hourlyRate);

    }

}
