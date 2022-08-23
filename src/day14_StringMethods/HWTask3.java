package day14_StringMethods;

import java.util.Scanner;

public class HWTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String words = "";
        System.out.println("please type the words");
        words = scan.nextLine();
        System.out.println(words.trim());
        System.out.println(words.toLowerCase());
        System.out.println();
        System.out.println(words.length());
    }
}
