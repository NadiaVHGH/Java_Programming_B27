package day18_WhileLoop7_12;

import java.util.Locale;
import java.util.Scanner;

public class HW_Colors {
    public static void main(String[] args) {

        /*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
         */

        Scanner input = new Scanner(System.in);
        int numOfColors = 0;
        String colors = "";

        while(numOfColors <3){
            System.out.println("Enter the next color: ");
            String inputColor = input.nextLine().toLowerCase();

            if(!colors.contains(inputColor)){
                colors += " " + inputColor;
                numOfColors++;
            }

        }
        System.out.println(colors.trim());
    }
}
