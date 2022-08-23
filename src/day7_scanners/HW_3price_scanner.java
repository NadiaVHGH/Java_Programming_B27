package day7_scanners;
import java.util.Scanner;
public class HW_3price_scanner {
    public static void main(String[] args) {

        //Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a price:");
        double price = scan.nextDouble();
        System.out.println("Please enter a quantity:");
        int quantity = scan.nextInt();

        System.out.println("Revenue:" + (price * quantity));


    }
}
