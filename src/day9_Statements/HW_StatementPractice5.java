package day9_Statements;

import java.util.Scanner;

public class HW_StatementPractice5 {
    public static void main(String[] args) {
        /*
        create a char variable letter. Find and print if the character is a letter, number, or special character
	ex: p
		letter
	ex:
		6
		number
	ex:
		$
		speical character
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character, number or letter?");
        char one = in.next().charAt(0);

        if((one >= 'a' && one <= 'z') || (one >= 'A' && one <= 'Z')){
            System.out.println(one + "is letter");
        }

        else if(one >= '0' && one <= '9'){
            System.out.println(one + "is a number");
        }

        else{
            System.out.println(one + "is character");
        }

    }
}
