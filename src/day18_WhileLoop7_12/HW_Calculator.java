package day18_WhileLoop7_12;

import java.util.Scanner;

public class HW_Calculator {
    public static void main(String[] args) {
        /*write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int factorial = 1;
        while(num > 1){
          factorial *= num--;
        }
        System.out.println("Factorial = " + factorial);
    }
}
