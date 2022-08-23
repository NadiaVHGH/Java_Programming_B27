package day16_StringMethods7_8;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = input.nextLine().toLowerCase();
        System.out.println("Enter your last name");
        String lastname = input.nextLine().toLowerCase();

        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1);

        System.out.println(firstname);
        System.out.println(lastname);







    }
}
