package day27_FirstMethod;

import java.util.Scanner;

public class HW_MethodThatAcceptAString {
    public static void chsracter(String str){
        for(int i= 0;i<=str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String name = scan.nextLine();
        chsracter(name);
    }
}
