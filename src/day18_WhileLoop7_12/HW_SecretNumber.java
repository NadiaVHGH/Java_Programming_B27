package day18_WhileLoop7_12;

import java.util.Scanner;

public class HW_SecretNumber {
    public static void main(String[] args) {

        /*write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller
         */
        int secretNumber = 97;
        int inputNumber;
        int attempts = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter a number");
            inputNumber = input.nextInt();

            if(inputNumber < secretNumber){
                System.out.println("Number is higher");
            } else if (inputNumber > secretNumber) {
                System.out.println("Number is lower");
            }

            attempts++;

        }while(secretNumber != inputNumber); //secretNumber is not equal inputNumber


        System.out.println("You guessed the number " + attempts + "attempts.");



    }
}
