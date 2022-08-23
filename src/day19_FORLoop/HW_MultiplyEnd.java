package day19_FORLoop;

import java.util.Scanner;

public class HW_MultiplyEnd {

    public static void main(String[] args) {
        /*
        Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor word");

        String word = input.nextLine();
        int num = input.nextInt();
        String result = "";

        for(int i = 0; i < num; i++);{
            result += word.charAt(word.length() - 1) + "";
        }
        System.out.println(word + result);



    }
}
