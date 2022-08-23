package day14_StringMethods;

import java.util.Scanner;

public class HW_khgwrehtg {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a password");
        String signUp = scn.nextLine();


        if (signUp.length() >= 8) {
            System.out.println("Accepted!");
        } else {
            System.out.println("it must have at least 8 character");
            return;
        }

        System.out.println("To login enter your password");
        String logIn = scn.nextLine();
        if (logIn.equals(signUp)) {
            System.out.println("Logged in!");
        } else {
            System.out.println("Wrong one!");
        }

    }
}
