package day18_WhileLoop7_12;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("Bot is awake");

        while(run){
            System.out.println("Enter your message");
            String msg = input.nextLine();

            switch (msg){
                case"Hello":
                    System.out.println("How are you?");
                    break;
                case"What is your age?":
                    System.out.println("I was programming in July");
                    break;
                case"What do you like":
                    System.out.println("I like java");
                    break;
                default:
                    System.out.println("Sorry,I did not get that");
                    break;
                case"Shutdown":
                    System.out.println("Shutting Down");
                    run = false;

            }
        }
    }
}
